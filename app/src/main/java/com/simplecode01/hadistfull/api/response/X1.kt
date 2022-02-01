package com.simplecode01.hadistfull.api.response


import com.google.gson.annotations.SerializedName

data class X1(
    @SerializedName("id")
    val id: String,
    @SerializedName("nass")
    val nass: String,
    @SerializedName("terjemah")
    val terjemah: String
)