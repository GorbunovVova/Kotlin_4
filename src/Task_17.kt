fun main(args: Array<String>) {

/*    Поможем авиакомпании в создании программы для учета авиапарка.
      Создайте класс Aircraft и реализуйте в нем свойства, содержащие следующее:
      номер воздушного судна, максимальная дальность полета, вместимость бака, расход топлива на 100 км.
      Установите значения по своему усмотрению. Переопределите геттер свойства содержащего расход топлива,
      чтобы он самостоятельно рассчитывался из свойств дальности полета и вместимости бака.*/

    val tu_134: Aircraft = Aircraft()
    tu_134.number = 24387
    tu_134.range = 2800
    tu_134.tankCapacity = 13200
    println(tu_134.info)

}

class Aircraft {

    var number: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }

    var range: Int = 100
        set(value) {
            if ((value > 100) and (value < 5000))
                field = value
        }

    var tankCapacity: Int = 10
        set(value) {
            if ((value > 5000) and (value < 300000))
                field = value
        }

    val fuelConsumption: Double
        get() = tankCapacity.toDouble() / range * 100

    val info: String
        get() = "Number: $number Range: $range TankCapacity: $tankCapacity FuelConsumption: ${String.format("%.2f", fuelConsumption)}"

}