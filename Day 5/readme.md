# Gün 5 : Kotlində Control Flow Part 3

Xatırlayırsınızsa [Gün 3-də](https://medium.com/@teymurmemmedov314/g%C3%BCn-3-kotlind%C9%99-control-flow-part-1-ca5c1bf57f02) [FizzBuzz](https://leetcode.com/problems/fizz-buzz/description/) məsələsinin sadələşdirilmiş versiyasını həll etmişdik. Həmin yazıdakı yekun kodu [Gün 4-də]() öyrəndiyimiz when expression istifadə edərək yenidən, daha optimal variantda yazaq.

```
val n = 14

val result = when {
    n % 3 == 0 && n % 5 == 0 -> "FizzBuzz"
    n % 3 == 0 -> "Fizz"
    n % 5 == 0 -> "Buzz"
    else -> n
}
```

*İndi isə biliklərimi daha da artırmaq üçün FizzBuzz-ın nisbətən mürəkkəb versiyasına baxaq*

> Təsəvvür edin ki sizə bir n tam ədədi(məsələn 12) verilir, və istənir ki [1,n] intervalındakı hər bir ədədi gözdən keçirib, aşağdakı şərtlərə müvafiq yazıları ekrana çıxarasınız:
- Həm 3-ə, həm 5-ə bölünürsə - > FizzBuzz 
- 3-ə bölünürsə - > Fizz 
- 5-ə bölünürsə - > Buzz 
- Nə 3-ə, nə də 5-ə, heç birinə bölünmürsə - > Ədədin özü

**Proqramın özəyi eyni qalsa da, bu versiyada biz tək bir ədədi yox, bir neçə ədədi gözdən keçirməli, eyni təlimatları dəfələrlə tətbiq etməliyik.**

*Proqramlaşdırmada, təbii olaraq Kotlində də bu məqsədə çatmaq üçün **loop**(dövr, döngü) strukturları mövcuddur.*

> Loop strukturları  verilən şərt ödəndikcə təlimatları davamlı olaraq yerinə yetirməyə imkan verir. 

Kotlindəki loop strukturları aşağıdakılardır:
- **repeat**
- **for** 
- **while** 
- **do while**

Biz bu yazıda **for** və **while** üzərində duracayıq.

### while strukturu haqda

**while-ın ümumi strukturu belədir:**
```
while (condition) {
    // body
}
```

**while dövrü **condition** true olduğu müddətcə **body**-ni dayanmadan icra edir.**

"Dayanmadan icra edirlər"-i anlamaq üçün nümunə verim:
```
while(true){
	println("Hello")
}
```
*Bu kodun icrasını manual olaraq sonlandırmasanız(kompyuteri söndürmək, İDE-dən çıxmaq vs) saatlar boyu ekrana "Hello" yazısını çıxara bilər.*

**Yaxşı bəs mən cəmi 10 dəfə "Hello" çap etmək istəyirəmsə? Bu halda "idman müəllimi" roluna bürünüb, kompyuteri hər dəfə print etdikcə "biiir", "ikiii" deyə sayaraq yönləndirməliyik.**

```
/*
Evvelce proqramın gedişatında neçenci addımda olduğumuzu
gösteren deyişeni yaradaq */
var counter:Int = 0 

//Eger counter 10-dan kiçikdirse, body i.e düşecek, ekrana Hello çıxacaq.
//Eger counter 10-a beraber, yaxud 10-dan böyükdürse, dövr terk edilecek
while(counter<10){
	println("Hello")
	counter = counter + 1 //Burda counteri artiririq, bir nov deyirik 'biiir, ikiii'
}
```

*While-ın ümumi davranışını və "sayma" məntiqini qavradıqsa, artıq başlanğıc məsələmizi həll edə bilərik.*

```
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
}
```

**while, dövr sayının öncədən bilinmədiyi yaxud şərtə bağlı olduğu hallarda istifadəyə yararlıdır.**

**Lakin məsələmizə diqqətlə baxsaq, hansı intervalda çalışacağımız, neçə dəfə iterasiya edəcəyimiz bəllidir. Bu hallar üçün daha oxunaqlı və uyğun struktur **for** strukturudur.**

### for strukturu haqda
for iterasiya sayı bəlli olduqda, **range** və **array**, **collection** tipli data tiplərlə işləyərkən əlverişlidir. Adını çəkdiyim data strukturlaın tiplərin ortaq xüsusiyyəti [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/) olmaqdır. Səthi olaraq Iterable olmaq o deməkdir ki, biz həmin o arrayin, range-in içində rahatlıqla "gəzinə bilərik" və bir **iterator dəyişən** təyin edib, manual olaraq *addım saymaqdan* qurtula bilərik. **iterator**-un dəyəri hər dövrdə müvafiq olaraq bir növbəti elementə bərabər olacaq, və biz həmin dəyər üstündə lazımı işləri görəcəyik.

*Kotlində for strukturu digər dillərdəki foreach strukturuna bənzəyir:*
```
for (iterator in iterable) {
    // body
}
```

**Məsələn bizə ədədlərdən ibarət array verilir və tələb olunur ki onları ekrana çap edək.**

```
val nums = arrayOf(12,24,49,68,9,43,81)
for (i in nums){
	// her iterasiyada i-nin deyeri sıra ile 12, 24, 49.... deyerlerini alacaq
	// Meselen ilk iterasiyada deyer 12-dir. İkincide 24 olacaq, üçüncüde 49...
	println(i) // ekrana 12,sonra 24, sonra 39, sonra... cixacaq
}
```

*for-un ümumi strukturunu anladıqsa məsələmizin həllinə keçək*

```
fun main(){
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
```


Beləliklə bu günün də problemini həll etdik. Bura qədər oxudunuzsa, təşəkkür edirəm. Növbəti yazıda **Kotlində Funksiyalar** mövzusuna giriş edəcəyik. 
