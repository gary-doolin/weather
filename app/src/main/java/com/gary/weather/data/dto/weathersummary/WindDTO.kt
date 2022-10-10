package com.gary.weather.data.dto.weathersummary

import com.google.gson.annotations.SerializedName

data class WindDTO(
    @SerializedName("speed") val windSpeed: Double,
    @SerializedName("deg") val windDirection: Int,
    @SerializedName("gust") val windGustSpeed: Double
)
