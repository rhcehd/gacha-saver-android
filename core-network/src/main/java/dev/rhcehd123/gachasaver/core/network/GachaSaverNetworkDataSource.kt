package dev.rhcehd123.gachasaver.core.network

import dev.rhcehd123.gachasaver.core.model.GachaHistory

interface GachaSaverNetworkDataSource {
    suspend fun getGachaHistory(): List<GachaHistory>
}