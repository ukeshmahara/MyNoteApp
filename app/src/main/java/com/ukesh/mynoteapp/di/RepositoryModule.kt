package com.ukesh.mynoteapp.di

import com.ukesh.mynoteapp.data.repository.AuthRepository
import com.ukesh.mynoteapp.data.repository.RemoteDataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(): AuthRepository {
        return AuthRepository()
    }

    @Provides
    @Singleton
    fun provideRemoteDataRepository():
            RemoteDataRepository = RemoteDataRepository()
}