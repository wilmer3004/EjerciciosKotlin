package com.wilmer3004.ejercicios.Ciclos

class Quiz3 {
}
//    3. Se debe de crear un programa que permita instalar una aplicacion, sin que el usuario lo pregunte,
//    luego de que el sistema le haya asignado un nombre una ubicacion y una hora, al final de instalarla el sistema debe de preguntar al usuario si la quiere usar
//    si es si muestra los datos si es no se sale del programa
fun main(){
    var carga:String = ""
    var sistema = arrayOf("Nombre: Google maps", "Ubicacion: Escritorio", "Hora: 11:00")
    for (i in 1..10){
        carga=carga+"-"
        println("Descargando: ")
        println("${carga} ${i*10}")
    }
    println("La aplicacion completo su descarga")
    println("Desea usar la aplicacion si o no: ")
    var resp = readln().lowercase()
    if (resp == "si"){
        println("Los datos de la aplicacion son los siguientes")
        for (datos in sistema){
            println(datos)
        }
    }
    else{
        println("Gracias por usar nuestro programa")
    }
    println("Fin")


}