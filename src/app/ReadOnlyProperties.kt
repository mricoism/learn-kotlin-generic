package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*
KTG.12 - ReadOnlyPROPERTY INTERFACE
- Sebelumnya kita sudah belajar tentang delegate di Kotlin
- Di Kotlin, ada sebuah interface generic yang bisa digunakan sebagai delegate property yang sifatnya readonly, alias val (immutable), namanya ReadOnlyProperty
- ReadOnlyProperty bisa digunakan sebagai delegate, sehingga sebelum data kita kembalikan, kita bisa melakukan sesuatu, atau bahkan mengubah value si property
*/

class LogReadOnlyProperties(val data: String): ReadOnlyProperty<Any, String> {
    var couter: Int = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access properties ${property.name} with value $data")
        couter++
        return data.uppercase() + couter
    }

}

class NameWithLog(param: String) {
    val name: String by LogReadOnlyProperties (param)
}

fun main() {
    val riko = NameWithLog("riko")
    println(riko.name)
    println(riko.name)
}