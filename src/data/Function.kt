package data

class Function(val name: String) {

    /*
    KTG.03 - GENERIC FUNCTION
    Generic parameter type tidak hanya bisa digunakan pada class atau interface
    Kita juga bisa menggunakan generic parameter type di function
    Generic parameter type yang kita deklarasikan di function, hanya bisa diakses di function tersebut, tidak bisa digunakan di luar function
    Ini cocok jika kita ingin membuat generic function, tanpa harus mengubah deklarasi class
     */
    fun <T> pitted(param: T) {
        println("behind ${name} is ${param} using soft tire, ")
    }

}