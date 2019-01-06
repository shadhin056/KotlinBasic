
fun main(args: Array<String>) {

    var a: Int?
    a=10
    when(a){
        1-> println("a is 1")
        2,3-> println("a is 2 or 3")
        in 4..6-> println("a is 4 or 5 or 6")
        !in 7..9-> println("a is 7 or 8 or 9")
        else -> print("a is greater than 11")
    }
}