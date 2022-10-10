package com.gary.weather.data.mappers

import com.gary.weather.Mapper
import com.gary.weather.data.dto.weathersummary.WeatherDetailsDTO
import com.gary.weather.features.weathersummary.domain.model.WeatherDetails

class WeatherDetailsMapper: Mapper<WeatherDetailsDTO, WeatherDetails> {
    override fun map(input: WeatherDetailsDTO): WeatherDetails {
        TODO("Not yet implemented")
    }
}