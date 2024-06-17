package dev.rhcehd123.core.network

import dev.rhcehd123.core.model.GachaResult

interface GachaSaverNetworkDataSource {
    suspend fun getGachaHistory(): List<GachaResult>
}