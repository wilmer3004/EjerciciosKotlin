package com.wilmer3004.ejercicios.ArreglosYListas

import java.util.Date

class Reto10 {
}
fun main(){
   //Solicitar la cantidad de aprendices que se desea ingresar
    println("Ingrese la cantidad de aprendices que desea ingresar:")
    var aprendices = mutableListOf<Array<String>>()
    var cont = 0
    println("Desea ingresar un aprendiz si o no:")
    var resp = readln().toString().lowercase()

    // Añadir a los aprendices
    while (resp=="si"){
        cont+=1
        println("Ingrese el nombre del aprendiz #${cont}:")
        var name = readln()!!.toString()
        println("Ingrese el numero de documento del aprendiz #${cont}:")
        var numDoc = readln()!!.toString()
        println("Ingrese el correo electronico del aprendiz #${cont}:")
        var email = readln()!!.toString()
        println("Ingrese la fecha de nacimiento en el formato (00-00-0000) del aprendiz #${cont}:")
        var fechaNac = readln()!!.toString()
        aprendices.add(arrayOf(numDoc, name,email,fechaNac))
        println("Desea ingresar otro aprendiz si o no:")
        resp = readln().toString().lowercase()
    }
    //Mostrar a todos los aprendices
    for (x in aprendices.indices){
        println("El aprendiz esta en la posicion #${x}")
        for(y in 0..3){
            println(aprendices[x][y])
        }
        println()
    }


    //Mostrar al aprendiz segun el documento
    println("Ingrese el numero de documento del aprendiz que desea consultar:")
    var consultND = readln().toString()
    for(x in aprendices.indices){
        if(aprendices[x][0]==consultND){
            for (i in 0..3){
                println(aprendices[x][i])
            }
        }
        else{}
    }
//Consultar por posicion
    println("Ingrese el numero de la posicion del aprendiz que desea consultar:")
    var consultId = readln().toInt()
    for((x,item) in aprendices.withIndex()){
        if(x==consultId){
            for (i in 0..3){
                println(aprendices[x][i])
            }
        }
        else{}
    }
//Modificar datos

    println("Ingrese el numero de documento del aprendiz que desea modificar:")
    var numdoc1 = readln().toString()
    for(x in aprendices.indices){
        if(aprendices[x][0]==numdoc1){

            for (i in 0..3){
                println(aprendices[x][i])
            }
            println("Ingrese el nombre del aprendiz #${cont}:")
            var name1 = readln()!!.toString()
            println("Ingrese el numero de documento del aprendiz #${cont}:")
            var numDoc1 = readln()!!.toString()
            println("Ingrese el correo electronico del aprendiz #${cont}:")
            var email1 = readln()!!.toString()
            println("Ingrese la fecha de nacimiento en el formato (00-00-0000) del aprendiz #${cont}:")
            var fechaNac1 = readln()!!.toString()
            aprendices[x]= arrayOf(numDoc1,name1,email1,fechaNac1)

            for (i in 0..3){
                println(aprendices[x][i])
            }
        }else{}
    }
    // remplazar un aprendiz por otro
    println("Ingrese el nombre del aprendiz que va a remplazar")
    var nameApr = readln().toString()
    println("Ingrese el nombre del aprendiz por el cual lo va a remplazar")
    var nameApr1 = readln().toString()
    for((x,item) in aprendices.withIndex()){
        if(aprendices[x][1]==nameApr){
            aprendices[x][1]=nameApr1
            for (i in 0..3){
                println(aprendices[x][i])
            }
        }
        else{}
    }

    //Limpia nuestra lista
    aprendices.clear()
    println(aprendices[0][0])
    println("Gracias por usar nuestro programa")

/*

    var cont=0

    var aprendices = mutableListOf<Array<String>>()
    println("Ingrese el nombre del aprendiz #${cont}:")
    var name= readln()!!.toString()
    println("Ingrese el numero de documento del aprendiz #${cont}:")
    var numdoc = readln()!!.toString()
    println("Ingrese el correo electronico del aprendiz #${cont}:")
    var email = readln()!!.toString()
    println("Ingrese la fecha de nacimiento en el formato (00-00-0000) del aprendiz #${cont}:")
    var fechaNac = readln()!!.toString()
    aprendices.add(arrayOf(name,numdoc,email,fechaNac))
    println("Ingrese el nombre del aprendiz #${cont}:")
    name= readln()!!.toString()
    println("Ingrese el numero de documento del aprendiz #${cont}:")
     numdoc = readln()!!.toString()
    println("Ingrese el correo electronico del aprendiz #${cont}:")
     email = readln()!!.toString()
    println("Ingrese la fecha de nacimiento en el formato (00-00-0000) del aprendiz #${cont}:")
     fechaNac = readln()!!.toString()
    aprendices.add(arrayOf(name,numdoc,email,fechaNac))

    for (x in aprendices.indices){
        println("El aprendiz esta en la posicion #${x}")
        for(y in 0..3){
            println(aprendices[x][y])
        }
        println()
    }

*/

}