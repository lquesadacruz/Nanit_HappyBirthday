package com.example.nanit_hb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nanit_hb.core.ui.theme.Nanit_HappyBirthdayTheme
import com.example.nanit_hb.features.connect.ui.ConnectionScreenRoot
import com.example.nanit_hb.features.showCard.ui.BirthdayCardScreenRoot

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      Nanit_HappyBirthdayTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = Route.Connect) {
          composable<Route.Connect> {
            ConnectionScreenRoot { navController.navigate(Route.BirthdayCard) }
          }
          composable<Route.BirthdayCard> { BirthdayCardScreenRoot() }
        }
      }
    }
  }
}
