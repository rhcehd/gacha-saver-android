package dev.rhcehd123.core.data.repository.impl

import dev.rhcehd123.core.data.repository.GachaSaverRepository
import dev.rhcehd123.core.model.GachaResult
import dev.rhcehd123.core.network.GachaSaverNetworkDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GachaSaverRepositoryImpl @Inject constructor(
    private val gachaSaverNetworkDataSource: GachaSaverNetworkDataSource
): GachaSaverRepository {
    override fun getGachaHistory(): Flow<List<GachaResult>> {
        return flow {
            emit(
                try {
                    gachaSaverNetworkDataSource
                        .getGachaHistory()
                } catch (e: Exception) {
                    e.printStackTrace()
                    emptyList()
                }
            )
        }.flowOn(Dispatchers.IO)
    }
}