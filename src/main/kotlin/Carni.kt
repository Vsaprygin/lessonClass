class Carni(empName: String, val priceFur: String, val wool:Int): Animal(empName){

    fun printCarni() {
        println("Стоимость шкуры-$priceFur рублей,  ворс-$wool мм")
    }
}
fun printCarnis (animal: Carni ){
    print ("Плотоядное ")
    animal.printName()
    animal.printCarni()
}