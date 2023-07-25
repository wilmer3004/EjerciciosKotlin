package com.wilmer3004.ejercicios.Practica

class Practica3 {
}
fun main(){
    var fibonacci: MutableList<Int> = mutableListOf(0,1)
    for(i in 1..20){
        var suma =0
        suma =suma + fibonacci[i-1] + fibonacci[i]
        fibonacci.add(suma)
    }
    for(element in fibonacci){
        println(element)
    }

}