package com.wilmer3004.ejercicios.ArreglosYListas

class Arreglos {
}
fun main(){
//    val array: Array<String> = arrayOf("d","e","s","a","r","r","o","l","l","o")
//     println(array.contentToString())
//    var palabra: Array<String> = arrayOf()
//
//    for (i in array){
//        palabra+="_"
//    }
//
//    for (item in array){
//        print(item)
//    }
//    println()
//
//    for((i,item) in array.withIndex()){
//        println("En la posicion de ${i} esta ${item}")
//    }
//
//    println("Ingrese una letra: ")
//    var letra =  readln().toString().lowercase()
//
//    for (i in array.indices) {
//        if (letra == array[i]) {
//            palabra[i] = letra
//        }
//        else {
//        }
//    }
//    println(palabra.contentToString())

    val list= listOf<String>("d","e","s","a","r","r","o","l","l","o")
    var list2= mutableListOf<String>("_","_","_","_","_","_","_","_","_","_")
    for (item in list){
        print(item)
    }
    println()
    for((i,item) in list.withIndex()){
        println("En la posicion de ${i} esta ${item}")
    }
    println("Ingrese una letra: ")
    var letra1 =  readln().toString().lowercase()
    for (i in list.indices) {
        if (letra1 == list[i]) {
            list2[i] = letra1
        }
        else {
        }
    }
    for (item1 in list2){
        print(item1)
    }
    println()
}
