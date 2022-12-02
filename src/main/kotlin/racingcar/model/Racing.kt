package racingcar.model

import camp.nextstep.edu.missionutils.Randoms

class Racing(private val cars: List<Car>) {

    private fun canMove(): Boolean {
        val randomValue = Randoms.pickNumberInRange(START_RANGE, END_RANGE)
        if (randomValue >= CUT_OFF) {
            return true
        }
        return false
    }

    fun raceOnce() {
        for (car in this.cars) {
            if (canMove()) {
                car.move()
            }
        }
    }

    fun getWinners(maxCount: Int): List<String> {
        val winners = mutableListOf<String>()
        for (car in this.cars) {
            if (car.getPosition() == maxCount) {
                winners.add(car.getName())
            }
        }
        return winners.toList()
    }

    companion object {
        const val START_RANGE = 0
        const val END_RANGE = 9
        const val CUT_OFF = 4
    }
}