package com.gary.weather.data.mappers

import com.gary.weather.Mapper
import com.gary.weather.data.dto.weathersummary.WeatherSummaryDTO
import com.gary.weather.features.weathersummary.domain.model.WeatherSummary

class WeatherSummaryMapper : Mapper<WeatherSummaryDTO, WeatherSummary> {
    override fun map(input: WeatherSummaryDTO): WeatherSummary {
        with(input) {
            return WeatherSummary(
                title = main,
                description = description,
                weatherIcon = icon
            )
        }
    }
}
