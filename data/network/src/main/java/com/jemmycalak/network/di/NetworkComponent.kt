package com.jemmycalak.network.di

import android.app.Application
import com.jemmycalak.network.api.API
import com.jemmycalak.network.repository.listorderproduct.ListOrderRepository
import com.jemmycalak.network.retrofit.RetrofitConfig
import dagger.Component
import javax.inject.Singleton

@Component(modules=[
    RemoteModule::class,
    RetrofitConfig::class
])
@Singleton
interface NetworkComponent {

    fun inject(app: Application)
    fun getDataManager(): ListOrderRepository
    fun getRetrofit(): API
}