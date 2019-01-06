fun show (name:String):Unit{
    println("Number "+name)
}
fun show (name:Int):Unit{
    println("Number "+name)
}
fun show (name:Double):Unit{
    println("Number "+name)
}

fun main(args:Array<String>){
    show(10);
    show("10");
    show(10.5);

}