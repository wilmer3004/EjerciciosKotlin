package com.wilmer3004.ejercicios.Millonario

class Reto1 {
}
//Preguntar edad
//0 y 4 AÑOS  entra gratis
// mayor a 4 y menor a 18 paga 20.000
//entre 18 y 60 años paga 15.000
//mayor 60 paga 3.000
fun main(){
    println("Bienvenido a playland")
    println("Ingrese su edad: ")
    var age = readln().toInt()
    when(age){
        in 0..4-> println("Su boleta es gratis")
        in 5..17-> println("Su boleta cuesta 20.000")
        in 18..60-> println("Su boleta cuesta 15.000")
        in 61..100-> println("Su boleta cuesta 3.000")
        else-> println("Ingreso una edad invalida")
    }

}