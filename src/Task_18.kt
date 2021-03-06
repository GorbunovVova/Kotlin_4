fun main(args: Array<String>) {

//    Усовершенствуйте программу для авиакомпании. Пусть свойства: номер воздушного судна,
//    максимальная дальность полета и вместимость бака определяются через конструктор.
//    Для этих свойств значения определять не надо.

    val tu_134 = Aircraft_2(24387, 2800, 13200)
    println(tu_134.info)

}

class Aircraft_2(number: Int, range: Int, tankCapacity: Int) {

    var number: Int = 0

    init {
        if (number > 0)
            this.number = number
    }

    var range: Int = 100

    init {
        if ((range > 100) and (range < 5000))
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