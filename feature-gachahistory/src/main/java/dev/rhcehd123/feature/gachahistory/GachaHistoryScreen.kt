package dev.rhcehd123.feature.gachahistory

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dev.rhcehd123.core.designsystem.theme.GachaSaverTheme

@Composable
fun GachaHistoryScreen(
    viewModel: GachaHistoryViewModel = hiltViewModel(),
) {
    val uiState by viewModel.gachaHistoryUiState.collectAsStateWithLifecycle()
    GachaHistoryScreen(
        uiState = uiState
    )
}

@Composable
private fun GachaHistoryScreen(
    uiState: GachaHistoryUiState
) {
    when(uiState) {
        is GachaHistoryUiState.Success -> SuccessScreen(uiState = uiState)
        is GachaHistoryUiState.Loading -> LoadingScreen()
    }
}

@Composable
private fun LoadingScreen() {

}

@Composable
private fun SuccessScreen(
    uiState: GachaHistoryUiState.Success
) {
    Column {
        Text(text = "GachaSaver - Sample Game")
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            modifier = Modifier.fillMaxWidth(0.9f)
        ) {
            item {
                GachaHistoryColumn(isHeader = true)
            }
            items(uiState.history) {
                GachaHistoryColumn(
                    name = it.gachaItem.name,
                    rate = "${it.gachaItem.rate}%",
                )
            }
        }
    }
}

@Composable
private fun GachaHistoryColumn(
    title: String = "",
    name: String = "",
    rate: String = "",
    isHeader: Boolean = false,
) {
    Row {
        Text(
            modifier = Modifier.weight(1f),
            text = if(isHeader) {
                "종류"
            } else {
                title
            }
        )
        Text(
            modifier = Modifier.weight(1f),
            text = if(isHeader) {
                "이름"
            } else {
                name
            }
        )
        Text(
            modifier = Modifier.weight(1f),
            text = if(isHeader) {
                "확률"
            } else {
                rate
            }
        )
    }
}

@Composable
@Preview(apiLevel = 33)
private fun GachaHistoryLoadingScreenPreview() {
    GachaSaverTheme {
        LoadingScreen()
    }
}

@Composable
@Preview(apiLevel = 33)
private fun GachaHistorySuccessScreenPreview() {
    GachaSaverTheme {
        SuccessScreen(
            uiState = GachaHistoryUiState
                .Success(
                    listOf(

                    )
                )
        )
    }
}