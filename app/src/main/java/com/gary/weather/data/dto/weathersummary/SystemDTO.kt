package com.gary.weather.data.dto.weathersummary

import com.google.gson.annotations.SerializedName

data class SystemDTO(
    val type: Int,
    val id: Long,
    val country: String,
    @SerializedName("sunrise") val timeOfSunrise: Long,
    @SerializedName("sunset") val timeOfSunset: Long
)
