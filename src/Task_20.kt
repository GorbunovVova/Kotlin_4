fun main(args: Array<String>) {

//    Изменим реализацию пассажирских самолетов. Создадим Интерфейс с названием Passenger со свойством,
//    обозначающим вместимость пассажиров. Уберем это свойство у класса Boeing747 и реализуем в нем новый интерфейс.
//    Пусть свойство наследуемое от интерфейса, переопределяется в конструкторе.

    val boeing747 = Boeing747_2(550, 24388, 14205, 241140)
    println(boeing747.info)

}

class Boeing747_2(override var passengerCapacity: Int, number: Int, range: Int, tankCapacity: Int) : Aircraft_4(
    number,
    range,
    tankCapacity
), Passenger {

    override val info: String
        get() = "Number: $number Range: $range TankCapacity: $tankCapacity FuelConsumption: ${
            String.format(
                "%.2f",
                fuelConsumption
            )
        } PassengerCapacity: $passengerCapacity"
}

interface Passenger {
    var passengerCapacity: Int
}

open class Aircraft_4(number: Int, range: Int, tankCapacity: Int) {

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