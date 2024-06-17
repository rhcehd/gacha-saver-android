package dev.rhcehd123.feature.gachahistory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.rhcehd123.core.data.repository.GachaSaverRepository
import dev.rhcehd123.core.model.GachaResult
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class GachaHistoryViewModel @Inject constructor(
    private val gachaSaverRepository: GachaSaverRepository
): ViewModel() {
    val gachaHistoryUiState: StateFlow<GachaHistoryUiState> = gachaSaverRepository
        .getGachaHistory()
        .map { GachaHistoryUiState.Success(it) }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = GachaHistoryUiState.Loading
        )
}

sealed interface GachaHistoryUiState {
    object Loading: GachaHistoryUiState
    data class Success(val history: List<GachaResult>): GachaHistoryUiState
}