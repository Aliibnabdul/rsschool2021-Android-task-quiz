package com.rsschool.quiz.models

import java.io.Serializable

data class Question(
    val id: Int,
    val question: String,
    val variantsMap: Map<Int, String>,
    val rightAnswer: Int,
    var userAnswer: Int?
): Serializable