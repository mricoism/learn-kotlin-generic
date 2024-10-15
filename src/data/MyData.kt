package data


/*
KTG.02.a - GENERIC CLASS
Generic type adalah class atau interface yang memiliki parameter type
Tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakan orang menggunakan 1 karakter sebagai generic parameter type
Nama generic parameter type yang biasa digunakan adalah :
E - Element (biasa digunakan di collection atau struktur data)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
 */

class MyDataV1<T>(val firstData: T) {
    fun printData() {
        println("Data is ${firstData}")
    }

    fun getData(): T {
        return firstData
    }
}

/*
KTG.02.b - MULTIPLE PARAMETER TYPE
- Parameter type di Generic type boleh lebih dari satu
- Namun harus menggunakan nama type berbeda
- Ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak
 */
class MyDataV2<T, U>(val firstData: T, val secondData: U) {
    fun printData() {
        println("Data is ${firstData}, ${secondData}")
    }

    fun getSecond(): U {
        return secondData
    }

    fun getData(): T {
        return firstData
    }
}