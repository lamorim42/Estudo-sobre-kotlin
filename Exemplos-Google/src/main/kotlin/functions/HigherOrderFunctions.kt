package functions

// Funções que podem receber outras funções como parâmetro
//Exemplos: map, filter e forEach

fun main() {
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
}