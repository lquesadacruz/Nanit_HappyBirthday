package com.example.nanit_hb.features.showCard.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.nanit_hb.R
import com.example.nanit_hb.core.ui.composables.PulseAnimation
import com.example.nanit_hb.features.showCard.domain.BirthdayCardData
import com.example.nanit_hb.features.showCard.ui.logic.BirthdayCardAction
import com.example.nanit_hb.features.showCard.ui.logic.BirthdayCardState
import com.example.nanit_hb.features.showCard.ui.logic.BirthdayCardViewModel
import com.example.nanit_hb.features.showCard.util.toBorderColorResourceId
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
  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
    Box(Modifier.padding(innerPadding).fillMaxSize(), contentAlignment = Alignment.Center) {
      Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.SpaceAround) {
            Button(
                onClick = { onAction(BirthdayCardAction.SendMessage("HappyBirthday")) },
            ) {
              Text(
                  context.getString(R.string.send_message),
                  maxLines = 2,
                  softWrap = true,
              )
            }
            if (data != null) {
              Card(
                  colors = CardDefaults.cardColors().copy(containerColor = Color.Transparent),
                  border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                  modifier = Modifier.padding(20.dp),
              ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier =
                        Modifier.padding(16.dp)
                            .clickable(
                                onClick = { showCard(data) },
                            ),
                ) {
                  Text(
                      stringResource(
                          R.string.whose_birthday,
                          data.name.uppercase(),
                      ),
                      softWrap = true,
                      textAlign = TextAlign.Center,
                  )
                  PulseAnimation(
                      modifier = Modifier.size(50.dp),
                      childImageVector = data.theme.toButtonImageVector(),
                      childImageContentDescription = data.theme.name,
                      childImageBorderColorResourceId = data.theme.toBorderColorResourceId(),
                  )
                  Text(stringResource(R.string.see))
                }
              }
            }
          }
    }
  }
}
