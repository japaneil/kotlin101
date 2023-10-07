var num1 = 0
fun number(){
    while (num1 < 51){
        if (num1 % 10 == 0){
            num1++
            continue
        }
        println(num1)
        num1++
    }
}
fun number1(){
    num1 = 0
    while (num1 < 51){
        println(num1)
        num1++
        if (num1 == 21)
            break
    }
    println("OVER")
}

fun main(){
    number()
    println()
    number1()
}