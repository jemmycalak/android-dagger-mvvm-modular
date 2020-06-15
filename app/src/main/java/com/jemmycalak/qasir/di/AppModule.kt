package com.jemmycalak.qasir.di

import android.content.Context
import com.jemmycalak.network.di.RemoteModule
import com.jemmycalak.network.retrofit.RetrofitConfig
import com.jemmycalak.qasir.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @AppScope
    fun provideContext(app:App): Context = app

}