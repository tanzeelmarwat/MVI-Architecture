package com.example.mvi_architecture.data.api

import com.example.mvi_architecture.data.model.User

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}