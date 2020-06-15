package com.jemmycalak.product.di

import com.jemmycalak.network.di.NetworkComponent
import com.jemmycalak.product.di.module.ServiceModule
import com.jemmycalak.product.ui.ListOrderProductFragment
import dagger.Component

@Component(
    modules = [
        ServiceModule::class
    ],
    dependencies = [
        NetworkComponent::class
    ]
)
@ListOrderScope
interface ListOrderComponent {
    fun inject(listOrderFragment:ListOrderProductFragment)
}