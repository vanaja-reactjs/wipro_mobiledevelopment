package com.example.smarthome

import android.health.connect.datatypes.Device
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("devices")
    suspend fun getDevices(): Response<List<Device>>

    @POST("control")
    suspend fun controlDevice(@Body controlRequest: ControlRequest): Response<Unit>
}