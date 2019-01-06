package OOP

class Cons() {
    var model: Int? = null
    var type: String? = null

    constructor(model: Int, type: String) : this() {
        this.model = model
        this.type = type
    }
    constructor(model: Int) : this() {
        this.model = model
        println("Constructor 2 is called $model")
    }
    fun getConstructor():Int{
        return this.model!!;
    }
}

fun main(args: Array<String>) {
var constructor=Cons(10);


}