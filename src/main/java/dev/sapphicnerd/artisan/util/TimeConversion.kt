package dev.sapphicnerd.artisan.util

internal class TimeConversion {

    fun msToGameTicks(ms: Long): Long {
        return ms * 50L
    }

    fun secToGameTicks(seconds: Long): Long {
        return seconds * 20L
    }

    fun minsToGameTicks(minutes: Long): Long {
        val seconds = minutes / 60
        val ticks = secToGameTicks(seconds)
        return ticks
    }
}