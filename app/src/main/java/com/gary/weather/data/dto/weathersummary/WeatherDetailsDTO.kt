package com.gary.weather.data.dto.weathersummary

import com.google.gson.annotations.SerializedName

data class WeatherDetailsDTO (
    @SerializedName("temp") val temperature: Double,
    @SerializedName("feels_like") val feelsLikeTemp: Double,
    @SerializedName("temp_min") val minimumTemperature: Double,
    @SerializedName("temp_max") val maximumTemperature: Double,
    @SerializedName("sea_level") val seaLevel: Int,
    @SerializedName("grnd_level") val groundLevel: Int,
    val pressure: Int,
    val humidity: Int
)



