fun main(){
// test üçün istədiyiniz ədədi verin
val n = 15 

//şərtləri qurmağa başlayaq
if(n%3==0 && n%5==0) {
    println("FizzBuzz")
}
/*
Məsələn condition1 true olsa, body1 işə düşsə, kodun icrası sonlanacaq, çünki şərt strukturlarından sonra heç bir sətir yoxdur. 
*/

//Şərtlərə davam edək
else if(n%3==0){
    println("Fizz")
}

else if(n%5==0){
    println("Buzz")
}
//Heç biri ödənməsə else bloku işə düşür, və kod icrası sonlanır
else{
    println(n)
}
}