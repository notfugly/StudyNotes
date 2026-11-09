fun main() {
    val arr1 = intArrayOf(1, 2, 3, 100)
    for(i in arr1) {
        println(i)
    }

    val arr2 = arrayOf("A", "B", "C", "D")
    for(i in arr2) {
        println(i)
    }

    arr2.forEach { i ->
        println(i)
    }

    for(i in 1 until 5 step 2) {}

    f1()
    f1_1()

    println(f2())
    println("Bob".hello())

    println(4.myPlus(3))
    println(4 myPlus 3)

    val f3_1 = f3(10)
    f3_1(1, 2)

    val f4 = { a: Int, b: Int -> a + b }

    val dataFromServer: String? = "123"

//    dataFromServer?.let {
//        println(f5(it))
//    }
//    println(f5(dataFromServer!!))
//    if(dataFromServer != null)
//        println(f5(dataFromServer))

    val length = dataFromServer?.length ?: -1

    val x = 50

    when {
        x >= 100 -> println("x >= 100")
        x >= 10 -> println("x >= 10")
        x >= 1 -> println("x >= 1")
        else -> println("None")
    }

    val y = when {
        x >= 100 -> 200
        x >= 10 -> 20
        x >= 1 -> 2
        else -> 0
    }
    println(y)
    val z = if (x > 0) x else 0
    f6(
        "abc",
        "def",
        "bob"
    )
    f6(
        *arrayOf("abc", "def", "bob")
    )
}

fun f1() {
    println("F1()")
}

fun f1_1() = println("F1_1")

fun f2(name: String = "Default"): String {
    return name.hello()
}

fun f2_1(name: String): String = "Hello, $name"

fun String.hello(): String {
    return "Hello, $this"
}

infix fun Int.myPlus(other: Int): Int {
    return this + other
}

fun f3(startNum: Int = 0): (Int, Int) -> Unit {
    var sum = startNum

    return fun (a: Int, b: Int) {
        println(sum++)
    }
}

fun f5(s: String) = s.hello()

fun f6(vararg strings: String) = strings.forEach {
    println(it)
}