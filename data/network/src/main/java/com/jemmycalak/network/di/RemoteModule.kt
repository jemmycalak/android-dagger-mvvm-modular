package com.jemmycalak.network.di

import com.jemmycalak.network.api.API
import com.jemmycalak.network.repository.listorderproduct.ListOrderRepository
import com.jemmycalak.network.retrofit.RetrofitConfig
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [
    RetrofitConfig::class
])
class RemoteModule{

    @Provides
    @Singleton
    fun onListOrderRepository(api:API):ListOrderRepository = ListOrderRepository(api)
}