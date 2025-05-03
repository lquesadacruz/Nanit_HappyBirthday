package com.example.nanit_hb.features.showCard.util

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.nanit_hb.R
import com.example.nanit_hb.core.ui.images.CameraElephant
import com.example.nanit_hb.core.ui.images.CameraFox
import com.example.nanit_hb.core.ui.images.CameraPelican
import com.example.nanit_hb.core.ui.images.LargeElephant
import com.example.nanit_hb.core.ui.images.LargeFox
import com.example.nanit_hb.core.ui.images.LargePelican
import com.example.nanit_hb.core.ui.images.LocalImages
import com.example.nanit_hb.core.ui.images.SmallElephant
import com.example.nanit_hb.core.ui.images.SmallFox
import com.example.nanit_hb.core.ui.images.SmallPelican
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme

fun BirthdayCardTheme.toSmallImageVector(): ImageVector {
  return when (this) {
    BirthdayCardTheme.Fox -> LocalImages.SmallFox
    BirthdayCardTheme.Elephant -> LocalImages.SmallElephant
    BirthdayCardTheme.Pelican -> LocalImages.SmallPelican
  }
}

fun BirthdayCardTheme.toForegroundResourceId(): Int {
  return when (this) {
    BirthdayCardTheme.Fox -> R.drawable.bg_fox
    BirthdayCardTheme.Elephant -> R.drawable.bg_elephant
    BirthdayCardTheme.Pelican -> R.drawable.bg_pelican
  }
}

fun BirthdayCardTheme.toLargeImageVector(): ImageVector {
  return when (this) {
    BirthdayCardTheme.Fox -> LocalImages.LargeFox
    BirthdayCardTheme.Elephant -> LocalImages.LargeElephant
    BirthdayCardTheme.Pelican -> LocalImages.LargePelican
  }
}

fun Int.toNumberImageVector(): ImageVector? = LocalImages.numbers[this]

fun BirthdayCardTheme.toBackgroundColor(): String {
  return when (this) {
    BirthdayCardTheme.Fox -> "#C5E8DF"
    BirthdayCardTheme.Elephant -> "#FEEFCB"
    BirthdayCardTheme.Pelican -> "#DAF1F6"
  }
}

fun BirthdayCardTheme.toCameraImageVector(): ImageVector {
  return when (this) {
    BirthdayCardTheme.Fox -> LocalImages.CameraFox
    BirthdayCardTheme.Elephant -> LocalImages.CameraElephant
    BirthdayCardTheme.Pelican -> LocalImages.CameraPelican
  }
}
