# Gün 0 : Kotlini tanıyaq!
Birbaşa kodlaşdırmaya keçməzdən əvvəl Kotlin dünyasına daha əmin addımlara daxil olaq. Gəlin oyuna gec qoşulsa da, Android mühitini və developerlərin qəlbini fəth edən, Java kimi nəhəng bir dili devirən bu dilə ümumi nəzər yetirək.

Kotlin nədir? Sualı ilə yola çıxsaq, cavabını Kotlinin dokumentasiyasında belə taparıq:
Kotlin JVM, Android, JavaScript, Wasm və Native-i hədəfləyən açıq mənbəli, statik tipli proqramlaşdırma dilidir.

1. **Açıq mənbəlidir** - Kotlinin source kodu [Githubda](https://github.com/JetBrains/kotlin)  mövcuddur və proqramçılar ona baxa, özləri üçün modifikasiya edə bilərlər. 
2. **Statik tipli proqramlaşdırma dilidir** - [Statik tipli proqramlaşdırma dillərində type-checking kompilyasiya zamanı baş verir.](https://www.baeldung.com/cs/statically-vs-dynamically-typed-languages) Bu o deməkdir ki, hər bir dəyişənə hansı tipdə dəyər mənimsədildə biləcəyi əvvəldən məlum olmalıdır. Yəni siz “salam” sözünü 3-ə riyazi olaraq bölməyə cəhd belə edə bilməyəcəksiniz, compiler bu riski anlayır və əvvəldən sizi bu xətadan qoruyur. Gələcək yazılara kiçik bir “spoiler” : Kotlin bildiyimiz (C#, Java, C++) statik tipli dillər kimi deyil :)
3. **Kotlin JVM-i hədəfləyir** : Kotlin bytecode-a compile oluna və Java Virtual Maşınında (JVM) işlədilə bilər. Bu o deməkdir ki, o, mövcud Java kodları iç-içə, qarşılıqlı əlaqədədir 
Bu xüsusiyyət hansı üstünlükləri gətirir?
- Layihədə Kotlin və Java faylları birgə mövcud ola bilər
- Kotlin istənilən Java kitabxanasından və ya frameworkündən problemsiz istifadə edə bilər. Kotlin "mirasdan" xeyli faydalanır. Məsələn, Kotlin mobil proqramlaşdırmada Anroid SDK, Retrofit, backend web proqramlaşdırmada Spring kimi böyük Java strukturlarını çox effektiv istifadə edir.

- Java ilə Kotlin iş birliyini daha çox araşdırmaq üçün [bu qaynağa](https://kotlinlang.org/docs/jvm-get-started.html) baxın.
- "Android proqramlaşdırmada Java&Kotlin ikilisini necə birgə istifadə etmək olar?" sualı üçün isə [bu qaynağa](https://developer.android.com/kotlin/interop) baxın

**Bundan sonraki bəndlər o qədər də vacib deyil fikrimcə, istəsəniz yazının sonuna keçə bilərsiniz.**

4. **Kotlin Javascripti hədəfləyir** - Kotlin kodundan JavaScript kodu generate edilə bilər, yəni Kotlin dolayı yolla web-browser mühitində də işləyir. Daha çoxu üçün [bura baxın](https://kotlinlang.org/docs/js-overview.html)
5. **Kotlin WASM-ı hədəfləyir** - Kotlin kodu web-browser yüksək performanslı işləri görə bilmək üçün yaradılmış, ikilik təlimatlara əsaslananan WebAssembly-ə də çevrilə bilir. Daha çoxu üçün [bura baxın](https://kotlinlang.org/docs/wasm-overview.html)
6. **Kotlin Native-i dəstəkləyir**  - Kotlin  birbaşa aparat üzərində işləməyə imkan verən local kompilyasiyanı dəstəkləyir. Daha çoxu üçün [bura baxın](https://kotlinlang.org/docs/native-overview.html)

Bura qədər oxudunuzsa təşəkkür edirəm, və suallarınız, əlavələriniz olduqda bildirməyinizi xahiş edirəm. Növbəti gün/yazıda Kotlində minimal bir kodu necə yazıb, necə işlədə biləcəyimizi görəcəyik. Hələlik!
