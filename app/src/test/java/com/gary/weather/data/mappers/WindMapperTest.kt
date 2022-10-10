package com.gary.weather.data.mappers

import com.gary.weather.data.dto.weathersummary.WindDTO
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class WindMapperTest {

    lateinit var windMapper: WindMapper

    @Before
    fun setup() {
        windMapper = WindMapper()
    }

    @Test
    fun `wind dto maps with correct parameters as expected`() {
        val windDto = WindDTO(12.3, 10222, 50.0)

        val wind = windMapper.map(windDto)

        assertEquals(12.3, wind.windSpeed)
        assertEquals(10222, wind.windDirection)
        assertEquals(50.0, wind.windGustSpeed)
    }
}
