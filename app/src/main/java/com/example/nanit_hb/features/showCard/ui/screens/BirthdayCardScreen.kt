package com.example.nanit_hb.features.showCard.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.nanit_hb.R
import com.example.nanit_hb.features.connect.ui.composables.AnimatedImageVectorWithFadeScale
import com.example.nanit_hb.features.showCard.domain.BirthdayCardData
import com.example.nanit_hb.features.showCard.ui.logic.BirthdayCardAction
import com.example.nanit_hb.features.showCard.ui.logic.BirthdayCardState
import com.example.nanit_hb.features.showCard.ui.logic.BirthdayCardViewModel
import com.example.nanit_hb.features.showCard.util.toButtonImageVector
import org.koin.androidx.compose.koinViewModel

@Composable
fun BirthdayCardScreenRoot(
    viewModel: BirthdayCardViewModel = koinViewModel(),
    showCard: (BirthdayCardData) -> Unit
) {
  val state by viewModel.state.collectAsStateWithLifecycle()
  BirthdayCardScreen(state, viewModel::onAction, showCard)
}

@Composable
private fun BirthdayCardScreen(
    state: BirthdayCardState,
    onAction: (BirthdayCardAction) -> Unit,
    showCard: (BirthdayCardData) -> Unit
) {
  val context = LocalContext.current
  val data = state.data
  var trigger by remember { mutableIntStateOf(0) }
  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
    Box(Modifier.padding(innerPadding).fillMaxSize(), contentAlignment = Alignment.Center) {
      Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center) {
            Button(onClick = { onAction(BirthdayCardAction.SendMessage("HappyBirthday")) }) {
              Text(context.getString(R.string.send_message))
            }
            if (data != null) {
              AnimatedImageVectorWithFadeScale(
                  imageVector = data.theme.toButtonImageVector(),
                  contentDescription = data.theme.name,
                  Modifier.clickable(
                          onClick = {
                            trigger++
                            showCard(data)
                          },
                      )
                      .size(50.dp),
                  triggerKey = trigger,
              )
            }
          }
    }
  }
}
