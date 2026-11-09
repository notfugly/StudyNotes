//enum class Color(val hex: String) {
//    RED("#ff0000"),
//    GREEN("#00ff00"),
//    BLUE("#0000ff")
//}
//
//class NumberHolder(
//    var n: Int = 0
//) {
//    companion object {
//        fun sum(a: Int, b: Int) = a + b
//    }
//}
//
//data class Person(
//    val name: String,
//    var age: Int,
//    val hairColor: Color,
//    val numberHolder: NumberHolder
//)
//
//object GameManipulator {
//    var gamersCount = 10
//
//    fun f1() {}
//}
//
//fun main() {
//    GameManipulator.gamersCount
//    GameManipulator.f1()
//
//    NumberHolder.sum(1, 2)
//
//    val person1 = Person(
//        "Ivan",
//        18,
//        Color.RED,
//        NumberHolder()
//    )
//    val person3 = person1.copy()
//    println(person1)
//    println(person3)
//
//    person1.age = 20
//    println(person1)
//    println(person3)
//
//    person1.numberHolder.n = 100
//    println(person3.numberHolder.n)
//}