val food = arrayOf("Pizza","Burger","Ramen","Maggi")
fun main(){
    exist()
    println(food[3])
    food[3] = "Noodles"
    println(food[3])
    println(food.size)
    exist()
}

fun exist(){
    if ("Noodles" in food || "noodles" in food){
        println("You uncultured child, eat maggi.")
    }
    else{
        println("good.")
    }
}