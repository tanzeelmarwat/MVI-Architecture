package com.example.mvi_architecture.data.api

import com.example.mvi_architecture.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>
}