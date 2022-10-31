public class Pessoinha(peso: Float){
    var peso: Float = peso
        get() {
            return peso + 0.01f
        }
        set(value) {
            println("Set foi chamado")
            field = value
        }

    var isFlex get() = true



    init {
        this.isFlex = false
    }

    override fun toString(): String {
        return "Pessoinha(peso=$peso)"
    }
}

fun main(){
    var p = Pessoa(2003, "Allan Jackson")

    p.anoNascimento = 2010
    println(p.anoNascimento) //usou o método getAnoNascimento que retorna o ano: "2010" + 2

    println(p.nome)
}