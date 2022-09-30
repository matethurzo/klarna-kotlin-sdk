package org.oasis.klarnasdk.kotlin.util

import okhttp3.Credentials
import okhttp3.OkHttpClient
import okhttp3.Request
import org.oasis.klarnasdk.kotlin.contant.*
import java.nio.charset.StandardCharsets

// Extensions

fun Request.Builder.contentType(contentType: String) =
    this.header(HTTP_HEADER_CONTENT_TYPE, contentType)

fun Request.Builder.accept(mediaType: String) =
    this.header(HTTP_HEADER_ACCEPT, mediaType)

fun Request.Builder.acceptCharset(charset: String = "UTF-8") =
    this.header(HTTP_HEADER_ACCEPT_CHARSET, charset)

fun Request.Builder.klarnaHeaders() =
    this.contentType(MEDIA_TYPE_APPLICATION_JSON_VALUE)
        .accept(MEDIA_TYPE_APPLICATION_JSON_VALUE)
        .acceptCharset("UTF-8")

fun Request.Builder.basicAuth(username: String, password: String) =
    this.header(HTTP_HEADER_AUTHORIZATION, Credentials.basic(username, password, StandardCharsets.UTF_8))

// Singleton

object HttpClientProvider {
    private var httpClient = OkHttpClient().newBuilder()
        .build()

    fun get(): OkHttpClient = httpClient
}