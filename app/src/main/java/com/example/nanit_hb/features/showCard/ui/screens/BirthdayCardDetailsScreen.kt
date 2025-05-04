package com.example.nanit_hb.features.showCard.ui.screens

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nanit_hb.R
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import com.example.nanit_hb.features.showCard.ui.composables.CameraCaptureScreen
import com.example.nanit_hb.features.showCard.ui.composables.CameraContainer
import com.example.nanit_hb.features.showCard.ui.composables.ChoiceDialog
import com.example.nanit_hb.features.showCard.ui.composables.ForegroundContainer
import com.example.nanit_hb.features.showCard.ui.composables.NameAndAgeContainer
import com.example.nanit_hb.features.showCard.ui.composables.NaniTextContainer
import com.example.nanit_hb.features.showCard.ui.composables.PictureContainer
import com.example.nanit_hb.features.showCard.util.toBackgroundColorResourceId
import com.example.nanit_hb.features.showCard.util.toBorderColorResourceId
import com.example.nanit_hb.features.showCard.util.toCameraImageVector
import com.example.nanit_hb.features.showCard.util.toPlaceholderImageVector
import kotlinx.coroutines.launch

@Composable
fun BirthdayCardDetailsScreen(
    name: String,
    years: Int,
    months: Int,
    theme: BirthdayCardTheme,
) {
  var imageUri by rememberSaveable { mutableStateOf<Uri?>(null) }
  var showDialog by remember { mutableStateOf(false) }
  val galleryLauncher =
      rememberLauncherForActivityResult(
          contract = ActivityResultContracts.GetContent(),
      ) { uri: Uri? ->
        imageUri = uri
      }
  var showCamera by remember { mutableStateOf(false) }
  var snackbarHostState = remember { SnackbarHostState() }
  val scope = rememberCoroutineScope()
  val context = LocalContext.current

  Scaffold(
      modifier = Modifier.fillMaxSize(),
      snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
  ) { padding ->
    Box(Modifier.padding(padding).fillMaxSize()) {
      if (showCamera) {
        CameraCaptureScreen(
            onError = {
              showCamera = false
              scope.launch {
                snackbarHostState.showSnackbar(
                    context.getString(R.string.error_could_not_take_photo))
              }
            },
        ) { uri ->
          showCamera = false
          imageUri = uri
        }
      } else {
        ChoiceDialog(
            showDialog = showDialog,
            onDismiss = { showDialog = false },
            onPickCamera = { showCamera = true },
            onPickGallery = { galleryLauncher.launch("image/*") },
        )

        Box(
            contentAlignment = Alignment.Center,
            modifier =
                Modifier.background(Color(theme.toBackgroundColorResourceId())).fillMaxSize(),
        ) {
          NameAndAgeContainer(
              name,
              years,
              months,
              Modifier.align(Alignment.TopCenter).offset(0.dp, 210.dp),
          )
          Box(
              contentAlignment = Alignment.BottomCenter,
              modifier = Modifier.absoluteOffset(0.dp, 100.dp),
          ) {
            PictureContainer(
                imageUri,
                borderColorResourceId = theme.toBorderColorResourceId(),
                placeholderImageVector = theme.toPlaceholderImageVector(),
                Modifier.size(260.dp).align(Alignment.Center).offset(0.dp, 55.dp),
            )

            CameraContainer(
                theme.toCameraImageVector(),
                contentDescription = null,
                Modifier.size(50.dp).align(Alignment.Center).offset(80.dp, (-40).dp),
            ) {
              showDialog = true
            }

            ForegroundContainer(theme)

            NaniTextContainer(
                Modifier.size(70.dp, 30.dp).align(Alignment.Center).offset(0.dp, 190.dp))
          }
        }
      }
    }
  }
}

@Preview(showSystemUi = true)
@Composable
private fun BirthdayCard() {
  BirthdayCardDetailsScreen("Cristiano Ronaldo", 0, 1, BirthdayCardTheme.Pelican)
}
