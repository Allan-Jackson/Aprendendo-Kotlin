/* OBJETIVO: CRIAR UMA FUNÇÃO QUE CONTA A QUANTIDADE DE VOGAIS DE UMA FRASE USANDO FILTER */


//fun contaVogais("minha frase que tem vogal"): Int

fun main(){

    if("Japão" in listOf<String>("Japão", "Brasil")) println("Tem Japão na lista")

    val string= "Minha frase que tem vogais"

    val filtrada = string.filter { it.toUpperCase() in listOf<Char>('A','E','I','O','U') }

    println("${if (filtrada.any()) "sim" else "não"}")
    println("Número de vogais: ${string.filter { it.toUpperCase() in "AEIOU" }.count()}")
}

