package com.gary.weather.data.dto.weathersummary

import com.google.gson.annotations.SerializedName

data class WeatherDTO(
    val timezone: Long,
    val id: Long,
    val cod: Int,
    val base: String,
    val visibility: Long,
    val wind: WindDTO,
    val clouds: CloudsDTO,
    @SerializedName("coord") val coordinates: CoordinatesDTO,
    @SerializedName("weather") val weatherSummaries: List<WeatherSummaryDTO>,
    @SerializedName("main") val weatherDetails: WeatherDetailsDTO,
    @SerializedName("dt") val timeOfCalculation: Long,
    @SerializedName("sys") val systemDetails: SystemDTO,
    @SerializedName("name") val location: String,
)
