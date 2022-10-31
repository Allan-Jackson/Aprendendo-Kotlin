//POLIMORFISMO NA VEIA
import javapolimorfismo.Funcionario as Func

class Tecnico(override var salario: Float): Funcionario{
    override val taxaBonus:Float = 0.05f
    //override fun calculaBonus() = 300f
}
class Gerente(override var salario: Float): Funcionario{
    override val taxaBonus:Float = 0.07f
    //override fun calculaBonus() = 500f

}
class Secretario: javapolimorfismo.Funcionario
//todos os elementos de interface são públicos
interface Funcionario{
    abstract var salario: Float
    val taxaBonus: Float
    //abstract fun calculaBonus(): Float
    fun maisSalario(aumento: Int): Float = aumento + this.salario
    companion object{
        protected var atributoEstatico = 10 //só é visível dentro do companion e do 'object Nome' que está dentro dele

        fun teste() = this.atributoEstatico; //método visível para todos, sendo acessado com 'Funcionario.teste()' ou 'Funcionario.Companion.teste()'
        object Nome{ //'object' obrigatoriamente deve receber um nome
            fun teste() = Companion.atributoEstatico + 10 //consegue acessar 'atributoEstatico' apenas usando 'Companion', pois o 'this' se refere ao próprio 'object Nome'
        }
    }
}
fun main(){
    var f1: Funcionario = Gerente(7000f)
    var f2: Tecnico = Tecnico(2500f)
    val op: String = "Gerente"
    var bonus: Float
    var c: Func = Secretario()
    c.baterPonto(22)
    bonus = when(op.toUpperCase()){
        "GERENTE" -> calculaBonus(f1)
        else -> calculaBonus(f2)
    }
    println("O bônus do $op é de $bonus")

    println(Funcionario.Companion.Nome.teste())

}
fun calculaBonus(funcionario: Funcionario): Float{
    return (funcionario.salario*funcionario.taxaBonus)
}