package com.jemmycalak.qasir.di

import com.jemmycalak.network.NetworkProvider
import com.jemmycalak.product.ListOrderProvider

interface AppProvider {
    fun onAppComponent():AppComponent
}