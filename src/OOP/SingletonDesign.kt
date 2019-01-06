package OOP
class Single{
    var name:String?=null
    private constructor(){
        println("Instance is created")
    }
    companion object {
        val instance:Single by lazy { Single() }
    }
}
fun main(args:Array<String>){
    var obj=Single.instance
    obj.name="shadhin"
    println(obj.name)

    var obj1=Single.instance
    println(obj1.name)

    var obj2=Single.instance
    println(obj2.name)
}
