package com.wilmer3004.ejercicios.Secuenciales

class Ejercicio1 {
}
fun main(){
//Reto de la abuela
    println("Ingrese la temperatura en °F que desea convertir a °C")
    var f = readLine()!!.toDouble()
    var c = ((f-32)/1.8)
    println("La temperatura que debe de colocar la abuela en su horno de °C es de: ${c}  °C ")
}