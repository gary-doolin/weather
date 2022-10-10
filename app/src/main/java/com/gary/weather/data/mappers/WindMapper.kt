package com.gary.weather.data.mappers

import com.gary.weather.Mapper
import com.gary.weather.data.dto.weathersummary.WindDTO
import com.gary.weather.features.weathersummary.domain.model.Wind

class WindMapper: Mapper<WindDTO, Wind> {
    override fun map(input: WindDTO): Wind {
        with(input) {
            return Wind(
                windSpeed = windSpeed,
                windDirection = windDirection,
                windGustSpeed = windGustSpeed
            )
        }
    }
}
