package com.example.smarthome

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.smarthome.network.RetrofitClient

class SyncWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    override fun doWork(): Result {
        return try {
            // Perform network operation to sync device states
            val response = RetrofitClient.apiService.getDevices()
            if (response.isSuccessful) {
                // Process response
                Result.success()
            } else {
                Result.retry()
            }
        } catch (e: Exception) {
            Result.retry()
        }
    }
}