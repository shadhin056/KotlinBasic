package OOP
class Gen<T>(credit:T){
    init {
        println(credit)
    }
}class Generic2<T,F>(credit:T,id:F){
    init {
        println("2 is $credit and $id")
    }
}
fun<T>display(process:T){
    println(process)
}
fun main(args: Array<String>) {
    var generic1=Gen<String>("shadhin");
    var generic2=Gen<Int>(123);

    var generic3=Generic2<Int,String>(123,"Shadhin");
    var generic4=Generic2<Int,Int>(123,123);

    display<Int>(22)
    display<String>("22")
}