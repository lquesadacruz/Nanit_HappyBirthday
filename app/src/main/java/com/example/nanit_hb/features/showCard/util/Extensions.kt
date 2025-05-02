package com.example.nanit_hb.features.showCard.util

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.nanit_hb.R
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

fun BirthdayCardTheme.toDrawableResourceId(): Int {
  return when (this) {
    BirthdayCardTheme.Fox -> R.drawable.bg_fox
    BirthdayCardTheme.Elephant -> R.drawable.bg_elephant
    BirthdayCardTheme.Pelican -> R.drawable.bg_pelican
  }
}
