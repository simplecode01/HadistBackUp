package com.simplecode01.hadistfull.api.response


import com.google.gson.annotations.SerializedName

data class DataHadist(
    @SerializedName("data")
    val `data`: Data
)