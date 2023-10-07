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

fun main(){
    number()
}