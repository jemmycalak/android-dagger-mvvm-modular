package com.jemmycalak.product

import com.jemmycalak.product.di.ListOrderComponent

interface ListOrderProvider {
    fun setupListOrderProvider(): ListOrderComponent
}