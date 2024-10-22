package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*
KTG.13 - ReadWritePROPERTY INTERFACE
- Selain ReadOnlyProperty, kita juga menggunakan interface generic ReadWriteProperty sebagai delegate
- ReadWriteProperty bisa digunakan untuk variable var (mutable)
 */

class StringLogReadWriteProperties(var data: String): ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("You get data ${property.name} is $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("You set data ${property.name} from $data to $value")
        data = value
    }
}

class Person(param: String) {
    var name: String by StringLogReadWriteProperties(param)
}

fun main() {
    val person = Person("RIKO")
    println(person.name)
    person.name = "mail"
    println(person.name)
}
