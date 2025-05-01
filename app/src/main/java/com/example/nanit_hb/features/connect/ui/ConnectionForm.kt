package com.example.nanit_hb.features.connect.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import java.util.regex.Pattern

@Composable
fun ConnectionForm(
    ip: String,
    port: String,
    isLoading: Boolean,
    onConnect: (String, Int) -> Unit,
) {
  LocalContext.current
  rememberCoroutineScope()

  var ipText by remember { mutableStateOf(TextFieldValue(ip)) }
  var portText by remember { mutableStateOf(TextFieldValue(port)) }
  var ipError by remember { mutableStateOf<String?>(null) }
  var portError by remember { mutableStateOf<String?>(null) }

  val isValidIp: (String) -> Boolean = {
    val ipPattern =
        Pattern.compile(
            "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$")
    ipPattern.matcher(it).matches()
  }

  val isValidPort: (String) -> Boolean = {
    it.toIntOrNull()?.let { port -> port in 1..65535 } == true
  }

  Card(Modifier.padding(20.dp)) {
    Column(modifier = Modifier.padding(16.dp)) {
      Text("These fields are required to connect:")
      OutlinedTextField(
          enabled = !isLoading,
          value = ipText,
          onValueChange = {
            ipText = it
            ipError = null
          },
          label = { Text("IP Address") },
          isError = ipError != null,
          modifier = Modifier.fillMaxWidth())
      if (ipError != null) {
        Text(
            ipError ?: "",
            color = MaterialTheme.colorScheme.error,
            style = MaterialTheme.typography.labelSmall)
      }

      Spacer(modifier = Modifier.height(8.dp))

      OutlinedTextField(
          enabled = !isLoading,
          value = portText,
          onValueChange = {
            portText = it
            portError = null
          },
          label = { Text("Port") },
          isError = portError != null,
          modifier = Modifier.fillMaxWidth())
      if (portError != null) {
        Text(
            portError ?: "",
            color = MaterialTheme.colorScheme.error,
            style = MaterialTheme.typography.labelSmall)
      }

      Spacer(modifier = Modifier.height(16.dp))

      Button(
          enabled = !isLoading,
          onClick = {
            val ip = ipText.text.trim()
            val port = portText.text.trim()

            var hasError = false

            if (!isValidIp(ip)) {
              ipError = "Invalid IP address"
              hasError = true
            }
            if (!isValidPort(port)) {
              portError = "Port must be between 1 and 65535"
              hasError = true
            }

            if (!hasError) {
              onConnect(ip, port.toInt())
            }
          },
          modifier = Modifier.fillMaxWidth()) {
            if (isLoading) {
              Row(
                  verticalAlignment = Alignment.CenterVertically,
                  horizontalArrangement = Arrangement.SpaceAround,
              ) {
                Text("Connecting")
                Box(Modifier.width(5.dp))
                CircularProgressIndicator(Modifier.size(24.dp))
              }
            } else Text("Connect")
          }
    }
  }
}
