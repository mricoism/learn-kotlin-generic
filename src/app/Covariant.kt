package app

/*
KTG.05 - COVARIANT
- Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
- Tidak semua jenis class generic yang mendukung covariant, hanya class generic yang menggunakan generic parameter type sebagai return type function
- Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<Any>
- Untuk memberitahu bahwa generic parameter type tersebut adalah covariant, kita perlu menggunakan kata kunci out
 */
class Covariant<out T>(val data: T) {
    // hanya bisa return generic. tidak bisa menerima input param generic
    fun sayHalo(): T {
        return data
    }
}


fun main() {
    val covariantString: Covariant<String> = Covariant("RIKO")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.sayHalo())
}