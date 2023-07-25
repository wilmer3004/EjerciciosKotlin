package com.wilmer3004.ejercicios.Millonario

class reto5 {
}
fun main(){
    println("Bienvenido a playland")
    println("Ingrese cuantas personas desea ingresar al sistema")
    var n = readln()!!.toInt()
    for (i in 1..n){
    println("Ingrese la edad de la persona numero ${i}: ")
    var age = readln().toInt()
    when(age){
        in 0..4-> println("Su boleta es gratis")
        in 5..17-> println("Su boleta cuesta 20.000")
        in 18..60-> println("Su boleta cuesta 15.000")
        in 61..100-> println("Su boleta cuesta 3.000")
        else-> println("Ingreso una edad invalida")
    }
    }

}