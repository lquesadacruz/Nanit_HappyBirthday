package com.example.nanit_hb.features.connect.ui.logic

sealed interface ConnectionAction {
  data class Connect(val ip: String, val port: Int) : ConnectionAction

  data class SaveConnectionValues(val ip: String, val port: Int) : ConnectionAction

  data object ClearConnectionValues : ConnectionAction

  data object LoadConnectionValues : ConnectionAction

  data class SaveIp(val ip: String?) : ConnectionAction

  data class SavePort(val port: Int?) : ConnectionAction
}
