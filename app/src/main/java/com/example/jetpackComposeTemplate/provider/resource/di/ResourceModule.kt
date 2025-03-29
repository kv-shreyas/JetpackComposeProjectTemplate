package com.example.jetpackComposeTemplate.provider.resource.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import android.content.Context
import com.example.jetpackComposeTemplate.provider.resource.ResourceProvider
import com.example.jetpackComposeTemplate.provider.resource.ResourceProviderImpl
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ResourceModule {
    @Provides
    fun provideResourceProvider(@ApplicationContext context: Context): ResourceProvider {
        return ResourceProviderImpl(context)
    }
}
