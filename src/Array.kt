fun main(args: Array<String>) {
    var arrayStr=Array<String>(4){""}
    for (index in 0..3){
        println("arrayStr[$index]=")
        arrayStr[index]= readLine()!!
    }
    println("Display value ")
    for (index in 0..3){
        println("arrayStr[$index]="+arrayStr[index])
    }
}