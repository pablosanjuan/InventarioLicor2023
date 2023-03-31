package com.pablosj.inventariolicor.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("id")
    val id: String, // satoshi-nakamoto
    @SerializedName("name")
    val name: String, // Satoshi Nakamoto
    @SerializedName("date")
    val date: String, // Founder
    val place: String, // Founder
    val stores: Int, // Founder
    var isActive: Boolean?, // Founder
)