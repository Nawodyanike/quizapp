package com.example.new_project

data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)