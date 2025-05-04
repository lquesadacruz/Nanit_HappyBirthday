package com.example.nanit_hb.features.connect.ui.logic

sealed interface ConnectionAction {
  data class Connect(val ip: String, val port: Int) : ConnectionAction

  data class SaveConnectionValues(val ip: String, val port: Int) : ConnectionAction

  data object ClearConnectionValues : ConnectionAction

  data object LoadConnectionValues : ConnectionAction

  data class UpdateIp(val ip: String?) : ConnectionAction

  data class UpdatePort(val port: Int?) : ConnectionAction
}
