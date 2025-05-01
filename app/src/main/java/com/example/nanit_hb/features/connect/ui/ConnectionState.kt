package com.example.nanit_hb.features.connect.ui

data class ConnectionState(
    val ip: String = "",
    val port: Int = 0,
    val isSuccess: Boolean = false,
    val isLoading: Boolean = false,
    val hasError: Boolean = false
)
