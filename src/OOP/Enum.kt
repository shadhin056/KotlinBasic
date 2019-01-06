package OOP
enum class Direction {
   NORTH,SOUTH,EAST,WEST
}
fun main(args: Array<String>) {
    var a = Direction.EAST
    if(a==Direction.SOUTH){
        println("SOUTH")
    }else{
        print("Do not know")
    }
}