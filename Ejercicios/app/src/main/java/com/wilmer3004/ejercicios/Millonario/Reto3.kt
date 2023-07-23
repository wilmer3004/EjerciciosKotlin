package com.wilmer3004.ejercicios.Millonario

class Reto3 {
}
//Dos dados se tiran dos lados
//Se gana si se obtiene par de uno de los dados
//total de 3 en los dados
//total de once en dados
//dos o doce
//Un total de siete
//En el resto pierde
fun main() {
    var dado1: Int = (1..6).random()
    var dado2: Int = (1..6).random()
    println("Los dados fueron lanzados el dado #1 cayo ${dado1} y el #2 cayo ${dado2}")
    var sum1 = dado1 + dado2
    if (sum1 == 3 || sum1 == 11 || sum1 == 2 || sum1 == 12 || sum1 == 7) {
        println("Gano")
    } else if (dado1 == 1 && dado2 == 1) {
        println("Gano")
    } else {
        println("perdio")
    }
}