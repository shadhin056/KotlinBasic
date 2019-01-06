
fun main(args: Array<String>) {
    println("Please Enter Name ");
    var name: String? = readLine();
    println("Your name is :"+name);
    println("Please Enter age ");
    var age: Int? = readLine()?.toInt();
    println("Your age is :"+age);
}