# KOTLIN

Kotlin é uma linguagem de programação de código aberto que combina programação orientada a objetos e recursos funcionais em uma plataforma única.

- **Tipos de dados encontrados no kotlin**

  - int
  - long
  - float
  - double
  - array
  - boolean
  - char
  - byte
  - short
  - null*
  - Entre outros...
  

- **Começando a escrever**

  Sempre começamos a escrever em kotlin com uma função *main*. `fun main() {}`

  - Usamos a função `println()` para exibir uma linha de texto.

    ````kotlin
    fun main() {
    	println("Hello, wolrd")
    }
    ````

  

  

- **Fazendo um bolo de aniversário:**

  ````kotlin
  fun main() {
      val age = 5*365 //val é uma palavra especial usada pelo Kotlin, chamada de palavra-chave, que indica que a informação seguinte é o nome de uma variável
      val name = "Rover"
      println("Happy Birthday, ${name}!") 
      
       //vamos fazer um bolo de anivesário com springs
      println("   ,,,,,   ")
      println("   |||||   ")
      println(" =========")
      println("@@@@@@@@@@@")
      println("{~@~@~@~@~}")
      println("@@@@@@@@@@@")
      
      //vamos gerar uma linha vazia
      println("")
      
      println("You are already ${age}!") //chamamos a variavel no texto com ${}
      println("${age} is the very best age to celebrate, ${name}")
  }
  ````

- **Fazendo um banner:**

  ````kotlin
  fun main() {
       println("=======================")
      println("Happy Birthday, Jhansi!")
      println("=======================")
  }
  ````

- **Evoluindo a criação do banner:**

  ````kotlin
  fun main() {
      val border = "`-._,-'"
      val timesToRepeat = 4
      
      printBorder(border, timesToRepeat)
      println("   Happy Birthday, Jhansi!")
      printBorder(border, timesToRepeat)
  }
  
  fun printBorder(border: String, timesToRepeat: Int) {
      repeat (timesToRepeat) {
          print(border)
      }
      println()
  }
  ````

- **Criar um bolo com camadas e velas**

````kotlin
fun main() {
   val age = 24
   val layers = 5
 printCakeCandles(age) 
 printCakeTop(age)
 printCakeBotton(age, layers)
}

fun printCakeTop(age: Int){
    repeat(age + 2){
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int){
    print (" ")
    repeat(age){
        print(",")
    }
        println()
        
     print (" ")   
     repeat(age){   
        print("|")
     }
    println()
}
fun printCakeBotton(age: Int, layers: Int){
    repeat(layers){
    	repeat(age + 2){
        	print("@")
   	 }
        println()
    }
}
````

