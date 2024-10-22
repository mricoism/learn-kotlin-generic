package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/*
KTG.14 - ObserveablePROPERTY INTERFACE
- Generic interface delegate yang sebelumnya kita gunakan (ReadOnlyProperty dan ReadWriteProperty) kita perlu mengatur value datanya secara manual
- Kadang kita hanya butuh melakukan sesuatu sebelum dan setelah data nya diubah
- Untuk kasus seperti ini, kita bisa menggunakan generic class ObservableProperty
 */

class LogObserveableProperties<T>(data: T): ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
//        return super.beforeChange(property, oldValue, newValue)
        println("Before change value from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
//        super.afterChange(property, oldValue, newValue)
        println("After change value from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObserveableProperties<String>(brand)
    var year: Int by LogObserveableProperties<Int>(year)

    /*
    OBJECT DELEGATES
    Function                                    | Keterangan
    ==================================================================
    Delegates.notNull()                         | ReadWriteProperty yang nilai awal bisa null, namun error jika masih null
    Delegates.vetoable(value, beforeChange)     | ObservableProperty dengan beforeChange
    Delegates.observable(value, afterChange)    | ObservableProperty dengan afterChange
     */
    var owner: String by Delegates.notNull<String>() // Akan Error jika di run karena / jika null
    var type: String by Delegates.vetoable("") {
        property, oldValue, newValue ->
        println("Before change value from $oldValue to $newValue")
        true
    }
    var seat: Int by Delegates.observable(2) {
        property, oldValue, newValue ->
        println("After change value from $oldValue to $newValue")
    }
}

fun main() {
    val car= Car("TOYOTA", 2020)
    car.brand = "HONDA"
    println(car.brand)
    car.year = 2033
    println(car.year)

    car.owner = "Riko"
    println(car.owner) // Akan Error jika di run karena / jika null

    println(car.type)
    car.type = "Sport Car"
    println(car.type)

    println(car.seat)
    car.seat = 5
    println(car.seat)


}