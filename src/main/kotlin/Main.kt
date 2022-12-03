fun main() {

    val animal1 = Herb("Бычок", "500","20%")
    val animal2 = Herb("Баран", "600", "40%")
    val animal3 = Carni("Песец", "2500",35)
    val animal4 = Carni("Норка", "3600", 15)

    printAnimalAll(animal1)
    printAnimalAll(animal2)
    printAnimalAll(animal3)
    printAnimalAll(animal4)

}
fun printHerbs (animal: Herb){
    animal.printName()
    animal.printHerb()
}

fun printCarnis (animal: Carni ){
    animal.printName()
    animal.printCarni()
}
fun printAnimalAll (animal: Any){
    val className =  animal::class.qualifiedName
    if (className == "Herb"){
        print("Травоядное ")
        printHerbs(animal as Herb)
    }
    if (className == "Carni"){
        print("Плотоядное  ")
        printCarnis(animal as Carni)
    }
}
