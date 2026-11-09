fun main() {
//    val arr1: Array<Int>? = arrayOf(1, 3, 5, 7)
    val arr1: Array<Int>? = null

    if(arr1 != null) {
        println(arr1.size)
    }

    arr1?.copyOf()

    val arr1Size = arr1?.size ?: -100
    println(arr1Size)

    f1()
    f2("asd")
    f2()
    println(f3(1, 2))

    println("World".hello())

    println(1.myPlus(2))
    println(1 myPlus 2)

    println("1" myPlus "2")

    println(f5(1, 2, 3, 4, 5, 6))
    println(f5(*intArrayOf(1, 2, 3, 4, 5)))

    val sumFun = f6()
    println(sumFun(1, 5))

    val f7_1 = f7(123)
    f7_1()

    val res = f8(
        1,
        2,
        {i1: Int, i2: Int -> i1 + i2},
        {i1: Int -> i1*2}
    )
    println(res)

    f9(3){
        println(123)
    }

    repeat(5) {
        println("Hello")
    }
}

fun f1() {
    println("f1")
}

fun f2(s: String = "default") {
    println("f2 $s")
}

fun f3(a: Int, b: Int): Int {
    return a + b
}
fun f3_1(a: Int, b: Int) = a + b

fun String.hello(): String {
    return this + " hello"
}

infix fun Int.myPlus(i: Int): Int {
    return this + i
}

infix fun String.myPlus(s: String): String {
    return this + s
}

fun f5(vararg numbers: Int): Int {
    var sum = 0
    numbers.forEach {
        sum += it
    }
    return sum
}

fun f6(): (Int, Int) -> Int {
    return fun(a: Int, b: Int) = a + b
}

fun f7(startNum: Int): () -> Unit {
    var i = startNum

    val f7_1 = {a: Int, b: Int -> a + b}
    val f7_2 = fun(a: Int, b: Int): Int {
        return a + b
    }

    return fun() {
        println(i++)
    }
}

fun f8(a: Int, b: Int, f8_1: (Int, Int) -> Int, f8_2: (Int) -> Int): Int {
    return f8_2(f8_1(a, b))
}

fun f9(i: Int, anyFun: () -> Unit) {
    for(n in 0 until i) {
        anyFun()
    }
}