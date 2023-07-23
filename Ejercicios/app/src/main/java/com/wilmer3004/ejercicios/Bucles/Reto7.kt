package com.wilmer3004.ejercicios.Bucles

class Reto7 {
}
fun main(){
    var juego = true
    while (juego == true){
        var dado1:Int = (1..6).random()
        var dado2:Int = (1..6).random()
        println("Los dados fueron lanzados el dado #1 cayo ${dado1} y el #2 cayo ${dado2}")
        var  sum1 = dado1 + dado2
        if (sum1 == 3 || sum1 == 11 || sum1 == 2 || sum1 == 12 || sum1==7){
            println("Gano")
        }
        else if ( dado1==1 && dado2==1){
            println("Gano")
        }
        else{
            println("perdio")
        }
        println("Desea volver a lanzar el dado si o no: ")
        var respuesta = readln().lowercase()
        if (respuesta == "si"){
            juego = true
        }
        else{
            println("Usted decidio no jugar mas.")
            juego = false
        }
    }
    println("Gracias por usar nuestro programa")
}