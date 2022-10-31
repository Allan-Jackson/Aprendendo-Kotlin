package higheranonymousandlambdas


/*Higher Order Functions são funções que recebem ou retornam uma função*/
//Let's create one:
fun doSomethingReceivingNothing(op: () -> Unit){
    op()
}

fun doSomethingToTheNFirstElementsInTheList(list: List<Int>, n: Int, op: (Int) -> Unit){
    for (i in 0 until n)
        op(list[i])
}

fun doSomethingWithoutUsingTheParameter(func: (Int) -> Unit){
    func(10)
}
fun doSomething(n: Int, func: (Int) -> Int){
    println(func(n))
}
fun doSomethingIgnoringVariousParameters(arg1: Int, arg2: String, arg3: String, func: (Int,String,String) -> Unit){
    func(arg1,arg2,arg3)
}