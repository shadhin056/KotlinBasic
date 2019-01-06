package OOP
class Car1(type: String,model:Int){
    init {
        println("Class is created Type $type and Model $model")
    }
}
class Car2(){
    init {
        println("Class is created")
    }
}
class Car3(var type: String,var model:Int){
    init {
        println("Class 3 is created Type $type and Model $model")
    }
    fun getCarType():String{
        return this.type;
    }
}
fun main(args: Array<String>) {

    var obj1=Car1("ShadhiN",10)
    var obj2=Car2()
    var obj3=Car3("ShadhiN",10)
    println("Type is "+obj3.type);
    println("Type is Car3 "+obj3.getCarType());

}