fun main(){

    val n1 = 100
    val  n2 = 20

   /* val value = if ( n1 >= n2 && n1 <= 30){
        println("%%%")
        "correct"
    }
    else{
        println("******______******-----*****")
        " not correct, please try again"
    }

    println(value)
    */

    val v = if (n1 <= n2 ) " correct"
    else if (n1 == 100) "are you sure this is not python syntax"
    else " not correct"
    println(v)
}