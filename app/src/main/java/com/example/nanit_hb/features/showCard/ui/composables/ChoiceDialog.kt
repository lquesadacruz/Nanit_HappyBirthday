package com.example.nanit_hb.features.showCard.ui.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nanit_hb.R

@Composable
fun ChoiceDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit = {},
    onPickCamera: () -> Unit = {},
    onPickGallery: () -> Unit = {}
) {
  AnimatedVisibility(showDialog) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.choose_image_source)) },
        text = { Text(stringResource(R.string.pick_an_option_to_add_an_image)) },
        confirmButton = {
          TextButton(
              onClick = {
                onPickCamera()
                onDismiss()
              },
          ) {
            Text(stringResource(R.string.camera))
          }
        },
        dismissButton = {
          TextButton(
              onClick = {
                onPickGallery()
                onDismiss()
              },
          ) {
            Text(stringResource(R.string.gallery))
          }
        },
    )
  }
}

@Preview
@Composable
fun ChoiceDialogPreview() {
  ChoiceDialog(true)
}
