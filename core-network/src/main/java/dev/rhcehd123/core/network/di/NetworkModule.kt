package dev.rhcehd123.core.network.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.rhcehd123.core.network.GachaSaverNetworkDataSource
import dev.rhcehd123.core.network.RetrofitGachaSaverNetwork

@Module
@InstallIn(SingletonComponent::class)
internal abstract class NetworkModule {
    @Binds
    abstract fun bindsGachaSaverNetworkDataSource(
        gachaSaverNetworkDataSource: RetrofitGachaSaverNetwork
    ): GachaSaverNetworkDataSource
}