package com.example.nanit_hb.features.showCard.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.nanit_hb.core.ui.images.LeftSwirls
import com.example.nanit_hb.core.ui.images.LocalImages
import com.example.nanit_hb.core.ui.images.RightSwirls
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import com.example.nanit_hb.features.showCard.util.toForegroundResourceId
import com.example.nanit_hb.features.showCard.util.toLargeImageVector
import com.example.nanit_hb.features.showCard.util.toNumberImageVector

@Composable
fun BirthdayCardDetailsScreen(name: String, years: Int, months: Int, theme: BirthdayCardTheme) {
  Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
      Text(
          "TODAY ${name.uppercase()} IS",
          textAlign = TextAlign.Center,
          maxLines = 2,
          softWrap = true,
          style = MaterialTheme.typography.headlineLarge)
      Row(
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.Center) {
            Image(
                imageVector = LocalImages.LeftSwirls,
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier.size(80.dp),
            )
            Image(
                imageVector = (if (years > 0) years else months).toNumberImageVector()!!,
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier.size(120.dp),
            )
            Image(
                imageVector = LocalImages.RightSwirls,
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier.size(80.dp),
            )
          }
      Text(
          "${if (years > 0) "YEARS" else "MONTHS"} OLD!",
          textAlign = TextAlign.Center,
          style = MaterialTheme.typography.headlineMedium)
      Image(
          imageVector = theme.toLargeImageVector(),
          contentDescription = null,
          contentScale = ContentScale.Crop,
          modifier = Modifier.size(300.dp),
      )
    }

    Box(modifier = Modifier.align(Alignment.Center)) {
      Image(
          painter = painterResource(id = theme.toForegroundResourceId()),
          contentDescription = null,
          contentScale = ContentScale.Crop,
          modifier = Modifier.fillMaxSize(),
      )
    }
  }
}
