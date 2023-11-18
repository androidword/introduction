fun main(){

    val names  = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1,2,3,4,5)



    for (name in names){

        val n = name.replaceFirstChar { it.uppercase() }
        println(n)
    }
    println()
    for (n in numbers) println(n)


    indexes()
}

fun indexes(){
    val letters = listOf('A','B','C','D','E')

    for(index in letters.indices){
        println("$index - ${letters[index]}")
    }
    println("reverse")

    for(index in letters.indices.reversed()){
        println("$index - ${letters[index]}")

    }

}