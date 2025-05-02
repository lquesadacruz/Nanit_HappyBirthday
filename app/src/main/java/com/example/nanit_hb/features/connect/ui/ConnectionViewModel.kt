package com.example.nanit_hb.features.connect.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nanit_hb.core.domain.ILocalStorageRepository
import com.example.nanit_hb.features.connect.domain.IConnectionService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ConnectionViewModel(
    val connectionService: IConnectionService,
    val localStorage: ILocalStorageRepository
) : ViewModel() {
  private val _state = MutableStateFlow(ConnectionState())
  val state = _state.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), _state.value)

  fun onAction(action: ConnectionAction) {
    when (action) {
      is ConnectionAction.Connect -> tryToConnect(action.ip, action.port)
      is ConnectionAction.SaveConnectionValues -> saveConnectionValues(action.ip, action.port)
      is ConnectionAction.ClearConnectionValues -> clearConnectionValues()
      ConnectionAction.LoadConnectionValues -> loadConnectionValues()
      is ConnectionAction.SaveIp -> updateIp(action.ip)
      is ConnectionAction.SavePort -> updatePort(action.port)
    }
  }

  private fun clearConnectionValues() {
    viewModelScope.launch { localStorage.clearConnectionValues() }
  }

  private fun updatePort(port: Int?) {
    _state.update { it.copy(port = port ?: 0) }
  }

  private fun updateIp(ip: String?) {
    _state.update { it.copy(ip = ip ?: "") }
  }

  private fun loadConnectionValues() {
    viewModelScope.launch {
      _state.update { it.copy(isLoadingData = true) }
      val connectionValues = localStorage.getConnectionValues()
      if (connectionValues != null) {
        _state.update {
          it.copy(
              ip = connectionValues.first, port = connectionValues.second, isLoadingData = false)
        }
      }
    }
  }

  private fun saveConnectionValues(ip: String, port: Int) {
    viewModelScope.launch { localStorage.updateConnectionValues(ip, port) }
  }

  private fun tryToConnect(ip: String, port: Int) {
    _state.update { it.copy(isConnecting = true, hasError = false) }
    viewModelScope.launch {
      val isConnected = connectionService.connect("ws://$ip:$port/nanit")
      _state.update {
        it.copy(isConnecting = false, hasError = !isConnected, isSuccess = isConnected)
      }
    }
  }

  override fun onCleared() {
    viewModelScope.launch { connectionService.close() }
  }
}
