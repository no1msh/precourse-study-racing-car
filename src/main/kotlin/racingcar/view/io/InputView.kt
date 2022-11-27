package racingcar.view.io

import camp.nextstep.edu.missionutils.Console
import racingcar.view.validator.InputValidator

object InputView {

    fun readCarNames(): List<String> {
        val names = Console.readLine()
            .split(",")
            .filter { it.isNotBlank() }
            .map { it.trim() }

        InputValidator.checkCarNames(names)

        return names
    }

    fun readTryCount(): Int {
        return InputValidator.validTryCount(Console.readLine())
    }
}