package com.example.mvi_architecture.data.api

import com.example.mvi_architecture.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}