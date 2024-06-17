package dev.rhcehd123.gachasaver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import dev.rhcehd123.core.designsystem.theme.GachaSaverTheme
import dev.rhcehd123.gachasaver.ui.GachaSaverApp

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GachaSaverTheme {
                GachaSaverApp()
            }
        }
    }
}