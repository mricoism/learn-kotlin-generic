package app

interface CanSayHalo {
    fun sayHalo(name: String)
}

open class Employee

class Developer: Employee()

class CTO: Employee(), CanSayHalo {
    override fun sayHalo(name: String) {
        println("Halo $name")
    }
}



/*
KTG.07.a - GENERIC CONSTRAINT
- Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
- Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
- Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau class-class turunannya
- Secara default, constraint type untuk generic parameter type adalah Any, sehingga semua tipe data bisa digunakan
*/
class CompanyV1<T: Employee>(val employee: T) {
}

/*
KTG.07.b - WHERE KEYWORD
- Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
- Secara default, hanya satu tipe data yang bisa digunakan untuk membatasi generic parameter type
- Jika kita ingin menggunakan lebih dari satu tipe data, kita bisa menggunakan kata kunci where
*/
class CompanyV2<T>(val employee: T) where T: Employee, T: CanSayHalo

fun main() {
    val data1 = CompanyV1(Employee())
    val data2 = CompanyV1(Developer())
    val data3 = CompanyV1(CTO())
//    val data4 = Company("Riko") //ERROR

    //val data4 = CompanyV2(Employee()) //Error. Karna tidak implement CanSayHallo
    val data5 = CompanyV2(CTO())
    //val data6 = CompanyV2("RIKO") // Error. Karna bukan child dari Employee dan tidak tidak implement CanSayHallo
    CTO().sayHalo("RIKO")

}