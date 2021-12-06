package com.example.Project2.network

import com.squareup.moshi.Json

data class DogImage(
    @Json(name = "message") val imgSrcUrl: String
)