class Student (
    val name: String,
    var points: Int,
    _age: Int = 0
) {
    var age = _age
        get() = field
        set(value) {
            require(value in 0..100) {
                "Некорректный возраст"
            }
            field = value
        }

    var isAdult
        get() = age >= 18

    init {
        require(points in 0..120) {
            "Parameter \"Points\" is incorrect"
        }
        println("Init: $name")
        isAdult = age >= 18
    }

    constructor(name: String) : this(name, (1..120).random(), -1) {
        println("Another constructor. Name: $name")
    }

    constructor(age: Int) : this("Default", (1..120).random(), age) {
        println("Another constructor. Name: $name")
    }

    constructor() : this("Default")

    fun print() {
        println("Student: $this, Name: ${this.name}, Points: ${this.points}, isAdult: ${this.isAdult}, Age: $age")
    }
}

fun main() {
    val ivan = Student("Ivan", 119, 29)
    val bob = Student("Bob", 80)
    val vasya = Student("Vasya")
    val default = Student()

    ivan.print()
    ivan.age = 100
    ivan.print()

//    ivan.print()
//    bob.print()
//    bob.points = 99
//    bob.print()
//    vasya.print()
//    default.print()
}