fun main(){
    var opcao = true
    while (opcao === true){
        println("CALCULADORA SIMPLES!!!")
        println("<<< Escolha a operação desejada >>>")
        println("1 - Soma")
        println("2 - Subtração")
        println("3 - Divisão")
        println("4 - Multiplicação")
        println("5 - Sair")
        println("> ")
        when (readLine()!!){
            // Opções
            "1" -> {toSoma()}
            "2" -> {toSubtracao()}
            "3" -> {toDivisao()}
            "4" -> {toMutiplicacao()}
            "5" -> {opcao = false}
            else -> { println("Opção Inválida - Tente Novamente") }
        } //fim when

    } //fim while
} // fim main

fun toSoma() {
    val soma: (Float, Float) -> Unit = { x, y -> println(x.plus(y)) }
    //Primeiro numero da operação N1
    println("1º Número: ")
    val n1:String = readLine()!!

    println("2º Número: ")
    val n2:String = readLine()!!

    //chama a função de ordem superior
    soma(n1.toFloat(), n2.toFloat())
    Thread.sleep(3000)
}

fun toSubtracao() {
    val subtrir: (Float, Float) -> Unit = { x, y -> println(x.minus(y)) }
    //Primeiro numero da operação N1
    println("1º Número: ")
    val n1:String = readLine()!!

    println("2º Número: ")
    val n2:String = readLine()!!

    //chama a função de ordem superior
    subtrir(n1.toFloat(), n2.toFloat())
    Thread.sleep(3000)
}

fun toDivisao() {
    val divide: (Float, Float) -> Unit = { x, y -> println(x.div(y)) }
    //Primeiro numero da operação N1
    println("1º Número: ")
    val n1:String = readLine()!!

    println("2º Número: ")
    val n2:String = readLine()!!

    //Teste condição de divisão por ZERO
    if (n2.toFloat() > 0f) divide(n1.toFloat(), n2.toFloat()) else println("Número Inválido!\nDivisão por ZERO\nTente Novamente\n\n")
    Thread.sleep(3000)
    main()
}

fun toMutiplicacao() {
    val multiplica: (Float, Float) -> Unit = { x, y -> println(x.times(y)) }
    //Primeiro numero da operação N1
    println("1º Número: ")
    val n1:String = readLine()!!

    println("2º Número: ")
    val n2:String = readLine()!!

    //chama a função de ordem superior
    multiplica(n1.toFloat(), n2.toFloat())
    Thread.sleep(3000)
}

