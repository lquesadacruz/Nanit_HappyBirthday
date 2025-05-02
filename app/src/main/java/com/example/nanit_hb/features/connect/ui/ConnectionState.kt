package com.example.nanit_hb.features.connect.ui

data class ConnectionState(
    val ip: String = "",
    val port: Int = 0,
    val isSuccess: Boolean = false,
    val isConnecting: Boolean = false,
    val isLoadingData: Boolean = true,
    val hasError: Boolean = false
)
