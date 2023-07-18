package com.wilmer3004.ejercicios.Secuenciales

class Ejercicio2 {
}
fun main(){
    println("Ingrese el nombre de la enfermera: ")
    var nEnfermera = readLine()
    println("Ingrese el nombre de el padre del bebe: ")
    var nPadre = readLine()
    println("Ingrese el nombre del bebe: ")
    var nBebe = readLine()?.lowercase()
    println("Ingrese el peso del bebe en kg: ")
    var pesoBebe = readLine()!!.toDouble()
    println("Ingrese la cantidad de meses del bebe menores a 12 meses: ")
    var mesesBebe = readLine()!!.toDouble()
    var dosisVacuna = ((pesoBebe+10)/(mesesBebe*10))*8
    println("La enfermera ${nEnfermera} atendio al bebe ${nBebe} cuyo padre era ${nPadre}, el bebe tenía un peso ${pesoBebe} kg y ${mesesBebe} meses de nacido.")
    println("De acuerdo al peso y a los meses del bebe; al bebe se le debe de aplicar una dosis de ${dosisVacuna} ml.")
}