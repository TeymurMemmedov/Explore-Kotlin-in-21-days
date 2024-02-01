# Bonus 1 - Daha rahat kod yazmaq üçün İDE seçimi

Gün 1-də niyə İDE ilə başlamadığımızı izah etmişdim, məqsəd Kotlin kodunun necə işlədiyini, compiler, runtime mühiti kimi anlayışları öyrənmək idi. Amma şübhəsiz ki, 2024-cü ildə IDE-siz proqramlaşdırma təsəvvür oluna bilməz.
Qısaca baxaq, nə verir IDE bizə?

### Proqramlaşdırma üçün IDE-lərin üstünlükləri:

1. **Avtomatik kod tamamlama:** - IDE-lər biz kod yazarkən nə etmək istədiyimizi təxmin edib ona uyğun classları, funksiyaları və dəyişənləri bizə göstərir. Bu xüsusiyyət həm kodlaşdırmanı sürətləndirir, həm də sintaksis səhvləri ehtimalını azaldır. Həmçinin Aİ alətləri sayəsində artıq bütöv bir kod blokunu elə IDE daxilindəcə bir neçə kliklə yazdıra bilərsiniz.
2. **Səhvlərin Aşkarlanması və Tez Düzəlişlər:** - IDE-lər proqramda səhvləri aşkarlayır, xətanı açıqlayır, hətta düzəltmək üçün yollar da təklif edir. Səhv dedikdə dilin qaydalarını açıq aşkar pozmaqdan və.s söhbət gedir. Lakin, Aİ alətlərinin köməyi ilə artıq IDE-lər alqoritmik problemləri də aşkarlayır, hətta optimallaşdırır.
3. **İnteqrasiya edilmiş build toollar:** - IDE-lər bir kliklə işə salmaq funksiyalarını təklif edir, daha sonra haqqında danışacağımız Gradle kimi build sistemlərlə inteqrasiya təmin edir. Hər dəfə terminala əmr yazmağa, hazır kod paketlərini kodunuza necə daxil edəcəyinizi düşünməyə ehtiyac qalmır.

### Yaxşı bəs hansı İDE?

Mən əsasən 3 seçimi yoxlamışam.

1. **Intellij IDEA**

    [Dokumentasiyada](https://kotlinlang.org/docs/kotlin-ide.html) ilk təklif olunan IntelliJ IDEA-dır. Bu da təsadüfi deyil, Kotlin dilinin də, bu İDE-nin də yaradıcıları Jetbrainsdir. IntelliJ IDEA, JVM dilləri üçün IDE-dir və həqiqətən yüksək səviyyədir.
    İki editionu var: Community(Free) və Ultimate(Premium).
    **Necə istifadə edim:**
    - Əvvəlcə [buradan](https://www.jetbrains.com/idea/download/?section=windows) istədiyiniz edition-u tapıb, yükləyə bilərsiniz. 
    - Kotlin plagini hər bir IntelliJ IDEA buraxılışının “üstündə gəlir”. Əvvəlki yazıda JDK-nı da yükləmişdik. Yəni bir başa [bu linkdəki addımları izləyib](https://kotlinlang.org/docs/jvm-get-started.html#create-a-project)  kodlaşdırmaya başlaya bilərsiniz.

2. **Visual Studio Code** 

    Əslində VS Code IDE deyil, text editordur. Bu text editor öz minimallığı, sadəliyi ilə seçilir. Əksər proqramçı bu editoru bir dilin fundamentallarını öyrənmək üçün ideal sayır. Həmçinin bu text editorun əsas üstünlüyü çoxlu extension dəstəyi olmasıdır, bu sayədə o bəsit editordan inanılmaz bir alətə çevrilə bilir.

    **Necə istifadə edim?**
    - Əvvəlcə [burdan](https://code.visualstudio.com/download) VS Code-u yükləyin. 
    - Daha sonra Kotlin və Code Runner extensionlarını yükləyin. Əgər keçən yazıda istifadə etdiyimiz toolları(JDK və Kotlin compiler) yükləmisizsə, hər hansı Kotlin faylını bu editorla açıb kodlaşdırmağa başlaya və bir kliklə run edə bilərsiniz. Code Runner sizin əvəzinizə lazımı əmrləri avtomatik terminaldan verəcək.
    - Necə edəcəyiniz barədə [bura göz atın](https://in-kotlin.com/ide/vscode/setup-vscode-for-kotlin-development/) . [Videolu izaha da](https://www.youtube.com/watch?v=A7nnx267pkw) baxa bilərsiniz

3. **Android Studio** 
    Məncə heç kim başlanğıc səviyyə kod run etmək üçün arxa fonda 3gb RAM tükədən bir tool istifadə etmək istəməz, amma yekun niyyətiniz Android proqramçı olmaqdırsa və performans problemi yoxdursa, Android Studio da yaxşı seçim ola bilər.

Bir yazının da sonuna gəldik. Ümid edirəm faydalı olar. Hələlik!





















