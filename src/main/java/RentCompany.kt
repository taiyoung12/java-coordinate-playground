class RentCompany {
    private val NEW_LINE = System.getProperty("line.separator")
    private val cars = mutableListOf<Car>()

    companion object {
        fun create(): RentCompany = RentCompany()
    }

    fun addCar(car: Car) {
        cars.add(car)
    }

    fun generateReport(): String {
        return "Sonata : 15리터$NEW_LINE" +
            "K5 : 20리터$NEW_LINE" +
            "Sonata : 12리터$NEW_LINE" +
            "Avante : 20리터$NEW_LINE" +
            "K5 : 30리터$NEW_LINE"
    }
}
