package com.gary.weather.data.mappers

import com.gary.weather.data.dto.weathersummary.WeatherSummaryDTO
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class WindSummaryMapperTest {

    lateinit var mapper: WeatherSummaryMapper

    @Before
    fun setup() {
        mapper = WeatherSummaryMapper()
    }

    @Test
    fun `when map is called ensure all values are mapped correctly`() {
        val weatherSummaryDTO = WeatherSummaryDTO(
            123,
            "partial cloud",
            "cloud and sun",
            "icon"
        )

        val weatherSummary = mapper.map(weatherSummaryDTO)

        assertEquals("partial cloud", weatherSummary.title)
        assertEquals("cloud and sun", weatherSummary.description)
        assertEquals("icon", weatherSummary.weatherIcon)
    }
}
