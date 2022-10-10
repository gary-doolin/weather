package com.gary.weather.data.mappers

import com.gary.weather.Mapper
import com.gary.weather.data.dto.weathersummary.WeatherDetailsDTO
import com.gary.weather.features.weathersummary.domain.model.WeatherDetails
import kotlin.math.min

class WeatherDetailsMapper: Mapper<WeatherDetailsDTO, WeatherDetails> {
    override fun map(input: WeatherDetailsDTO): WeatherDetails {
        with(input) {
            return WeatherDetails(
                temperature = temperature,
                maxTemp = maximumTemperature,
                minTemp = minimumTemperature,
                feelsLikeTemp = feelsLikeTemp
            )
        }
    }
}
