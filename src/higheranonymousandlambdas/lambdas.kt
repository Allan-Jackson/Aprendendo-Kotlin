package higheranonymousandlambdas

import javax.swing.JOptionPane



/* Lambdas são simplesmente funções anônimas que retornam a última expressão que contêm
 * Para referenciar uma lambda basta declarar: (params:type) -> return
 * Isso está indicando os parâmetros que a lambda deve ter e seu retorno */

/* Agora, para criar uma função lambda é quase a mesma regra, mas ela deve estar envolvida em chaves:
 *               { params:type -> return }  , caso os tipos já estiverem definidos na declaração então não
 * são obrigatóios, podendo ficar:       { params -> return }
 *
 * A última expressão de um lambda é que define seu retorno, por isso não há necessidade de usar a palavra return
 * Além disso, Lambdas podem ser armazenadas em variáveis */



fun testaCriarLambda(value: Int){

    //Declarando uma variável que vai armazenar um lambda
    var x: (Int) -> Unit  //os parênteses do typo são obrigatórios


    //criando o lambda / inicializando variável
    x = {a: Int -> print(a)} //lambda criado com o tipo explícito
    x ={b -> println(b)} //lambda com o tipo inplícito, já que a declaração de 'x' já sabe que espera uma função
    //que recebe um único parâmetro do tipo Int
    x(value)
}


/*Lambdas que não recebem nenhum parâmetro podem conter somente seu corpo*/
fun testaLambdaSemParametros(){
    //higher function pertencente ao mesmo pacote, mas em outro arquivo
    doSomethingReceivingNothing({ println("estou executando sem receber nada")})
}


/*Lambdas podem receber vários parâmetros*/

fun testaLambdaComVariosParametros(arg1: Int, arg2: String){
    val algoEhN = {n: Int, s: String ->
        var aMais10 = n + 10
        "$s é $n!" //última declaração, devolve portanto uma String
    }
    print(algoEhN(arg1,arg2))
}

/*Se o parâmetro mais a direita de uma higher function for uma função, a Lambda pode ser
 * escrita com as chaves fora dos parênteses */
fun testaLambdaComUltimoParametroSendoFuncao(arg1: List<Int>, arg2: Int){
    doSomethingToTheNFirstElementsInTheList(arg1,arg2) { a -> print(a) }
}

/*Se a higher function só recebe uma função como único argumento, então os parênteses são desnecessários */
fun testaLambdaComUnicoParametroSendoUmaFuncao(){
    doSomethingReceivingNothing {
        JOptionPane.showMessageDialog(null,"Assim que funciona!")
    }
}

/*Se a lambda não utiliza o parâmetro recebebido, então podemos ocultá-lo */
fun testaLambdaQueNaoUtilizaOParametroRecebido(){
    doSomethingWithoutUsingTheParameter {
        println("Ababá")
    }
}

/*Se a lambda recebe apenas um parâmetro, podemos não dar nome a ele e usá-lo como 'it'*/
fun testaLambdaUsandoIt(n: Int){
    doSomething(n){
        20 + it
    }
}

/*Se a lambda tiver mais de um parâmetro e não usa todos podemos chamá-los de '_' para serem ignorados*/
fun testaLambdaComVariosParametrosIgnorados(arg1: Int, arg2: String, arg3: String,){
    doSomethingIgnoringVariousParameters(arg1,arg2,arg3){
        number,_,_ ->
        println("Apenas usei o parâmetro inteiro: $number")
    }
}

/*Se uma interface possui apenas um método, então ela pode ser escrita numa sintaxe como lambda*/

fun metodoRecebeInterface(obj: InterfaceComUmMetodo){
    obj.onTest(10)
}
fun testaMetodoQueRecebeInterfaceComUmMetodoComoLambda(){
    metodoRecebeInterface {
        println(50+it)
    }
}