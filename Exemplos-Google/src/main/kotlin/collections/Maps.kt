package collections

fun main() {
    //Conceito de Mapa
    val peopleAges = mutableMapOf(
        //Estamos criando chaves do tipo String para um valor Int.
        "Fred" to 30,
        "Ann" to 23
    )
    //Adicionando informações ao mapa
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    //Como a chave "Fred" já existe em nosso mapa o valor a ela atribuído será atualizado
    peopleAges["Fred"] = 31
    println(peopleAges)
println()
    //Usando o forEach() função
    peopleAges.forEach{print("${it.key} is ${it.value}, ")}
    println()
    //Uma forma mais eficiente de imprimir o mapa
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

println()
    //Colocando uma condição para a coleta de itens na lista
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}