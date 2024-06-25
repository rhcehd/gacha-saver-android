package dev.rhcehd123.gachasaver.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import dev.rhcehd123.gachasaver.feature.gachahistory.GachaHistoryScreen

object GachaSaverScreens {
    const val GachaHistory = "GachaHistory"
}

fun NavGraphBuilder.GachaSaverNavigation(

) {
    composable(route = GachaSaverScreens.GachaHistory) {
        GachaHistoryScreen()
    }
}