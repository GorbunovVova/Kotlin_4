fun main(args: Array<String>) {

//    Усовершенствуем программу так, чтобы нельзя было создать неопределенный тип самолета: сделайте класс Aircraft абстрактным.

    val boeing747 = Boeing747_3(550, 24388, 14205, 241140)
    println(boeing747.info)

}

class Boeing747_3(override var passengerCapacity: Int, number: Int, range: Int, tankCapacity: Int) : Aircraft_5(
    number,
    range,
    tankCapacity
), Passenger_2 {

    override val info: String
        get() = "Number: $number Range: $range TankCapacity: $tankCapacity FuelConsumption: ${
            String.format(
                "%.2f",
                fuelConsumption
            )
        } PassengerCapacity: $passengerCapacity"
}

interface Passenger_2 {
    var passengerCapacity: Int
}

abstract class Aircraft_5(number: Int, range: Int, tankCapacity: Int) {

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

    open val info: String
        get() = "Number: $number Range: $range TankCapacity: $tankCapacity FuelConsumption: ${
            String.format(
                "%.2f",
                fuelConsumption
            )
        }"

}