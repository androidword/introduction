fun main() {
    val names = mutableListOf(

    "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
            )

  /*  println(names)
    println(names.size)
    println(names.contains("Nelson"))
    println(names.last())
    names.remove("Saleh")
        println(names)
    names.add("Nelson")
    println(names)
    println(names.isEmpty())
    val emptyList = mutableListOf<Any>()
    println(emptyList.isEmpty())
*/

val  (one, two, _, four )  = names
println("$one $two $four")
}