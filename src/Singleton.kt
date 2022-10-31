fun main(){
    val single = Singleton.getInstancia()
    println(single.y)
    Singleton.getInstancia().y = 29
    println(single.y)
}