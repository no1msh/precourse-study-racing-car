package racingcar

import racingcar.domain.Car
import racingcar.domain.Referee
import racingcar.view.View

class RacingCarController {
    fun play() {
        val carNames = View.viewCarName()
        val cars = carNames.map { Car(it) }
        val attemptsNumber = View.viewAttemptsNumber()
        cars.forEach { it.move(attemptsNumber) }
        View.viewResult(cars)
        val winners = Referee(cars).getWinners()
        View.viewWinner(winners)
    }


}