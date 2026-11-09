abstract class Humanoid() {
    fun talkAnything() {
        println("буууэээ")
    }

    abstract fun move()
}

class Zombie : Humanoid() {
    override fun move() {
        println("Двигается, как зомби")
    }
}

fun main() {

}