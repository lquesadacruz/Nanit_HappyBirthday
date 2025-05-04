package com.example.nanit_hb.features.connect.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.nanit_hb.R
import com.example.nanit_hb.features.connect.ui.composables.ConnectionForm
import com.example.nanit_hb.features.connect.ui.logic.ConnectionAction
import com.example.nanit_hb.features.connect.ui.logic.ConnectionState
import com.example.nanit_hb.features.connect.ui.logic.ConnectionViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun ConnectionScreenRoot(viewModel: ConnectionViewModel = koinViewModel(), goForward: () -> Unit) {
  val state by viewModel.state.collectAsStateWithLifecycle()
  ConnectionScreen(state, viewModel::onAction, goForward)
}

@Composable
private fun ConnectionScreen(
    state: ConnectionState,
    onAction: (ConnectionAction) -> Unit,
    goForward: () -> Unit
) {
  var snackbarHostState = remember { SnackbarHostState() }
  val context = LocalContext.current
  LaunchedEffect(true) { onAction(ConnectionAction.LoadConnectionValues) }
  Scaffold(
      modifier = Modifier.fillMaxSize(),
      snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
  ) { innerPadding ->
    Box(Modifier.padding(innerPadding).fillMaxSize(), contentAlignment = Alignment.Center) {
      LaunchedEffect(state.isConnecting, state.isSuccess) {
        if (!state.isConnecting && state.isSuccess) {
          goForward()
        }
      }
      LaunchedEffect(state.hasError) {
        if (state.hasError) {
          snackbarHostState.showSnackbar(context.getString(R.string.error_no_connection))
        }
      }
      ConnectionForm(
          state.ip,
          state.port.toString(),
          state.isConnecting,
          onIpChanged = { ip -> onAction(ConnectionAction.SaveIp(ip)) },
          onPortChanged = { port -> onAction(ConnectionAction.SavePort(port)) },
          onConnect = { ip, port, shouldSave ->
            onAction(ConnectionAction.Connect(ip, port))
            if (shouldSave) {
              onAction(ConnectionAction.SaveConnectionValues(ip, port))
            } else {
              onAction(ConnectionAction.ClearConnectionValues)
            }
          },
      )
    }
  }
}
