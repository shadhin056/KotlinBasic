package OOP

abstract class Five {
    fun sum(): String {
        return "12345";
    };
    abstract fun newfun()
}

class Ab : Five() {
    override fun newfun() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getInfo(): String {
        return sum();
    }
}

fun main(args: Array<String>) {
    var a = Ab()
}