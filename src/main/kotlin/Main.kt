fun main() {

    val animal1 = Herb("Бычок", "500","20%")
    val animal2 = Herb("Баран", "600", "40%")
    val animal3 = Carni("Песец", "2500",35)
    val animal4 = Carni("Норка", "3600", 15)

    animal1.printName()
    animal1.printHerb()
    animal2.printName()
    animal2.printHerb()
    animal3.printName()
    animal3.printCarni()
    animal4.printName()
    animal4.printCarni()
}

