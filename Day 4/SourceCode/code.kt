fun main() {
    val finalPoint = 91
    val resultWithWord = when(finalPoint)
    {
        in 0..50 -> "Qeyri kafi"
        in 51..60 ->"Qənaətbəxş"
        in 61..70 ->"Kafi"
        in 71..80 ->"Yaxşı"
        in 71..80 ->"Yaxşı"
        in 81..90 ->"Çox Yaxşı"
        in 91..100->"Əla"
        else -> "Xətalı giriş"
    }
    println(resultWithWord)
}