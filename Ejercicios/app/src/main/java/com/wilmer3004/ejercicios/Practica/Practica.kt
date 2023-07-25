package com.wilmer3004.ejercicios.Practica

class Reto9 {
}
fun main(){
    var contP:Int = 0
    var contImp:Int = 0

    var acumP:Int = 0
    var acumImp:Int = 0

    println("Ingrese la cantidad de numeros que desea ingresar: ")
    var n:Int = readln()!!.toInt()
    for (i in 1..n){
        println("Ingrese un numero:")
        var num:Int = readln().toInt()
        if (num<=0){
            continue
        }
        else if (num%2==0){
            println("El numero es par")
            contP+=1
            acumP+=num
        }
        else {
            println("El numero es impar")
            contImp+=1
            acumImp+=num
        }
    }
    println("La cantidad de numeros pares ingresados es de: ${contP} ")
    println("La suma de numeros pares ingresados es de: ${acumP} ")
    println("La cantidad de numeros impares ingresados es de: ${contImp} ")
    println("La suma de numeros impares ingresados es de: ${acumImp} ")


}