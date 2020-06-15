package com.jemmycalak.qasir

import android.app.Application
import com.jemmycalak.network.NetworkProvider
import com.jemmycalak.network.di.DaggerNetworkComponent
import com.jemmycalak.network.di.NetworkComponent
import com.jemmycalak.network.di.RemoteModule
import com.jemmycalak.network.retrofit.RetrofitConfig
import com.jemmycalak.product.ListOrderProvider
import com.jemmycalak.product.di.DaggerListOrderComponent
import com.jemmycalak.product.di.ListOrderComponent
import com.jemmycalak.qasir.di.AppComponent
import com.jemmycalak.qasir.di.AppProvider
import com.jemmycalak.qasir.di.DaggerAppComponent

class App :Application(), AppProvider, ListOrderProvider, NetworkProvider {

    val networkComponent : NetworkComponent by lazy {
        DaggerNetworkComponent.builder()
        .remoteModule(RemoteModule())
        .retrofitConfig(RetrofitConfig(BuildConfig.BASE_URL))
        .build()
    }

    override fun onAppComponent(): AppComponent =
        DaggerAppComponent.builder()
            .build()


    override fun setupListOrderProvider(): ListOrderComponent =
        DaggerListOrderComponent
            .builder()
            .networkComponent(networkComponent)
            .build()

    override fun providerNetwork(): NetworkComponent {
        networkComponent.inject(this)
        return networkComponent
    }
}