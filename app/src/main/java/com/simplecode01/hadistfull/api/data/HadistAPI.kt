package com.simplecode01.hadistfull.api.data

import com.simplecode01.hadistfull.api.response.DataHadist
import retrofit2.http.GET
import retrofit2.http.Query

interface HadistAPI {
    @GET("/")
    suspend fun getHadist(
        @Query("kitab") kitab: String,
        @Query("id") id: Int
    ): DataHadist
}