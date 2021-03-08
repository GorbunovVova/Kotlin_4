fun main(args: Array<String>) {

//    Создайте data класс для автомобилей. Он должен содержать марку автомобиля, цвет и номер.
//    Выведите информацию об автомобилях в консоль.

    val lada2108 = Car("Lada", "purple", "А007МР77")
    println(lada2108.toString())
    val mazdaRx7 = Car("Mazda", "red", "Е008КХ77")
    println(mazdaRx7.toString())
    val hyundaiTiburon = Car("Hyundai", "Blue", "Х009ХХ77")
    println(hyundaiTiburon.toString())

}

data class Car(val brand: String, val color: String, val number: String){
    override fun toString(): String {
        return "Brand: $brand Color: $color Number: $number"
    }
}
