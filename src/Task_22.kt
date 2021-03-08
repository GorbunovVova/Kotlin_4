fun main(args: Array<String>) {

/*    1. Создайте в классе Aircraft функцию для вывода характеристик самолетов в консоль.

    2. Переопределите данную функцию в классе Boeing747, так чтобы еще выводилась информация о пассажирах

    3. Сделайте свойства обоих классов видимыми только внутри этих классов и их наследниках,
    кроме свойства наследуемого от интерфейса.
    Свойства и функции интерфейсов не поддерживают модификатор protected и internal*/

    val boeing747 = Boeing747_4(550, 24388, 14205, 241140)
    boeing747.getInfo()

}

class Boeing747_4(override var passengerCapacity: Int, number: Int, range: Int, tankCapacity: Int) : Aircraft_6(
    number,
    range,
    tankCapacity
), Passenger_3 {

    override fun getInfo(){
        println("$info PassengerCapacity: $passengerCapacity")
    }
}

interface Passenger_3 {
    var passengerCapacity: Int
}

abstract class Aircraft_6(number: Int, range: Int, tankCapacity: Int) {

    protected var number: Int = 0

    init {
        if (number > 0)
            this.number = number
    }

    protected var range: Int = 100

    init {
        if ((range > 100) and (range < 20000))
            this.range = range
    }

    protected var tankCapacity: Int = 10

    init {
        if ((tankCapacity > 5000) and (tankCapacity < 300000))
            this.tankCapacity = tankCapacity
    }

    protected val fuelConsumption: Double
        get() = tankCapacity.toDouble() / range * 100

    protected val info: String
        get() = "Number: $number Range: $range TankCapacity: $tankCapacity FuelConsumption: ${
            String.format(
                "%.2f",
                fuelConsumption
            )
        }"

    open fun getInfo(){
        println(info)
    }

}