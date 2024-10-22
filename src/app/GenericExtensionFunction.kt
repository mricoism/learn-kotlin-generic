package app

class Data<T>(val data: T)

fun Data<String>.print() {
    val data = this.data
    println(data)
}

//fun Data<Int>.print() { // ERROR KARENA DUPLICATE. JADI LEBIH BAIK GANTI NAMA FUNGSINYA LEBIH SPESIFIK
//    val data = this.data
//    println(data)
//}

fun Data<Boolean>.printBool() {
    val data = this.data
    println(data)
}

fun main() {
    val data1 = Data(1)
    val data2 = Data("Riko")
    val data3 = Data(true)

//     data1.print() // Error
    data2.print()
    data3.printBool()

}