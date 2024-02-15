fun main2(args: Array<String>) {
         val resultWithNumber = 34
         when(resultWithNumber){
          in 0..50 -> println("Qeyri kafi")
          in 51..60 ->println("Qənaətbəxş")
          in 61..70 ->println("Kafi")
          in 71..80 ->println("Yaxşı")
          in 71..80 ->println("Yaxşı")
          in 81..90 ->println("Çox Yaxşı")
          in 91..100->println("Əla")


     }
}
fun main3(){
    val finalPoint = -12

    

    if (finalPoint >= 0 && finalPoint <= 50) {
        println("Qeyri kafi")
    } 
    else if (finalPoint >= 51 && finalPoint <= 60) {
        println("Qənaətbəxş")
    } 
    else if (finalPoint >= 61 && finalPoint <= 70) {
        println("Kafi")
    } 
    else if (finalPoint >= 71 && finalPoint <= 80) {
        println("Yaxşı")
    } 
    else if (finalPoint >= 81 && finalPoint <= 90) {
        println("Çox Yaxşı")
    } 
    else if (finalPoint >= 91 && finalPoint <= 100) {
        println("Əla")
    }
    else{
        println("Xətalı giriş!")
    }
 
    val a = if(true) println("salam") else println("elekim")
    println()
}

fun main4(args: Array<String>) {
val resultWithNumber = 34
val resultWithWord = if (resultWithNumber in 0..50) "Qeyri kafi"
                     else if (resultWithNumber in 51..60) "Qənaətbəxş"
                     else if (resultWithNumber in 61..70) "Kafi"
                     else if (resultWithNumber in 71..80) "Yaxşı"
                     else if (resultWithNumber in 81..90) "Çox Yaxşı"
                     else if (resultWithNumber in 91..100) "Əla"
                     else "Xətalı giriş!"

println(resultWithWord)
}

fun main5(args: Array<String>) {
    val number = 1
when(number){
    1 -> {println("One"); println("One")}
    2 -> println("Two")
    3-> println("Three")
}

// val number = 3
// val numberWithWord = when(number){
//     1 -> {}"One"
//     2 -> "Two"
//     3-> "Three"
//     else -> "Invalid Number"
// }

}

fun main(args: Array<String>) {
    val resultWithNumber = 89
    val resultWithWord = when(true){
          (resultWithNumber in 0..50)-> "Qeyri kafi"
          (resultWithNumber in 51..60) ->"Qənaətbəxş"
          (resultWithNumber in 61..70) ->"Kafi"
          (resultWithNumber in 71..80) ->"Yaxşı"
          (resultWithNumber in 71..80) ->"Yaxşı"
          (resultWithNumber in 81..90) ->"Çox Yaxşı"
          (resultWithNumber in 91..100)->"Əla"
          else-> "Xətalı giriş!"

    }
    println(resultWithWord)
}