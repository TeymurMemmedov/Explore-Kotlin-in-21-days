fun generateMessage(): String {
    val charCodes = intArrayOf(
        72, 101, 108, 108, 111, 32, 112, 114, 111, 103, 114, 97, 109, 109, 101, 114, 33,
        32, 84, 104, 101, 32, 119, 111, 114, 108, 100, 32, 100, 111, 101, 115, 110, 39, 116,
        32, 104, 101, 97, 114, 32, 121, 111, 117, 44, 32, 112, 108, 101, 97, 115, 101, 32,
        115, 116, 111, 112, 32, 115, 101, 110, 100, 105, 110, 103, 32, 72, 101, 108, 108, 111,
        33
    )

    return String(charCodes, 0, charCodes.size)
}

fun main() {
    val Message = generateMessage()
    println(Message)
}
