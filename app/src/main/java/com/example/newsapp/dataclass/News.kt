package com.example.newsapp.dataclass

import java.io.Serializable

data class News(
    val id: Int,
    val title: String,
    var image: String,
    var descriptor: String? = null
):Serializable
