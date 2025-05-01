package com.example.nanit_hb.features.connect.domain

interface IConnectionService {

  suspend fun connect(url: String): Boolean

  suspend fun sendMessage(msg: String)

  suspend fun close()
}
