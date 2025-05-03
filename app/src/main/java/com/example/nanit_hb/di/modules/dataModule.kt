package com.example.nanit_hb.di.modules

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.nanit_hb.core.data.LocalStorageRepository
import com.example.nanit_hb.core.data.WebSocketClient
import com.example.nanit_hb.core.data.WebSocketConnectionService
import com.example.nanit_hb.core.domain.IConnectionService
import com.example.nanit_hb.core.domain.ILocalStorageRepository
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.websocket.WebSockets
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

private const val USER_PREFERENCES_NAME = "user_preferences"
private val Context.dataStore by preferencesDataStore(name = USER_PREFERENCES_NAME)

val dataModule = module {
  singleOf(::WebSocketConnectionService).bind<IConnectionService>()
  singleOf(::WebSocketClient)
  single<HttpClient> { HttpClient(OkHttp) { install(WebSockets) } }

  singleOf(::LocalStorageRepository).bind<ILocalStorageRepository>()
  single<DataStore<Preferences>> { androidContext().dataStore }
}
