package com.example.nanit_hb.features.showCard.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.koinViewModel

@Composable
fun BirthdayCardScreenRoot(viewModel: BirthdayCardViewModel = koinViewModel()) {
  val state by viewModel.state.collectAsStateWithLifecycle()
  BirthdayCardScreen(state, viewModel::onAction)
}

@Composable
private fun BirthdayCardScreen(state: BirthdayCardState, onAction: (BirthdayCardAction) -> Unit) {
  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
    Box(Modifier.padding(innerPadding).fillMaxSize(), contentAlignment = Alignment.Center) {
      Text("Birthday Card")
    }
  }
}
