package com.wilmer3004.ejercicios.Millonario

class Reto2 {
}
//Pedir al usuario un numero, sumarle 5 al numero, luego multiplicarlo por 3, y a este resultado restarle 3
//Y luego dividir entre tres y se obtendra el numero que el usuario ingreso
//preguntar si es correcto
//Soy todo_ un adivino.
//No Rectifica las cuentas te daras cuenta que no me equivoco
fun main(){
    println("Piensa un numero, ahora sumale 5, luego multiplicalo por 3, y finalmente a ese resultado restale 15 ")
    println("Ingresa el resultado: ")
    var result = readln().toInt()
    var result2= result/3
    println("¿El numero que pensaste es: ${result2}?")
    println("Ese es tu numero si o no:")
    var resp= readln()
    when(resp){
        "si"-> println("Soy todo un adivino")
        "no"->println("Rectifica las cuentas te daras cuenta que no me equivoco")
        else-> println("Tu respuesta fue incorrecta")
    }

}