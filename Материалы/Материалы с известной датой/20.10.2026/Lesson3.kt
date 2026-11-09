open class Chat {
    lateinit var ipAddress: String
    protected val _messages = mutableListOf<String>()

    init {
        ipAddress = "link2"
    }

    val description: String by lazy {
        println("Лениво подгрузил(((")
        "Описание"
    }

    public val messages
        get() = _messages

    fun addMessage(msg: String) {
        _messages.add(msg)
    }
}

class ModernChat : Chat() {
    fun getLastMessageId() = _messages.lastIndex
}

fun main() {
    val chat = ModernChat()
    chat.addMessage("Hello")
//    chat.ipAddress = "link"
    println(chat.messages)
    println(chat.ipAddress)
    println(chat.getLastMessageId())

    println(chat.description)
    println(chat.description)
}