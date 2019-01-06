fun main(args: Array<String>) {
    var arrayList=ArrayList<String>()
     arrayList.add("shadhin")
     arrayList.add("parvez")
     arrayList.add("jahid")

    println("First name "+arrayList.get(0))
    arrayList.set(0,"Lyla")
    println("First name "+arrayList.get(0))

    if(arrayList.contains("Lyla")){
        println("Name is found")
    }else{

        println("Name is Not found")
    }
    println("All element in array : ")
    for (index in 0..arrayList.size-1){
        println(arrayList.get(index))
    }
}