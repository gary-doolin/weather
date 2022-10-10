package com.gary.weather

interface Mapper<I,O> {
    fun map(input: I): O
}