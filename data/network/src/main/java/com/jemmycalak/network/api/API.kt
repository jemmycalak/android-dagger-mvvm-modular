package com.jemmycalak.network.api

import com.jemmycalak.model.Repository
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface API {

    @GET("search/users?q=jemmycalak")
    fun getListOrder(@QueryMap query:HashMap<String, Any>):Single<Repository>
}