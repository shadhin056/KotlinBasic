fun sum(n1:Int ,n2:Int):Int{
    var sum =n1+n2
    return sum
}

fun display(n:Int):Unit{
    println("Display function : $n")
}
fun main(args: Array<String>) {
    var r=sum(1,2)
    println("Sum value : $r")
    display(10)
}