package collections

fun main() {
    //Uma lista pode conter o mesmo elemento mais de uma vez
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   $numbers")
    //Ordenando a lista
    println("sorted:   ${numbers.sorted()}")

println()

    //Criando um conjunto, com um conceito matemático muito forte, pois se contem o mesmo elemento mais de uma vez ele considera como um elemento.
    val setOfNumbers = numbers.toSet()
    println("set of numbers: $setOfNumbers")
    //Verificando se o conjunto contem um elemento específico com a função .contains()
    println("contains 7: ${setOfNumbers.contains(7)}")

println()

    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    //Comparando conjuntos, o conceito matemático aplicado
    println("$set1 == $set2: ${set1 == set2}")
}