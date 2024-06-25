package dev.rhcehd123.gachasaver.core.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.rhcehd123.gachasaver.core.data.repository.GachaSaverRepository
import dev.rhcehd123.gachasaver.core.data.repository.impl.GachaSaverRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {

    @Binds
    abstract fun bindsGachaSaverRepository(
        gachaSaverRepository: GachaSaverRepositoryImpl
    ): GachaSaverRepository
}