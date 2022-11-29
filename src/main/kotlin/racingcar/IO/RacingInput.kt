package racingcar.IO

import camp.nextstep.edu.missionutils.Console
import racingcar.errorcheck.ErrorCheck

object RacingInput {
    fun inputCar(): String {
        var check = false
        var cars = ""
        while (!check) {
            try {
                cars = Console.readLine()
                ErrorCheck.carListCheck(cars)
                check = true
            } catch (error: IllegalArgumentException) {
                println(error.message)
            }
        }
        return cars
    }


}