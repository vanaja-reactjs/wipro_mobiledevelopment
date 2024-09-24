package com.example.smarthome

import android.health.connect.datatypes.Device
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.smarthome.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainViewModal : ViewModel() {
    private val _devices = MutableLiveData<List<Device>>()
    val devices: LiveData<List<Device>> get() = _devices
    private val _deviceStatus = MutableLiveData<String>()
    val deviceStatus: LiveData<String> get() = _deviceStatus

    fun fetchDevices() {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.apiService.getDevices()
                if (response.isSuccessful) {
                    _devices.value = response.body()
                } else {
                    // Handle API error
                }
            } catch (e: Exception) {
                // Handle network error
            }
        }
    }

    fun controlDevice(command: ControlRequest) {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.apiService.controlDevice(command)
                if (response.isSuccessful) {
                    // Handle successful command execution
                } else {
                    // Handle API error
                }
            } catch (e: Exception) {
                // Handle network error
            }
        }
    }
    suspend fun updateDeviceStatus() {
        withContext(Dispatchers.IO) {
            try {
                val response = RetrofitClient.apiService.getDevices()
                if (response.isSuccessful) {
                    _deviceStatus.postValue("Status updated")
                } else {
                    _deviceStatus.postValue("Failed to update status")
                }
            } catch (e: Exception) {
                _deviceStatus.postValue("Network error")
            }
        }
    }
}

