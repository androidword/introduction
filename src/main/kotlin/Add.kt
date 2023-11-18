import kotlin.Unit as Unit1

fun main (){
    println(sum(2,4))
    println("the total sum: "  + " "+ addition(10, 40))
    println(printSum(1,1))

}

fun sum (a: Int, b: Int): Int {
    return  a + b
}
fun addition (a:Int, b:Int) = a + b

fun printSum(a:Int, b: Int) : Unit1 {
    println("the sum of $b is ${a + b}")
}