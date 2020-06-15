package com.jemmycalak.product.di.module

import com.jemmycalak.network.repository.listorderproduct.ListOrderRepository
import com.jemmycalak.product.di.ListOrderScope
import com.jemmycalak.product.vm.ListOrderViewModel
import dagger.Module
import dagger.Provides

@Module
class ServiceModule {

    @Provides
    @ListOrderScope
    fun onListOrder(repository: ListOrderRepository):ListOrderViewModel
            = ListOrderViewModel(repository)

}