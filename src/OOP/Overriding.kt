package OOP
open class Over() {
    open fun sum(a: Int, b: Int): Int {
        return a + b;
    }
    fun mul(a: Int, b: Int): Int {
        return a * b;
    }
}
class Three : Over{
    //use constructor sub class and super class
    constructor():super()
    override fun sum(a: Int, b: Int): Int {
        return a + b;
    }
    fun div(a: Int, b: Int): Int {
        return a / b;
    }
    fun sub(a: Int, b: Int): Int {
        return a - b;
    }
}
fun main(args: Array<String>) {
    var a = Three()
    println(a.sum(2, 2))
    println(a.sub(2, 2))
    println(a.mul(2, 2))
    println(a.div(2, 2))
    //if protected can not  a.canIGet;
    //if private can not  a.canIGet;
}