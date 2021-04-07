package functions

/* Função Lambda
* É uma função sem nome que pode ser usada imediatamente como uma expressão - é um conceito realmente útil chamado
* de expressão lambda , ou apenas lambda, para abreviar.
* Exemplo de tipo de função: (Int) -> Int
*/

fun main() {
    //Alocando uma função em uma variável
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))
println()
    // Podemos reescrever a função acima como
    val tripleRefactored: (Int) -> Int = { it * 3 }
    println(tripleRefactored(5))
}