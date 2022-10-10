package com.gary.weather.data.mappers

import com.gary.weather.data.dto.weathersummary.WeatherDetailsDTO
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class WeatherDetailsMapperTest {
    lateinit var weatherDetailsMapper: WeatherDetailsMapper

    @Before
    fun setup() {
        weatherDetailsMapper = WeatherDetailsMapper()
    }

    @Test
    fun `when map is called all correct parameters are mapped over`() {
        val weatherDetailsDTO = WeatherDetailsDTO(
            temperature = 15.2,
            feelsLikeTemp = 20.5,
            minimumTemperature = 14.2,
            maximumTemperature = 33.2,
            seaLevel = 10564,
            groundLevel = 200654,
            pressure = 12,
            humidity = 52
        )

        val weatherDetails = weatherDetailsMapper.map(weatherDetailsDTO)

        assertEquals(15.2, weatherDetails.temperature)
        assertEquals(20.5, weatherDetails.feelsLikeTemp)
        assertEquals(14.2, weatherDetails.minTemp)
        assertEquals(33.2, weatherDetails.maxTemp)
    }
}
