fun main(args: Array<String>) {

//    Создадим наследника класса Aircraft с названием Boeing747 и добавим ему свойство, обозначающее вместимость пассажиров

    val boeing747 = Boeing747(550, 24388, 14205, 241140)
    println(boeing747.fullInfo)

}

class Boeing747(var passengerCapacity: Int, number: Int, range: Int, tankCapacity: Int) :
    Aircraft_3(number, range, tankCapacity) {

    val fullInfo: String
        get() = "Number: $number Range: $range TankCapacity: $tankCapacity FuelConsumption: ${
            String.format(
                "%.2f",
                fuelConsumption
            )
        } PassengerCapacity: $passengerCapacity"
}

open class Aircraft_3(number: Int, range: Int, tankCapacity: Int) {

    var number: Int = 0

    init {
        if (number > 0)
            this.number = number
    }

    var range: Int = 100

    init {
        if ((range > 100) and (range < 20000))
            this.range = range
    }

    var tankCapacity: Int = 10

    init {
        if ((tankCapacity > 5000) and (tankCapacity < 300000))
            this.tankCapacity = tankCapacity
    }

    val fuelConsumption: Double
        get() = tankCapacity.toDouble() / range * 100

    val info: String
        get() = "Number: $number Range: $range TankCapacity: $tankCapacity FuelConsumption: ${
            String.format(
                "%.2f",
                fuelConsumption
            )
        }"

}