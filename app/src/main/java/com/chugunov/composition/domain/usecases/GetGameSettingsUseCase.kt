package com.chugunov.composition.domain.usecases

import com.chugunov.composition.domain.entity.GameSettings
import com.chugunov.composition.domain.entity.Level
import com.chugunov.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}