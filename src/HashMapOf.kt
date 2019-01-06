fun main(args: Array<String>) {
    var map= hashMapOf(1 to "shadhin",2 to "jena")
    map.put(3,"ok")

    println(map.get(1))
    println(map[2])

    var ar= arrayOf(1,22,33,44)
    println(ar[1]);
    var list= listOf (1,22,33,44)
    println("************ All list ")
    for(i in list){
        println(i)
    }
    println("************ All Mutable list ")
    var mList = mutableListOf(1,2,3,4)
    mList[1]=22
    for (value in mList){
        println(value)
    }
}