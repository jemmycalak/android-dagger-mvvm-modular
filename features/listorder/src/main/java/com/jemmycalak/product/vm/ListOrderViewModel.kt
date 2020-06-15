package com.jemmycalak.product.vm

import android.util.Log
import com.jemmycalak.model.Repository
import com.jemmycalak.network.repository.listorderproduct.ListOrderRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class ListOrderViewModel(val repository: ListOrderRepository) {

    var compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun onGetListData(){
        compositeDisposable.add(repository.getListOrder()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object :DisposableSingleObserver<Repository>(){
                override fun onSuccess(t: Repository) {
                    Log.e("response", t.totalCount.toString()+"<<")
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })
        )
    }

}