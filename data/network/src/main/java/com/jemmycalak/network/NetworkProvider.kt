package com.jemmycalak.network

import com.jemmycalak.network.di.NetworkComponent

interface NetworkProvider {
    fun providerNetwork():NetworkComponent
}