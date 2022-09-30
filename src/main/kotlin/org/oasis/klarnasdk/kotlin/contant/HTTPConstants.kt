package org.oasis.klarnasdk.kotlin.contant

import okhttp3.MediaType.Companion.toMediaType

const val HTTP_HEADER_CONTENT_TYPE = "Content-Type"
const val HTTP_HEADER_ACCEPT = "Accept"
const val HTTP_HEADER_ACCEPT_CHARSET = "Accept-Charset"
const val HTTP_HEADER_AUTHORIZATION = "Authorization"

const val MEDIA_TYPE_APPLICATION_JSON_VALUE = "application/json"
val MEDIA_TYPE_APPLICATION_JSON = MEDIA_TYPE_APPLICATION_JSON_VALUE.toMediaType()