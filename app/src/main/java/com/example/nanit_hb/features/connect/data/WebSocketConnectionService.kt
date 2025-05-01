package com.example.nanit_hb.features.connect.data

import com.example.nanit_hb.features.connect.domain.IConnectionService

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
}
