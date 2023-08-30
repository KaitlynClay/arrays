fun main(args: Array<String>) {
    // veggies in a fridge

    var veggies = arrayOf("Tomato", "Lettuce", "Spinach", "Carrot", "Brussels Sprouts")
    var numOfVeggiesStr = arrayOf("6", "1", "0", "0", "8")
    var x = 0
    var i = 0

    println("Veggies is fridge: ${veggies.size}")
    println("=======================")

    while (x < veggies.size){
        println("${veggies[x]}")
        x++  // x = 1 + x
        if (i < numOfVeggiesStr.size){
            println("${numOfVeggiesStr[i]}")
            i++  // x = 1 + x
        }
    }


}