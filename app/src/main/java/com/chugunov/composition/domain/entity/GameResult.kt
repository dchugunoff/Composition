package com.chugunov.composition.domain.entity

data class GameResult (
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSetting: GameSettings
        )