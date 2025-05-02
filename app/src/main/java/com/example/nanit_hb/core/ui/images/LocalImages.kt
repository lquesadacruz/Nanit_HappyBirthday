package com.example.nanit_hb.core.ui.images

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme

object LocalImages

fun BirthdayCardTheme.toSmallImageVector(): ImageVector {
  return when (this) {
    BirthdayCardTheme.Fox -> LocalImages.SmallFox
    BirthdayCardTheme.Elephant -> LocalImages.SmallElephant
    BirthdayCardTheme.Pelican -> LocalImages.SmallPelican
  }
}
