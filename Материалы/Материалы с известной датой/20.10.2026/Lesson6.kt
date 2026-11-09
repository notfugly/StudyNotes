interface Moveable {
//    fun move(a: Int): Int
    fun move()

    fun run() {
        println("Что-то умеет бегать")
    }
}

open class Animal(val typeName: String) : Moveable {
    override fun move() {
        println("Животное $typeName двигается")
    }

    override fun run() {
        println("Животное бежит")
    }
}

class Robot(val name: String) : Moveable {
    override fun move() {
        println("Робот $name двигается")
    }
}

//class Dog : Animal() {
//    override fun move() {
//        println("Животное двигается")
//    }
//}

fun main() {
    val animal1 = Animal("Unknown Dog")
    val animal2 = Animal("Unknown Cat")
//    animal1.move()
//    animal2.move()

    val robot1 = Robot("Валли")
//    robot1.move()

    MoveInGame(animal1)
    MoveInGame(animal2)
    MoveInGame(robot1)
}

fun MoveInGame(moveable: Moveable) {
    print("Сейчас двигается в игре:\t")
    moveable.move()
    moveable.run()
}