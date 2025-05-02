package com.example.nanit_hb.features.connect.domain

import kotlinx.coroutines.flow.SharedFlow

interface IConnectionService {

  suspend fun connect(url: String): Boolean

  suspend fun sendMessage(msg: String)

  suspend fun close()

  val messages: SharedFlow<String>
}
