package higheranonymousandlambdas

class TestingLambdasHighersAndAnonymous {


}
fun main(){
    testaCriarLambda(20)
    testaLambdaSemParametros()
    testaLambdaComVariosParametros(10,"Allan")
    testaLambdaComUnicoParametroSendoUmaFuncao()
    testaLambdaQueNaoUtilizaOParametroRecebido()
    testaLambdaUsandoIt(15)
    testaLambdaComUltimoParametroSendoFuncao(listOf(1,2,3,4,5),3)
    testaLambdaComVariosParametrosIgnorados(10,"Sei la","Doidão")
    testaMetodoQueRecebeInterfaceComUmMetodoComoLambda()
}