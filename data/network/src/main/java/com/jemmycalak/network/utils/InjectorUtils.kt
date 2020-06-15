package com.jemmycalak.network.utils

import android.content.Context
import com.jemmycalak.network.NetworkProvider
import com.jemmycalak.network.di.NetworkComponent
import com.jemmycalak.network.di.RemoteModule

object InjectorUtils {
    fun provideNetworkComponent(applicationContext: Context): NetworkComponent {
        return if (applicationContext is NetworkProvider) {
            (applicationContext as NetworkProvider).providerNetwork()
        } else {

            throw IllegalStateException("Provide the application context which implement NetworkProvider")
        }
    }
}