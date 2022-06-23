package com.cheezycode.randomquote.api

import com.cheezycode.randomquote.models.QuoteList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteService {

    @GET("/quotes")
    suspend fun getQuotesRet(@Query("page") page: Int) : Response<QuoteList>

}