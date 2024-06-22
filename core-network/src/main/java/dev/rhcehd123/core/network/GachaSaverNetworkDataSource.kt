package dev.rhcehd123.core.network

import dev.rhcehd123.core.model.GachaHistory

interface GachaSaverNetworkDataSource {
    suspend fun getGachaHistory(): List<GachaHistory>
}