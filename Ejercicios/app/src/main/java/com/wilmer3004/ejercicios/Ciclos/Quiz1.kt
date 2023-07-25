package com.wilmer3004.ejercicios.Ciclos

class Quiz1 {
}
//    1. programa para jugar ahorcado y ayudarle al usuario a saber si encontro la palabra esconcida "DESARROLLO" definir
//    cantidad intentos si numero de intentos es igual a 0 perdio si encuentra la palabra gano

fun main(){
    val word1: Array<String> = arrayOf("d","e","s","a","r","r","o","l","l","o")
    var vidas = 3
    var cont1 = 0
    var cont2 = 0
    var word2:Array<String> = arrayOf()
    for (i in word1){
        word2+="_"
    }
    var n=word1.size - 1
    do{
        println("La palabra a descubrir tiene los siguientes espacios: ")
        for(palabra in word2){
            print(palabra + " ")
        }
        println()

        println("\nIngrese una letra: ")
        var letra = readln().lowercase()
//        Comparacion

        for (j in 0..n){
            cont2 = 0
        if(letra == word1[j]){
            word2[j] = letra
            cont1+=1
        }
        else{
        }
        if (cont1>0){
        }
        else{
            println("Acaba de perder una vida")
            vidas-=1
        }
            for (l in 0..n){
            if(word2[l] == word1[l]) {
            cont2+=1
            }
            else{
                cont2-=1
            }
            }
            if (cont2 == n+1){
                println("Felicidades acaba de ganar")
                vidas = 0
                break
            }

    }
    }while (vidas>0)
   if(vidas == 0 && cont2 <n+1){
       println("Usted acaba de perder")
   }
println("Gracias por usar nuestro programa")

}


