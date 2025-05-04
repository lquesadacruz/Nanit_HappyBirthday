package com.example.nanit_hb.features.showCard.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nanit_hb.R
import com.example.nanit_hb.core.ui.images.LeftSwirls
import com.example.nanit_hb.core.ui.images.LocalImages
import com.example.nanit_hb.core.ui.images.RightSwirls
import com.example.nanit_hb.features.showCard.util.toNumberImageVector

@Composable
fun NameAndAgeContainer(name: String, years: Int, months: Int, modifier: Modifier = Modifier) {
  val context = LocalContext.current
  val showYears = context.resources.getQuantityString(R.plurals.years, years)
  val showMonths = context.resources.getQuantityString(R.plurals.months, months)
  val todaysBirthday = context.getString(R.string.today_s_birthday, name)
  Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Bottom,
      modifier = modifier,
  ) {
    Text(
        todaysBirthday.uppercase(),
        textAlign = TextAlign.Center,
        maxLines = 2,
        softWrap = true,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.width(300.dp),
        color = Color.Black,
    )
    Text(
        stringResource(R.string.is_text).uppercase(),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineLarge,
        color = Color.Black,
    )
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
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
          modifier = Modifier.size(120.dp),
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
        style = MaterialTheme.typography.headlineMedium,
        color = Color.Black,
    )
  }
}

@Preview
@Composable
fun NameAndAgeContainerPreview() {
  NameAndAgeContainer("Cristiano Ronaldo", 0, 1)
}
