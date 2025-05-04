package com.example.nanit_hb

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.nanit_hb.core.ui.theme.Nanit_HappyBirthdayTheme
import com.example.nanit_hb.features.connect.ui.ConnectionScreenRoot
import com.example.nanit_hb.features.showCard.ui.screens.BirthdayCardDetailsScreen
import com.example.nanit_hb.features.showCard.ui.screens.BirthdayCardScreenRoot

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    installSplashScreen()
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    if (!hasRequiredPermissions()) {
      ActivityCompat.requestPermissions(this, CAMERAX_PERMISSIONS, 0)
    }
    setContent {
      Nanit_HappyBirthdayTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = Route.Connect) {
          composable<Route.Connect> {
            ConnectionScreenRoot { navController.navigate(Route.BirthdayCard) }
          }
          composable<Route.BirthdayCard> {
            BirthdayCardScreenRoot { data ->
              navController.navigate(
                  Route.BirthdayCardDetails(data.name, data.years, data.months, data.theme))
            }
          }
          composable<Route.BirthdayCardDetails> { backStackEntry ->
            val route = backStackEntry.toRoute<Route.BirthdayCardDetails>()
            BirthdayCardDetailsScreen(route.name, route.years, route.months, route.theme)
          }
        }
      }
    }
  }

  private fun hasRequiredPermissions(): Boolean {
    return CAMERAX_PERMISSIONS.all {
      ContextCompat.checkSelfPermission(applicationContext, it) == PackageManager.PERMISSION_GRANTED
    }
  }

  companion object {
    private val CAMERAX_PERMISSIONS =
        arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
        )
  }
}
