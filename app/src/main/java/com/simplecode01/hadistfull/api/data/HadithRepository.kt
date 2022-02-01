package com.simplecode01.hadistfull.api.data

import javax.inject.Inject

class  HadithRepository @Inject constructor(private val hadistAPI: HadistAPI) {
    suspend fun getHadist(kitab: String, id: Int) = hadistAPI.getHadist(kitab, id)
}