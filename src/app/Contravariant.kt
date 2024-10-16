package app

/*
KTG.06 - CONTRAVARIANT
- Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
- Tidak semua jenis class generic yang mendukung contravariant, hanya class generic yang menggunakan generic parameter type sebagai parameter function
- Artinya saat kita membuat object Contoh<Any>, maka bisa disubtitusi menjadi Contoh<String>
- Untuk memberitahu bahwa generic parameter type tersebut adalah Contravariant, kita perlu menggunakan kata kunci in
 */

class Contravariant<in T> {
    fun sayHalo(data: T) {
        println("Haloo, ${data}")
    }
}

fun main() {
    val contravariantAny: Contravariant<Any> = Contravariant()
    contravariantAny.sayHalo("Riko")
    contravariantAny.sayHalo(969)

    val contravariantString: Contravariant<String> = contravariantAny
//    contravariantString.sayHalo(10) // Error

    contravariantString.sayHalo("Mail")
}