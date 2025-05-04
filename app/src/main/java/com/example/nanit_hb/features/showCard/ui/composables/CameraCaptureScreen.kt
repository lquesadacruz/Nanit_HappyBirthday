package com.example.nanit_hb.features.showCard.ui.composables

import android.Manifest
import android.content.pm.PackageManager
import android.net.Uri
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.example.nanit_hb.R
import java.io.File

@Composable
fun CameraCaptureScreen(onError: () -> Unit = {}, onPhotoTaken: (Uri?) -> Unit = {}) {
  val context = LocalContext.current
  val lifecycleOwner = LocalLifecycleOwner.current

  var hasPermission by remember {
    mutableStateOf(
        ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) ==
            PackageManager.PERMISSION_GRANTED)
  }

  val launcher =
      rememberLauncherForActivityResult(
          ActivityResultContracts.RequestPermission(),
      ) { granted ->
        hasPermission = granted
      }

  LaunchedEffect(Unit) {
    if (!hasPermission) {
      launcher.launch(Manifest.permission.CAMERA)
    }
  }

  if (hasPermission) {
    var imageCapture: ImageCapture? = remember { null }

    Box(Modifier.fillMaxSize()) {
      AndroidView(
          factory = { ctx ->
            val previewView = PreviewView(ctx)

            val cameraProviderFuture = ProcessCameraProvider.getInstance(ctx)
            cameraProviderFuture.addListener(
                {
                  val cameraProvider = cameraProviderFuture.get()

                  val preview =
                      Preview.Builder().build().also {
                        it.surfaceProvider = previewView.surfaceProvider
                      }

                  imageCapture = ImageCapture.Builder().build()

                  val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

                  try {
                    cameraProvider.unbindAll()
                    cameraProvider.bindToLifecycle(
                        lifecycleOwner, cameraSelector, preview, imageCapture)
                  } catch (e: Exception) {
                    e.printStackTrace()
                  }
                },
                ContextCompat.getMainExecutor(ctx),
            )

            previewView
          },
          modifier = Modifier.fillMaxSize(),
      )

      Button(
          onClick = {
            val file = File(context.cacheDir, "photo_${System.currentTimeMillis()}.jpg")
            val outputOptions = ImageCapture.OutputFileOptions.Builder(file).build()

            try {
              imageCapture?.takePicture(
                  outputOptions,
                  ContextCompat.getMainExecutor(context),
                  object : ImageCapture.OnImageSavedCallback {
                    override fun onImageSaved(outputFileResults: ImageCapture.OutputFileResults) {
                      onPhotoTaken(
                          Uri.fromFile(file),
                      )
                    }

                    override fun onError(exception: ImageCaptureException) {
                      Log.e("CameraX", "Capture failed: ${exception.message}")
                      onError()
                    }
                  }) ?: onError()
            } catch (ex: Exception) {
              print(ex)
              onError()
            }
          },
          modifier = Modifier.align(Alignment.BottomCenter).padding(16.dp),
      ) {
        Text(stringResource(R.string.take_photo))
      }
    }
  }
}
