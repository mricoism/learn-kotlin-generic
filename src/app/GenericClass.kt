package app

import data.MyDataV1
import data.MyDataV2

fun main() {
    val data1: MyDataV1<String> = MyDataV1<String>("Muhammad")
    val data2: MyDataV1<String> = MyDataV1("Riko")
    val data3 = MyDataV1("Ismail")
    data1.printData()
    data2.printData()
    data3.printData()
    println()


    val multiData1: MyDataV2<String, Int> = MyDataV2<String, Int>("Muhammad", 1)
    val multiData2: MyDataV2<String, Int> = MyDataV2("Riko", 2)
    val multiData3 = MyDataV2("Ismail", 3)
    multiData1.printData()
    multiData2.printData()
    multiData3.printData()
    println(multiData1.secondData)
    println(multiData2.secondData)
    println(multiData3.secondData)
    println()
}