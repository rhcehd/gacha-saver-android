package dev.rhcehd123.gachasaver.core.data.repository

import dev.rhcehd123.gachasaver.core.model.GachaHistory
import kotlinx.coroutines.flow.Flow

interface GachaSaverRepository {
    fun login(): Unit
    fun getGachaHistory(): Flow<List<GachaHistory>>
}