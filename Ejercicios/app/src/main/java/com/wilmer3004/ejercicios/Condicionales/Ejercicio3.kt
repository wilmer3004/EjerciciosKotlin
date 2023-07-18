package com.wilmer3004.ejercicios.Condicionales

class Ejercicio3 {

}
fun main(){
//    //Condicionales simples
//    print("Ingrese un numero: ")
//    var num1 = readln()!!.toInt()
//
//    if (num1<10){
//        println("Usted Gano")
//    }
//    else{
//        println("Usted perdio")
//    }

    //Condicionales anidados
    println("Ingrese el nombre de la fruta: ")
    var fruta = readln()?.lowercase()
    if (fruta == "manzana"){
        println("Cual es el color de la manzana:")
        var color = readln()?.lowercase()
        if (color=="rojo"){
            println("Se puede comer la manzana")
        }
        else if (color=="verde"){
            println("Manzana para ensalada")
        }
        else{
            println("Ingreso un color no valido")
        }
    }
    else if (fruta == "fresa"){
        println("Cual es el tamaño de la fresa:")
        var size = readln()!!.toInt()
        if (size<15){
            println("Fresa pequeña")
        }
        else if (size>15){
            println("Fresa grandre")
        }
        else{
            println("Ingreso un tamaño no valido")
        }
    }
    else if(fruta=="uva"){
        println("Cual es el tipo de uva:")
        var typeFruit = readln()?.lowercase()
        if (typeFruit=="chilena"){
            println("La uva cuesta 10.000 lb")
        }
        else if (typeFruit=="nacional"){
            println("La uva cuesta 8000 lb")
        }
        else{
            println("Ingreso un tipo de uva no valido")
        }
    }
    else{
        println("Ingreso un nombre de fruta no valido")
    }


    //Condicionales multiples
}