package com.wilmer3004.ejercicios.Millonario

class Reto4 {
}

//mayor que 50000
//Si sacas rojo 10%
//azul 30%
//amarilla 50%
//blanca gratis


fun main(){
println("Bienvenido al supermercado Noe ")
    println("Ingrese el valor de su compra: ")
    var compra = readln().toInt()
    var bolita=(1..4).random()

    var descuento = 0.0
    if(compra>50000){
        if(bolita==1){
            descuento = (compra*0.1)+compra
           println("Usted ha ganado un 10% ya que su bolita es roja de descuento y ahora compra cuesta ${descuento}" )
        }
        else if(bolita==2){
            descuento = (compra*0.3)+compra
            println("Usted ha ganado un 30% ya que su bolita es azul de descuento y ahora compra cuesta ${descuento}" )
        }
        else if(bolita==3){
            descuento = (compra*0.5)+compra
            println("Usted ha ganado un 30% ya que su bolita es amarilla de descuento y ahora compra cuesta ${descuento}" )
        }
        else if(bolita==4){
            println("Usted ha ganado que su compra sea gratis ya que su bolita es blanca " )
        }
        else{
            println("Dato invalido")
        }
    }
    else{
        println("Su compra es inferior a 50000")
    }

}