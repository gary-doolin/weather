package com.gary.weather.data.dto.weathersummary

import com.google.gson.annotations.SerializedName

data class CoordinatesDTO(
    @SerializedName("lon") val longitude: Double,
    @SerializedName("lat") val latitude: Double
)
