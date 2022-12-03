fun main() {

    val animal1 = Herb("Бычок", "500","20%")
    val animal2 = Herb("Баран", "600", "40%")
    val animal3 = Carni("Песец", "2500",35)
    val animal4 = Carni("Норка", "3600", 15)

    printHerbs(animal1)
    printHerbs(animal2)
    printCarnis(animal3)
    printCarnis(animal4)
}
fun printHerbs (animal: Herb){
    printAnimal("${animal::class.qualifiedName}")
    animal.printName()
    animal.printHerb()
}

fun printCarnis (animal: Carni ){
    printAnimal("${animal::class.qualifiedName}")
    animal.printName()
    animal.printCarni()
}
fun printAnimal(className:String){
    if (className == "Herb"){
        print("Травоядное ")
    }
    if (className == "Carni"){
        print("Плотоядное  ")
    }
}