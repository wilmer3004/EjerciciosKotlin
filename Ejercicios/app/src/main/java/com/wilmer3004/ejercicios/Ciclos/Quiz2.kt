package com.wilmer3004.ejercicios.Ciclos

class Quiz2 {
}
//    2. Se deben de diseñar un programa que permita registrar pqrs, digitar nombre, documento. tipo de pqr y descripcion,
//    debe de mostrar cuantas pqr ingreso y si desea registrar otra, preguntar si se desea registrar una pqr
fun main(){
    var cont = 0
    println("Desea registrar una pqrs si o no:")
    var pqrs = readln().lowercase()
    if(pqrs == "si"){
        while (pqrs =="si") {
            println("Ingrese su nombre: ")
            var nombre = readln()
            println("Ingrese su documento: ")
            var documento = readln().toInt()
            println("Ingrese el tipo de pqrs: ")
            var tipo = readln()
            println("Ingrese la descripcion que tendra la pqrs: ")
            var descripcion = readln()
            cont+=1
            println("Hasta el momento ha ingresado ${cont} pqrs")
            println("Desea ingresar otra pqrs")
            pqrs = readln().lowercase()
        }

    }
    else if(pqrs == "no"){
        println("Decidio no registrar una pqrs")
    }
    else{
        println("Ingreso un dato no valido por lo tanto no pudo ")
    }
    println("Gracias por usar neustro programa")




}