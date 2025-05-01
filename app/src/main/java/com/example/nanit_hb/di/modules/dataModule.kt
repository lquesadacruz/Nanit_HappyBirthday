package com.example.nanit_hb.di.modules

import com.example.nanit_hb.features.connect.data.WebSocketClient
import com.example.nanit_hb.features.connect.data.WebSocketConnectionService
import com.example.nanit_hb.features.connect.domain.IConnectionService
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.websocket.WebSockets
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataModule = module {
  singleOf(::WebSocketConnectionService).bind<IConnectionService>()
  singleOf(::WebSocketClient)
  single<HttpClient> { HttpClient(OkHttp) { install(WebSockets) } }
}
