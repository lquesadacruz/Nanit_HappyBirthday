package com.example.nanit_hb

import android.app.Application
import com.example.nanit_hb.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class NanitApplication : Application() {
  override fun onCreate() {
    super.onCreate()

    initKoin {
      androidLogger()
      androidContext(this@NanitApplication)
    }
  }
}
