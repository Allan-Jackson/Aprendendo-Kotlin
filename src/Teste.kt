class Pessoa3(nome: String) {
    var alto get() = true //é possível escrever assim quando o get permite ao kotlin inferir o tipo da variável. Mas o get deve ser o de linha única
    // Mesmo que a variável seja inicializada no init do construtor, é necessário inicializá-la aqui, caso haja um setter personalizado

    var nome: String = nome  //modo de criar uma propriedade para os parâmetros no construtor principal
        get(){
            return field //field se refere a própria propriedade, ou ao atributo da propriedade
            //getter com chaves deve possuir um 'return'
        }
        set(value){ //value pode ter qualquer outro nome também
            field = value
        }

    init {
        this.nome = "Cassete"
        this.alto = false
    }
}
fun main(){
    val x = Pessoa3("Allan")
    println(x.nome)
    x.alto = false
}
