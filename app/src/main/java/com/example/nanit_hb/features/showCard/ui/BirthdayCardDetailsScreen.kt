package com.example.nanit_hb.features.showCard.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import com.example.nanit_hb.R
import com.example.nanit_hb.core.ui.images.LeftSwirls
import com.example.nanit_hb.core.ui.images.LocalImages
import com.example.nanit_hb.core.ui.images.RightSwirls
import com.example.nanit_hb.features.showCard.domain.BirthdayCardTheme
import com.example.nanit_hb.features.showCard.util.toBackgroundColor
import com.example.nanit_hb.features.showCard.util.toCameraImageVector
import com.example.nanit_hb.features.showCard.util.toForegroundResourceId
import com.example.nanit_hb.features.showCard.util.toLargeImageVector
import com.example.nanit_hb.features.showCard.util.toNumberImageVector

@Composable
fun BirthdayCardDetailsScreen(name: String, years: Int, months: Int, theme: BirthdayCardTheme) {
  val context = LocalContext.current
  val showYears = context.resources.getQuantityString(R.plurals.years, years)
  val showMonths = context.resources.getQuantityString(R.plurals.months, months)
  val todaysBirthday = context.getString(R.string.today_s_birthday, name)

  Box(
      contentAlignment = Alignment.Center,
      modifier = Modifier.background(Color(theme.toBackgroundColor().toColorInt())).fillMaxSize(),
  ) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.align(Alignment.TopCenter).offset(0.dp, 210.dp),
    ) {
      Text(
          todaysBirthday.uppercase(),
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
                modifier = Modifier.size(60.dp),
            )
            Image(
                imageVector = (if (years > 0) years else months).toNumberImageVector()!!,
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier.size(100.dp),
            )
            Image(
                imageVector = LocalImages.RightSwirls,
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier.size(60.dp),
            )
          }
      Text(
          (if (years > 0) showYears else showMonths).uppercase(),
          textAlign = TextAlign.Center,
          style = MaterialTheme.typography.headlineMedium)
    }

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.absoluteOffset(0.dp, 100.dp),
    ) {
      // center face
      Image(
          imageVector = theme.toLargeImageVector(),
          contentDescription = null,
          modifier = Modifier.size(260.dp).align(Alignment.Center).offset(0.dp, 55.dp),
      )

      // camera
      Image(
          imageVector = theme.toCameraImageVector(),
          contentDescription = null,
          modifier =
              Modifier.size(50.dp)
                  .align(Alignment.Center)
                  .offset(80.dp, (-40).dp)
                  .clickable(
                      onClick = {},
                  ),
      )

      // foreground
      Image(
          painter = painterResource(id = theme.toForegroundResourceId()),
          contentDescription = null,
          modifier = Modifier.fillMaxSize(),
      )

      // nanit text
      Image(
          painter = painterResource(R.drawable.nanit),
          contentDescription = stringResource(R.string.nanit),
          modifier = Modifier.size(70.dp, 30.dp).align(Alignment.Center).offset(0.dp, 190.dp),
      )
    }
  }
}

@Preview(showSystemUi = true)
@Composable
private fun BirthdayCard() {
  BirthdayCardDetailsScreen("Cristiano Ronaldo", 0, 1, BirthdayCardTheme.Pelican)
}
