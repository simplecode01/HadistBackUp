package com.simplecode01.hadistfull.di

import com.google.gson.Gson
import com.simplecode01.hadistfull.api.data.HadistAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideHadithAPI(): HadistAPI{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .baseUrl("https://api.carihadis.com/")
            .build()
            .create(HadistAPI:: class.java)
    }
}