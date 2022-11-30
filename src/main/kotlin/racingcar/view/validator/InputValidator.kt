package racingcar.view.validator

import racingcar.domain.racing.Car
import racingcar.domain.racing.RacingGame
import racingcar.domain.racing.RacingTrack
import racingcar.util.isUpperOrLower
import racingcar.util.toIntOrThrow
import racingcar.view.strings.ErrorMessages

object InputValidator {

    fun checkRacingCarNames(names: List<String>) {
        require(names.size in RacingTrack.AvailableCarSize) { ErrorMessages.OutOfCarSize }
        require(names.all { it.length in Car.AvailableNameLength }) { ErrorMessages.OutOfCarNameLength }
        require(names.all { it.isUpperOrLower() }) { ErrorMessages.InvalidCarName }
    }

    fun validTryCount(tryCount: String): Int {
        val number = tryCount.toIntOrThrow { ErrorMessages.InvalidNumberFormat }

        require(number in RacingGame.AvailableTryCountRange) { ErrorMessages.OutOfTryCountRange }

        return number
    }
}