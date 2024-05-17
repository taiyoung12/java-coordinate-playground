interface Car {
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    fun getDistancePerLiter(): Double

    /**
     * 여행하려는 거리
     */
    fun getTripDistance(): Double

    /**
     * 차종의 이름
     */
    fun getName(): String?

    /**
     * 주입해야할 연료량을 구한다.
     */
    fun getChargeQuantity(): Double {
        return getTripDistance() / getDistancePerLiter()
    }
}
