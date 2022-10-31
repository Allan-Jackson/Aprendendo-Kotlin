enum class Periodo() {
    DIURNO(1),
    NOTURNO(2),
    MAIS_DIAS(3), INTEGRAL(4);
    var id: Int = 0
    private set



    constructor(id: Int): this(){
        this.id = id
    }
}
enum class Prioridade(var id: Int){
    ALTA(3){
        override fun toString(): String {
            return "ALTÍSSIMA! HORA DE FICAR PREOCUPADO!!!"
        }
    },
    MEDIA(2),
    BAIXA(1);

    override fun toString(): String {
        return "sou Geral!"
    }
}
fun main(){

}