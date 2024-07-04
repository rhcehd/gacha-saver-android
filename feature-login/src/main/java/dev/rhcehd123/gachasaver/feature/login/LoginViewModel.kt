package dev.rhcehd123.gachasaver.feature.login

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.rhcehd123.gachasaver.core.data.repository.GachaSaverRepository
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val gachaSaverRepository: GachaSaverRepository,
): ViewModel() {
    fun onClickLogin(id: String, password: String) {
        gachaSaverRepository.login()
    }
}