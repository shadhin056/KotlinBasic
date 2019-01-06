fun main(args: Array<String>) {

    //Duplicate data not count
    //can not add more value
    var setElement= setOf(1,2,3,4,4)
    for(element in setElement){
        println(element)
    }

    var setElemnetM= mutableSetOf(1,2,3)
    setElemnetM.add(77)
    for(elment in setElemnetM){
        println("All Data $elment")
    }
}