package com.example.nanit_hb.di

import com.example.nanit_hb.di.modules.dataModule
import com.example.nanit_hb.di.modules.viewModelModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
  startKoin {
    config?.invoke(this)
    modules(dataModule, viewModelModule)
  }
}
