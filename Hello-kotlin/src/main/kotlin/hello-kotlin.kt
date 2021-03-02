const val SOMA = 1
const val SUBTRACAO = 2
const val MULTIPLICACAO = 3
const val DIVISAO = 4

fun main() {

    print("Digite o primeiro valor: ")
    var a:Float = readLine()!!.toFloat()
    print("Digite o segundo valor: ")
    var b:Float = readLine()!!.toFloat()
    print("Escolha uma operação: (Soma-1,Subtração-2, multiplicação-3, divisão-4): ")
    var op:Int = readLine()!!.toInt()

    when(op in 1..4){
        op == 1 -> {
            println("O resultado da soma entre $a e $b é " + a.plus(b))
        }
        op == 2 -> {
            println("O resultado da subtração entre $a e $b é " + a.minus(b))
        }
        op == 3 -> {
            println("O resultado da multiplicação entre $a e $b é " + a.times(b))
        }
        op == 4 -> {
            println("O resultado da divisão entre $a e $b é " + a.div(b))
            if(b == 0f){
                println("Essa divisão não pode acontecer")
            }
        }
        else -> {
            println("Escolha uma operação valida!")
        }
    }
}