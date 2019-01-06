package OOP
interface Four {
    fun sum(a: Int, b: Int){
        println(a+b)
    };
    fun mul(a: Int, b: Int);
}
class InterfaceCh:Four{
    override fun sum(a: Int, b: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println(a+b)
    }
    override fun mul(a: Int, b: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println(a*b)
    }
    fun div(a: Int, b: Int): Int {
        return a / b;
    }
    fun sub(a: Int, b: Int): Int {
        return a - b;
    }
}
fun main(args: Array<String>) {
    var a = InterfaceCh()
}