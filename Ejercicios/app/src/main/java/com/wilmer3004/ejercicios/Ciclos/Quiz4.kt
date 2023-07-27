package com.wilmer3004.ejercicios.Ciclos

class Quiz4 {
}
fun main(){
    val word1: MutableList<String> = mutableListOf("d","e","s","a","r","r","o","l","l","o")
    var vidas = 3
    var cont1 = 0
    var cont2 = 0
    var word2:Array<String> = arrayOf()
    for (i in word1){
        word2+="_"
    }
    var n=word1.size - 1
    do{
        println("Usted actualmente posee ${vidas} vidas")
        println("La palabra a descubrir tiene los siguientes espacios: ")
        for(palabra in word2){
            print(palabra + " ")
        }
        println()

        println("\nIngrese una letra: ")
        var letra = readln().lowercase()
//        Comparacion
        var cont3 = 0
        for (j in 0..n) {
            cont2 = 0
            if (letra == word1[j]) {
                word2[j] = letra
                cont1 += 1
            } else {
                cont3+=1
            }
        }
        if (cont3==n+1){
            println("Acaba de perder una vida")
            vidas-=1
        }
        else{
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
    }while (vidas>0)
    if(vidas == 0 && cont2 <n+1){
        println("Usted acaba de perder")
    }
    println("Gracias por usar nuestro programa")

}


