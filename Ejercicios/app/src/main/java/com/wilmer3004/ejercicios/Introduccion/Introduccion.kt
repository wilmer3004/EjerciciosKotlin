package com.wilmer3004.ejercicios.Introduccion

class Introduccion {
}
fun main() {
//     println("Hello world")
//     var name:String = "Wilmer Andres Capera Hernandez"
//     var edad:Int = 18
//     var hobbie:String = "Escuchar musica \nJugar videojuegos \nEstudiar "
//     println("Mis Datos: \n${name} \n${edad} \n${hobbie}")
//     Reto1
// 	var deporte:String = "Baloncesto\n"
//     val pi:Double = 3.1416
//     var letra:String = "T\n"
//     var saludo:String = "Bienvenido Sra Tatiana en que puedo ayudar\n"
//     var sexo:String = "Femenino\n"
//     var dato:Boolean = false
//     var decimal:Double = 1.11
//     var numero:Int = 10000000
//     println("${deporte}${pi}\n${letra}${saludo}${sexo}${dato}${decimal}\n${numero}\n")
//
//     Reto2
//
//     var letra = "J"
//     var nombre = "Juan"
//     var apellido = "Jaramillo"
//     var cosa = "Jabon"
//     var color = "Jasmin"
//     var fruta = "Jalapeño"
//     var ciudad= "Jamaica"
//         println(" Letra: ${letra}\n Nombre: ${nombre}\n Apellido: ${apellido}\n Cosa: ${cosa}\n Color: ${color}\n Fruta: ${fruta}\n Ciudad: ${ciudad}\n")
// //     Reto 3
//     var letra = "H"
//     var nombre = "Herson"
//     var apellido = "Hernandez"
//     var cosa = "Hueso"
//     var color = "Habano"
//     var fruta = "Higo"
//     var ciudad= "Holanda"
//         println(" Letra: ${letra}\n Nombre: ${nombre}\n Apellido: ${apellido}\n Cosa: ${cosa}\n Color: ${color}\n Fruta: ${fruta}\n Ciudad: ${ciudad}\n")

// //   Reto 4
//     var letra = "F"
//     var nombre = "Felipe"
//     var apellido = "Fajardo"
//     var cosa = "Filamento"
//     var color = "Fucsia"
//     var fruta = "Fresa"
//     var ciudad= "Filipinas"
//         println(" Letra: ${letra}\n Nombre: ${nombre}\n Apellido: ${apellido}\n Cosa: ${cosa}\n Color: ${color}\n Fruta: ${fruta}\n Ciudad: ${ciudad}\n")
// //  Reto 5
//     var letra = "N"
//     var nombre = "Nicol"
//     var apellido = "Nuñez"
//     var cosa = "Nudo"
//     var color = "Negro"
//     var fruta = "Naranja"
//     var ciudad= "Nicaraguas"
//         println(" Letra: ${letra}\n Nombre: ${nombre}\n Apellido: ${apellido}\n Cosa: ${cosa}\n Color: ${color}\n Fruta: ${fruta}\n Ciudad: ${ciudad}\n")
    // 	println("Ingrese su nombre:")
    // 	var nombre=readLine()
    //     println("Ingrese su edad:")
    //     var edad =readLine()
    //     println("Su nombre es: ${nombre} y su edad es: ${edad}")

    println("Ingrese su primer numero: ")
    var num1 = readLine()!!.toDouble()
    println("Ingrese su segundo numero: ")
    var num2 = readLine()!!.toDouble()

    var suma = num1 + num2
    var resta = num1 - num2
    var multiplicacion = num1 * num2
    var division = num1 / num2
    var modulo = num1 % num2

    println ("Los resultados de sus dos numeros son: \nSuma: ${suma}\nResta: ${resta} \nMultiplicacio: ${multiplicacion}\nDivision: ${division}\nModulo: ${modulo}")




}