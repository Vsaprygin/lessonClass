fun main() {
    val animal1 = Herb("Бычок", "500","20%")
    val animal2 = Herb("Баран", "600", "40%")
    val animal3 = Carni("Песец", "2500",35)
    val animal4 = Carni("Норка", "3600", 15)
    val listAnimal = mutableListOf(animal1, animal2, animal3, animal4)
    listAnimal.forEach {
        printAnimalAll(it)
    }
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