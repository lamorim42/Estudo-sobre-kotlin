package collections

fun main() {
    // criando lista de palavras
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    // criando filtro para lista de palavras
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled() //tornando aleatório a escolha de palavras
        .take(2) //pegando apenas as duas primeiras palavras
        .sorted() //deixando em ordem alfabética
    println(filteredWords)
}