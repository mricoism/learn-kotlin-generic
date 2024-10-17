package app

/*
KTG.09 - STAR PROJECTION
- Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
- Misal kita hanya ingin mengambil panjang data Array<T>, dan kita tidak peduli dengan isi data T nya
- Jika kita mengalami kasus seperti ini, kita bisa menggunakan Star Projection
- Star projection bisa dibuat dengan mengganti generic parameter type dengan karakter * (star, bintang)
*/

fun displaylenght(array: Array<*>) {
    println("Total array: ${array.size}")
}

fun main() {
    val number = arrayOf(44, 16, 55)
    val driver = arrayOf("Lewis", "Leclerc", "Sainz", "new Rookiee")
    displaylenght(number)
    displaylenght(driver)
}