package com.jemmycalak.network.repository.listorderproduct

import com.jemmycalak.model.Repository
import com.jemmycalak.network.api.API
import io.reactivex.Single

class ListOrderRepository(val api: API) {

    fun getListOrder(): Single<Repository> {
        val queryMap = HashMap<String, Any>()
        queryMap["q"] = "jemmy"
        queryMap["1"] = 1
        queryMap["10"] = 10
        return api.getListOrder(queryMap)
    }

}