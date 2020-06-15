package com.jemmycalak.product.ui

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jemmycalak.network.utils.InjectorUtils
import com.jemmycalak.product.ListOrderProvider
import com.jemmycalak.product.R
import com.jemmycalak.product.di.DaggerListOrderComponent
import com.jemmycalak.product.vm.ListOrderViewModel
import javax.inject.Inject

class ListOrderProductFragment : Fragment() {

    @Inject
    lateinit var repository: ListOrderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        ((activity!!.application) as ListOrderProvider)
            .setupListOrderProvider()
            .inject(this)

        repository.onGetListData()

        return inflater.inflate(R.layout.fragment_list_order_product, container, false)
    }
}