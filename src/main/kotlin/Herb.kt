class Herb(empName: String, val priceMeat: String, val fat: String): Animal(empName){

    fun printHerb() {
        println("Стоимость мяса $priceMeat рублей, жирность $fat")
    }
}
fun printHerbs (animal: Herb){
    animal.printName()
    animal.printHerb()
}