package OOP

open class One() {
    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun mul(a: Int, b: Int): Int {
        return a * b;
    }
}

class Inher() : One() {
    fun div(a: Int, b: Int): Int {
        return a / b;
    }

    fun sub(a: Int, b: Int): Int {
        return a - b;
    }
}

fun main(args: Array<String>) {
    var a = Inher()
    println(a.sum(10, 20))
    println(a.sub(10, 20))
    println(a.mul(10, 20))
    println(a.div(10, 20))
}