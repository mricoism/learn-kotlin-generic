package app

/*
KTG.04 - INVARIANT
- Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant
- Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
- Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Any>, begitupun sebaliknya, saat membuat object Contoh<Any>, maka tidak sama dengan Contoh<String>
 */
class InvariantV1<T>(val data: T)
class InvariantV2<T>(var data: T)

fun main() {
    val data1: InvariantV1<String> = InvariantV1("Riko")
    //val data2: InvariantV1<Any> = data1 // Error

    // Test iseng
    val data3: InvariantV2<Any> = InvariantV2(10)
    data3.data = true
    println(data3.data)
}