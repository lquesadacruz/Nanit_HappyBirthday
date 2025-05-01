package com.example.nanit_hb.features.connect.data

import io.ktor.client.HttpClient
import io.ktor.client.plugins.websocket.webSocketSession
import io.ktor.websocket.Frame
import io.ktor.websocket.WebSocketSession
import io.ktor.websocket.close
import io.ktor.websocket.readText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class WebSocketClient(val client: HttpClient) {
  private var session: WebSocketSession? = null
  private var receiveJob: Job? = null

  private val _messages = MutableSharedFlow<String>(extraBufferCapacity = 64)
  val messages: SharedFlow<String> = _messages.asSharedFlow()

  suspend fun connect(url: String) {
    if (session?.isActive == true) return // Already connected

    session = client.webSocketSession(urlString = url)

    if (isConnected()) {
      startReceiving()
    } else {
      throw IllegalStateException("WebSocket failed to connect")
    }
  }

  private fun startReceiving() {
    receiveJob =
        CoroutineScope(Dispatchers.IO).launch {
          try {
            session?.incoming?.consumeEach { frame ->
              if (frame is Frame.Text) {
                _messages.emit(frame.readText())
              }
            }
          } catch (e: Exception) {
            println("WebSocket receive error: ${e.message}")
          }
        }
  }

  suspend fun send(text: String) {
    session?.send(Frame.Text(text))
  }

  suspend fun disconnect() {
    receiveJob?.cancel()
    session?.close()
    session = null
  }

  fun isConnected(): Boolean = session?.isActive == true
}
