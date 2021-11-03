package com.example.mvi_architecture.ui.main.viewstate

import com.example.mvi_architecture.data.model.User

sealed class MainState {
    object Idle : MainState()
    object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()
}
