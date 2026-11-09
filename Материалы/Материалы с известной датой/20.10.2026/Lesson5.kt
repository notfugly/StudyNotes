open class Person(
    var name: String
) {
    open fun introduce(): String {
        return "Привет! Меня зовут $name"
    }
}

class Teacher(name: String, val subject: String) : Person(name) {
    override fun introduce(): String {
        return "Привет! Я ваш учитель. Меня зовут $name. Я преподаю $subject"
    }
}

class Administrator(name: String) : Person(name) {
    override fun introduce(): String {
        return "Привет! Я ваш админ. Меня зовут $name"
    }
}

fun main() {
    val person1 = Person("Bob")
    val teacher1 = Teacher("Ivan", "Tere")
    val administrator1 = Administrator("Tom")

    println(person1.introduce())
    println(teacher1.introduce())
    println(administrator1.introduce())

    val teacher2: Person = Teacher("T2", "123")
    println(teacher2.introduce())
}