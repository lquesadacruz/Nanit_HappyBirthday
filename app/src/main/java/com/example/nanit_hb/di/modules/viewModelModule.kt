package com.example.nanit_hb.di.modules

import com.example.nanit_hb.features.connect.ui.logic.ConnectionViewModel
import com.example.nanit_hb.features.showCard.ui.logic.BirthdayCardViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
  viewModelOf(::ConnectionViewModel)
  viewModelOf(::BirthdayCardViewModel)
}
