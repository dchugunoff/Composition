package com.chugunov.composition.domain.repository

import com.chugunov.composition.domain.entity.GameSettings
import com.chugunov.composition.domain.entity.Level
import com.chugunov.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings

}