package com.example.nanit_hb.features.connect.ui

sealed interface ConnectionAction {
  data class OnConnectClicked(val ip: String, val port: Int) : ConnectionAction
}
