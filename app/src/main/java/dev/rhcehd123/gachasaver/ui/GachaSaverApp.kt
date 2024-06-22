package dev.rhcehd123.gachasaver.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dev.rhcehd123.gachasaver.navigation.GachaSaverNavHost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GachaSaverApp() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Gacha Saver") }
            )
        }
    ) { paddingValues ->
        GachaSaverNavHost(
            modifier = Modifier.padding(paddingValues),
            navHostController = navController
        )
    }
}