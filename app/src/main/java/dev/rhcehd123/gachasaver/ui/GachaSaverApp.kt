package dev.rhcehd123.gachasaver.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dev.rhcehd123.gachasaver.navigation.GachaSaverNavHost

@Composable
fun GachaSaverApp() {
    val navController = rememberNavController()
    Scaffold { paddingValues ->
        GachaSaverNavHost(
            modifier = Modifier.padding(paddingValues),
            navHostController = navController
        )
    }
}