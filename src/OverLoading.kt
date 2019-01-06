fun sum1(n1:Int ,n2:Int):Int{
    var sum =n1+n2
    return sum
}

fun sum1(n1:Int ,n2:Int,n3:Int):Int{
    var sum =n1+n2+n3
    return sum
}


fun main(args: Array<String>) {
    var r1=sum1(1,2)
    println("Sum value : $r1")
    var r2=sum1(1,2,3)
    println("Sum value : $r2")

}