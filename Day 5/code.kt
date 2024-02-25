fun main(){
    val n = 10 //10 özü de daxil olmaqla, 10-a qeder ededleri "FizzBuzz" etmeliyik
    //Alqoritmik meselelerde counterlar-a adeten i, j kimi herf adları qoyuruq
    var i:Int = 1
        while(i<=n){
            val result = when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i 
            }	
            println(result)

            i++ // 'i = i + 1' ifadesinin qısaldılmış halı
        }
    println("--------------------------------------------------------")
    val number = 15
    val myRange = 1..number
        for(i in myRange){
            val result = when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i
            }
            println(result)
        }
}