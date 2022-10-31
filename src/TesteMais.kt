open class Outer private constructor() {
    private val a = 3
    protected open val b = 2
    internal val c = 3
    val d = 4  // public by default

    public class Nested {
        public val e: Int = 5
    }

    var outer = Outer()
    fun testandoConstPrivado(){

    }
}

fun main(){

}