package OOP

open class Ac() {
   //public var canIGet:String ="ShadhiN";
   protected var canIGet:String ="ShadhiN";
  // private var canIGet:String ="ShadhiN";


    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun mul(a: Int, b: Int): Int {
        return a * b;
    }
}

class Two() : Ac() {
    fun div(a: Int, b: Int): Int {
        return a / b;
    }

    fun sub(a: Int, b: Int): Int {
        return a - b;
    }
    fun getName(){
        //public and protected
        super.canIGet;
    }
}

fun main(args: Array<String>) {
    var a = Two()
    println(a.sum(10, 20))
    println(a.sub(10, 20))
    println(a.mul(10, 20))
    println(a.div(10, 20))
   //if protected can not  a.canIGet;
   //if private can not  a.canIGet;
}