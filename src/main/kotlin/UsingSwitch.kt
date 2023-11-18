 fun main(){

     val gender = "M"

   val g=  when(gender) {
         "F" -> "FEMALE"
         "M" -> "MALE"
         else -> {
             "UnKnown Gender"
         }
     }
     println(g)

     val age = 18
   val k =  when(age) {
     in  13..19 -> "Teeenager"
         in 0..12 -> "Kids"
         else -> "baby"

     }
     println(k)
 }