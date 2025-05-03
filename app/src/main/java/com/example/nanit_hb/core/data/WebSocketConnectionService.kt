package com.example.nanit_hb.core.data

import com.example.nanit_hb.core.domain.IConnectionService
import kotlinx.coroutines.flow.SharedFlow

class WebSocketConnectionService(val webSocketClient: WebSocketClient) : IConnectionService {

  override suspend fun connect(url: String): Boolean =
      try {
        webSocketClient.connect(url)
        true
      } catch (ex: Exception) {
        print("Exception $ex")
        false
      }

  override suspend fun sendMessage(msg: String) = webSocketClient.send(msg)

  override suspend fun close() = webSocketClient.disconnect()

  override val messages: SharedFlow<String> = webSocketClient.messages
}
