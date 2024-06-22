package dev.rhcehd123.core.data.repository

import dev.rhcehd123.core.model.GachaHistory
import kotlinx.coroutines.flow.Flow

interface GachaSaverRepository {
    fun getGachaHistory(): Flow<List<GachaHistory>>
}