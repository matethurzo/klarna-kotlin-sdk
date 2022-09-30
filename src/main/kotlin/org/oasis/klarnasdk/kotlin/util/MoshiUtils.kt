package org.oasis.klarnasdk.kotlin.util

import com.squareup.moshi.FromJson
import com.squareup.moshi.Moshi
import com.squareup.moshi.ToJson
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

object LocalDateTimeFormatterProvider {
    private var formatter = DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.systemDefault())

    fun get(): DateTimeFormatter = formatter
}

class LocalDateTimeAdapter {
    @ToJson
    fun toJson(localDateTime: LocalDateTime): String =
        LocalDateTimeFormatterProvider.get().format(localDateTime)

    @FromJson
    fun fromJson(localDateTime: String): LocalDateTime =
        LocalDateTime.parse(localDateTime, LocalDateTimeFormatterProvider.get())
}

object MoshiProvider {
    private var moshi = Moshi.Builder()
        .add(LocalDateTimeAdapter())
        .addLast(KotlinJsonAdapterFactory())
        .build()

    fun get(): Moshi = moshi
}