package com.jemmycalak.qasir.di

import com.jemmycalak.network.di.NetworkComponent
import com.jemmycalak.qasir.MainActivity
import dagger.Component
import javax.inject.Singleton

@AppScope
@Component(
    modules = [AppModule::class],
    dependencies = [NetworkComponent::class]
)
interface AppComponent {
    fun inject(activity:MainActivity)
}