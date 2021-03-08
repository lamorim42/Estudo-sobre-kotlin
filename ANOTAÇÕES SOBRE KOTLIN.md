# KOTLIN

Kotlin é uma linguagem de programação de código aberto que combina programação orientada a objetos e recursos funcionais em uma plataforma única.

## Tipos de dados encontrados no kotlin

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

  

- **Começando a escrever em Kotlin**

  ````kotlin
  fun main() {}
  ````

  - **`fun`** é uma palavra na linguagem de programação Kotlin. `fun` significa função. Uma função é uma seção de um programa que realiza uma tarefa específica.
  - **`main`** é o nome da função. As funções têm nomes para que seja possível diferenciar umas das outras. Essa função é chamada `main`, porque é a primeira, ou a principal, a ser chamada quando você executa o programa. <u>Todo programa Kotlin precisa de uma função chamada `main`</u>.
    - O nome da função sempre é seguido por dois parênteses `()`.
    - Dentro dos parênteses, você pode colocar informações a serem usadas pela função. Essa entrada da função é chamada de "argumentos" ou `args`. Você aprenderá mais sobre argumentos mais tarde.
    - Observe o par de chaves `{}` após os parênteses. Dentro de uma função, há um código que realiza uma tarefa. As chaves envolvem essas linhas de código.

  - Usamos a função `println()` para exibir uma linha de texto.

    ````kotlin
    fun main() {
    	println("Hello, wolrd")
    }
    ````
    
    - `println` diz ao sistema para exibir uma linha de texto.
    - Dentro dos parênteses, você coloca o texto a ser exibido.
    - Observe que o texto a ser exibido está entre aspas. Isso informa ao sistema que tudo dentro das aspas precisa ser exibido exatamente como especificado.
    - Para exibir o texto, a instrução `println` inteira precisa estar dentro da função `main`.
    - **Dica:** a instrução `print()` só exibe o texto, sem adicionar uma quebra de linha no final de cada string.
    - **Dica:** use `\n` no texto para adicionar uma quebra de linha. Por exemplo: `"line \n break"`.
    - **Dica:** você pode exibir uma linha vazia se não incluir o texto: `println("")`.

  

## Fazendo um bolo de aniversário:

- Um comentário in-line começa com `//`

````kotlin
fun main() {
    val age = 5*365 //val é uma palavra especial usada pelo Kotlin, chamada de palavra-chave, que indica que a informação seguinte é o nome de uma variável. age é o nome da variável. Consiguimos fazer operações básicas tbm.
    val name = "Rover"
    println("Happy Birthday, ${name}!") //chamamos a variavel no texto com ${}
    
     //vamos fazer um bolo de anivesário com springs
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    
    //vamos gerar uma linha vazia
    println("")
    
    println("You are already ${age}!") 
    println("${age} is the very best age to celebrate, ${name}")
}
````

- **Importante:** uma variável declarada usando a palavra-chave **`val`** só pode ser definida uma vez. Não é possível mudar o valor dela posteriormente no programa.

  Você pode declarar uma variável que pode ser mudada com a palavra-chave **`var`**. Isso será feito em outro codelab.

  - Temo uma terceira forma de declarar uma variável o **`cosnt val`**. Pode ser declarado fora da função `main` e tem seu valo gerado durante a compilação, sendo que esse valor é fixo, ou seja, não pode ser alterado.

  - **Exemplos de como podemos declarar variáveis**  

    ````kotlin
    var exemploDeVariavel = 22
    
    var exemploDeVariavelDois:Int? //essa interrogação no diz que a variável pode obter valor nulo, ou seja, null.
    exemploDeVariavelDois = null ou 22 //atribuindo valor a variável declarada acima.
    ````

    ````kotlin
    const val constanteDois = 10 //declaramos a const val fora da main e mesmo assim ela será referenciada na main.
    fun main() {
        val constanteUm = 3 
        var variavelUm:Int?
        variavelUm = 5
       
        println("${constanteDois}, ${constanteUm}, ${variavelUm}")
    }
    ````

    ````kotlin
    fun main() {
        
        var variavelUm:String
        variavelUm = 5.toString() //usamos o .toString() que converte nosso número em string.
       
        println("${variavelUm}")
    }
    ````
    
    ````kotlin
    val name = "Luís" //Type inferences, não preciso declarar o tipo de variável, o kotlin já reconhece o tipo.
    var greeting: String? = null //mas se eu quiser que a variavel possa ter valor nulo tenho que declarar. (pois o kotlin é non null).
    fun main() {
        greeting = "Hello"
        println(${name})
        println(${greeting})
    }
    ````
    
    

## Operadores aritméticos

|    Função     | Expressão |  Comando   | Atribuição | Incremento |
| :-----------: | :-------: | :--------: | :--------: | :--------: |
|     Soma      |    a+b    | a.plus(b)  |   a +=b    |    a++     |
|   Subtração   |    a-b    | a.minus(b) |   a -=b    |    a--     |
| Multiplicação |    a*b    | a.times(b) |   a *=b    |     -      |
|    Divisão    |    a/b    |  a.div(b)  |   a /=b    |     -      |
|     Resto     |    a%b    |  a.mod(b)  |   a %=b    |     -      |

- É possível usar as expressões para concatenar strings.

  ````kotlin
  fun main() {
      
      var variavelUm = "World!"
      var variavelDois = "Hello, " 
      
      variavelDois += variavelUm
      println("${variavelDois}")
  }
  ````

## Operadores Comparativos

|             Função             | Expressão  |                 Comando                  |
| :----------------------------: | :--------: | :--------------------------------------: |
|     maior que / menor que      | a>b / a<b  |  `a.copareTo(b)>0` ou `a.copareTo(b)<0`  |
| maior ou igual, menor ou igual | a>=b, a<=b | `a.copareTo(b)>=0` ou `a.copareTo(b)<=0` |
|             igual              |   a == b   |              `a.equals(b)`               |
|           diferente            |   a != b   |             `!(a.equals(b))`             |

- Os **comandos** `.compareTo()` retornam os valores -1 (se `a < b`), 1 (se `a > b`) ou 0 (se `a = b`).
- As **expressões** retornam valores *booleanos*, ou seja, verdadeiro ou falso. Assim como os comandos `.equals()`

## Operadores Lógicos

| Função e expressão |      Comando      |
| :----------------: | :---------------: |
|       E (&&)       | (exp.1)and(exp.2) |
|     Ou (\| \|)     | (exp.1)or(exp.2)  |

## Operadores In e range

|        Função e expressão         |
| :-------------------------------: |
|            contém (In)            |
|         Não contem (!In)          |
| range/faixa de valores (int..int) |

------



## Fazendo um banner

````kotlin
fun main() {
     println("=======================")
    println("Happy Birthday, Jhansi!")
    println("=======================")
}
````

- O programa em Kotlin sempre precisa ter uma função `main()`. Além disso, você pode criar e usar funções próprias.

- **Evoluindo a criação do banner:**

  ````kotlin
  fun main() {
      val border = "`-._,-'"
      val timesToRepeat = 4
      
      printBorder(border, timesToRepeat)
      println("   Happy Birthday, Jhansi!")
      printBorder(border, timesToRepeat)
  }
  
  fun printBorder(border: String, timesToRepeat: Int) { //usaremos a instrução repeat
      repeat (timesToRepeat) {
          print(border)
      }
      println()
  } //Criamo nossa função printBorder para nos ajudar a printar as bordas do banner.
  ````

  - A instrução `repeat()` começa com a palavra `repeat`, seguida de `()`. Esse tipo de instrução é chamado de "repetição" porque você está repetindo o mesmo código várias vezes.

## Criar um bolo com camadas e velas

*Vamos colocar em pratica tudo que foi discutido acima na criação do bolo com velas* 

````kotlin
fun main() {
   val age = 24
   val layers = 5
 printCakeCandles(age) 
 printCakeTop(age)
 printCakeBotton(age, layers) //criamos 3 funções
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

## Indexação

- `first()`
- `last()`
- `String.length`
- `String[index]`

## Formatação

|            Nome            |                            Função                            |                           Métodos                            |
| :------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
|  Capitalização de strings  |   Altera a formatação entre letras maiúsculas e minúsculas   | capitalize(), toUpperCase(), toLowerCase() and decapitalize() |
|     Remoção de espaços     | Remove espaços vazios e caracteres inadequados para impressão |                trimEnd(), trimStart(), trim()                |
| Substituição de caracteres |               Substituir caracteres por outros               |                        replace(x, y)                         |
|         Formatação         |       Formatar outros valores para um padrão de string       |               "padrão ${valor}".format(valor)                |

- **Empty x Blank**
  - Empty é uma string de tamanho 0
  - Blank é uma string de tamanho > 0, mas todo espaços é vazios.

## If and When

````kotlin
val name = "Luís"
var greeting: String? = null

fun main() {
    if (greeting != null) {
        println("${greeting}")
    } else {
        println("Hi")
    }
    println("${name}")
}
````



````kotlin
val name = "Luís"
var greeting: String? = null

fun main() {
	when (greeting) {
    //dando as condições de valores para greeting
        null -> println("Hi")
        else -> println("${greeting}")
    }
    println("${name}")
}
````



## Local variable

````kotlin
val name = "Luís" //uma vez que o valor foi dado, não pode ser alterado, dado que é uma val
var greeting: String? = null //pode assumir outro valor

fun main() {
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println("${greetingToPrint}")
    println("${name}")
}
````

````kotlin
val name = "Luís"
var greeting: String? = null

fun main() {
    val greetingToPrint = when(greeting) {
    null -> "Hi"
    else -> greeting
    }
    println("${greetingToPrint}")
    println("${name}")
}
````

## Funções

````kotlin
fun getGreeting(): String {
   return "Hello Kotlin" 
}
//Tbm poderiamos escrever a função acima como:
fun getGreeting() = "Hello Kotlin"

fun sayHello() {
    println(getGreeting()) //imprime Hello Kotlin
}

fun main(){
    println("Hello World") //imprime Hello World
    println(getGreeting()) //imprime Hello Kotlin
    sayHello() //imprime Hello Kotlin
}
````

- **Parâmetros para função**

  ````kotlin
  fun sayHello(itemToGreet:String) {
      val msg = "Hello ${itemToGreet}"
      println("${msg}")
  }
  //Tbm poderiamos definir a função acima como:
  fun sayHello(itemToGreet:String) = println("Hello ${itemToGreet}")
  
  fun main() {
      sayHello("Kotlin")
      sayHello("Wolrd")
  }
  ````

  ````kotlin
  fun sayHello(greeting:String, itemToGreet:String) = println("${greeting} ${itemToGreet}")
  
  fun main() {
      sayHello("Hey", "Kotlin") //imprime Hello Kotlin
      sayHello("Hello", "Wolrd") //imprime Hello Wolrd
  }
  ````

## Array

- `arrayOf` 

````kotlin
fun main() {
   val umaArray = arrayOf("Kotlin", "Programming", "Comic Books")
    println(umaArray.size) // imprime 3
    println(umaArray[0]) // imprime Kotlin
    println(umaArray.get(0)) //imprime Kotlin
    
    for (it in umaArray) {
        println("${it}")
    }
}
//print on console:
    /* 
	3 			//.size
	Kotlin		//[0]
	Kotlin		//.get(0)
	Kotlin
	Programming
	Comic Books
    */
````

````kotlin
//Podemos escrever esse for de outra maneira
fun main() {
   val umaArray = arrayOf("Kotlin", "Programming", "Comic Books")
    println(umaArray.size)
    println(umaArray[0])
    println(umaArray.get(0))
    
    umaArray.forEach {println("${it}")}
    //Pdemos, tbm, anexar o index de cada elemento
    umaArray.forEachIndexed {index, it -> println("${index}, ${it}")}
    //print on console:
    /* 
    0, Kotlin
	1, Programming
	2, Comic Books
    */
}
````



## Lista

- `listOf`

````kotlin
fun main() {
   val umaLista = listOf("Kotlin", "Programming", "Comic Books")
    umaLista.forEach {println("${it}")}
   }
// mesmo conceito do Array
````

Podemos criar listas onde se pode adicionar itens

````kotlin
fun main() {
   val umaLista = mutableListOf("Kotlin", "Programming", "Comic Books")
    umaLista.add("Cats")
    umaLista.forEach {it -> println("${it}")}
   }
//print on console:
    /* 
    Kotlin
	  Programming
	  Comic Books
	  Cats
    */
````



## Map

- `mapOf`

````kotlin
fun main() {
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach {key, value -> println("${key} -> ${value}")}
}
//print on console:
    /* 
    1 -> a
	  2 -> b
	  3 -> c
    */
````

## 'Função + Lista', *"brincando com os argumentos"*

````kotlin
fun sayHello(greeting:String, itemsToGreet:List<String>) { 
    itemsToGreet.forEach { itemsToGreet ->
    println("${greeting} ${itemsToGreet}")
    }
}

fun main() {
   val umaLista = listOf("Kotlin", "Programming", "Comic Books")
   sayHello("Hi", umaLista)

}
 //print on console:
    /* 
    Hi Kotlin
	Hi Programming
	Hi Comic Books
    */
````

- `vararg`

  ````kotlin
  fun sayHello(greeting:String, vararg itemsToGreet:String) { 
      itemsToGreet.forEach { item ->
      println("${greeting} ${item}")
      }
  }
  
  fun main() {
     //val umaLista = listOf("Kotlin", "Programming", "Comic Books")
     sayHello("Hi", "Kotlin", "Programming", "Comic Books", "Wolrd")
  
  }
   //print on console:
      /* 
      Hi Kotlin
  	Hi Programming
  	Hi Comic Books
  	Hi Wolrd
      */
  ````

  ````kotlin
  fun sayHello(greeting:String, vararg itemsToGreet:String) { 
      itemsToGreet.forEach { item ->
      println("${greeting} ${item}")
      }
  }
  
  fun main() {
     val umaArray = arrayOf("Kotlin", "Programming", "Comic Books")
     sayHello("Hi", *umaArray)
  //usamos * para o kotlin reconhecer a lista como argumento válido para a função
  }
   //print on console:
      /* 
      Hi Kotlin
  	Hi Programming
  	Hi Comic Books
      */
  ````

- Nomeando Argumentos:

  ````kotlin
  fun greetPerson(greeting:String = "Hello", name:String = "Kotlin") = println("${greeting} ${name}")
  
  fun main() {
      greetPerson(name = "Luís", greeting = "Hi") // nomeado com o sinal =, apesar de podermos mudar a oredem, só poderemos chamar a fun com 1 argumento se pre-definirmos os argumentos.
      // greetPerson(name: "Luís", greeting: "Hi") sem nomear
      //print on console:
      /* 
      Hi Luís
      */
      greetPerson()
       //print on console:
      /* 
      Hello Kotlin
      */
  }
  
  ````

   ````kotlin
  fun sayHello(greeting:String, vararg itemsToGreet:String) { 
      itemsToGreet.forEach { item ->
      println("${greeting} ${item}")
      }
  }
  
  fun greetPerson(greeting:String = "Hello", name:String = "Kotlin") = println("${greeting} ${name}")
  
  fun main() {
     val umaArray = arrayOf("Kotlin", "Programming", "Comic Books")
     sayHello(itemsToGreet = *umaArray, greeting = "Hi")
  }
  //print on console:
  /*
  Hi Kotlin
  Hi Programming
  Hi Comic Books
  */
   ````

  

## Class

````kotlin
class Person (val firstName: String, val lastName: String) 
//Em IDE a classe é declarada em outro arquivo, um arquivo de classe.

fun main() {
  val person = Person("Luís", "Amorim") //Instância da class Person
  person.firstName
  person.lastName
}
````

````kotlin
class Person (val firstName: String = "Peter", val lastName: String = "Parker") {
    var nickName: String? = null
    set(value){
        field = value
        println("the new nickname is ${value}")
    }
    get(){
        println("the returned value is ${field}")
        return field
    }
}
//------------------------------------------------
fun main() {
  val person = Person()
  person.firstName
  person.lastName
  person.nickname = "Goku"
  person.nickname = "Cacaroto"
  println(person.nickName)
}
````

- **Method in class**

  ````kotlin
  class Person (val firstName: String = "Peter", val lastName: String = "Parker") {
      var nickName: String? = null
      set(value){
          field = value
          println("the new nickname is ${value}")
      }
      get(){
          println("the returned value is ${field}")
          return field
      }
      
      fun printInfo(){
          val nickNameToPrint = nickName ?: "no nickname"
          println("${firstName} (${nickNameToPrint}) ${lastName}")
      }
  }
  //--------------------------------------------
  fun main() {
    val person = Person()
      person.printInfo()
  }
  ````


## Interface

 ````kotlin
    class Person (val firstName: String = "Peter", val lastName: String = "Parker") {
        var nickName: String? = null
        set(value){
            field = value
            println("the new nickname is ${value}")
        }
        get(){
            println("the returned value is ${field}")
            return field
        }
        
        fun printInfo(){
            val nickNameToPrint = nickName ?: "no nickname"
            println("${firstName} (${nickNameToPrint}) ${lastName}")
        }
    }
    //--------------------------------------------Outro arquivo de interface
    interface personInfoProvider {
      val providerInfo: String 
      fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
      }
    }

    interface sessionInfoProvider {
      fun getSessionId():String
    }


    class basicInfoProvider: personInfoProvider, sessionInfoProvider {
     override val providerInfo: String
     get() = "basicInfoProvider"

     override fun printInfo(person: Person) {
      super.printInfo(person)
      println("additional print statement")
     }
    }

     override fun fun getSessionId():String {
      return "Session"
     }

    fun main(){
      val provider = basicInfoProvider()

      provider.printInfo(Person())
      provider.getSessionId()

      checkTypes(provider)
    }

    fun checkTypes(infoProvider: personInfoProvider){
      if (infoProvider is sessionInfoProvider){
        println("is a session info provider")
      } else {
        println("not a session info provider")
        infoProvider.getSessionId()
      }
    }

    //print on console:
    /*
    basicInfoProvider
    Peter (no nickname) Parker
    additional print statement
    is a session info provider
    */


    //--------------------------------------------Outro arquivo para função
    fun main() {
      val person = Person()
        person.printInfo()
    }
 ````

## Inheritance

````kotlin
class Person (val firstName: String = "Peter", val lastName: String = "Parker") {
        var nickName: String? = null
        set(value){
            field = value
            println("the new nickname is ${value}")
        }
        get(){
            println("the returned value is ${field}")
            return field
        }
        
        fun printInfo(){
            val nickNameToPrint = nickName ?: "no nickname"
            println("${firstName} (${nickNameToPrint}) ${lastName}")
        }
    }
    //--------------------------------------------Outro arquivo de interface
    interface personInfoProvider {
      val providerInfo: String 
      fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
      }
    }

    interface sessionInfoProvider {
      fun getSessionId():String
    }


   open class basicInfoProvider: personInfoProvider, sessionInfoProvider {
     override val providerInfo: String
     get() = "basicInfoProvider"
       
      protected open val sessionIdPrefix = "Session"

     override fun printInfo(person: Person) {
      super.printInfo(person)
      println("additional print statement")
     }
    }

     override fun getSessionId():String {
      return sessionIdPrefix
     }

    fun main(){
      val provider = basicInfoProvider()

      provider.printInfo(Person())
      provider.getSessionId()

      checkTypes(provider)
    }

    fun checkTypes(infoProvider: personInfoProvider){
      if (infoProvider is sessionInfoProvider){
        println("is a session info provider")
      } else {
        println("not a session info provider")
        infoProvider.getSessionId()
      }
    }

    //print on console:
    /*
    Peter (no nickname) Parker
    additional print statement
    Fancy Info
    is a session info provider
    */
 //--------------------------------------------Outro arquivo
class FancyInfoProvider: BasicInfoProvider() {
    
    override val sessionIdPrefix: String
    get() = "Fancy Session"
    
    override val providerInfo: String
    get() = "Fancy Info Provider"
    
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }
}

    //--------------------------------------------Outro arquivo para função
    fun main() {
      val person = Person()
        person.printInfo()
    }
````



## Object Expressions

````kotlin
//...
fun main() {
    val provaider = object: PersonInfoProvider {
        override val providerInfo: String
        get() = "New Info Provider"
        
        fun getSessionId() = "id"
    }
}
//...
````



## Companion Objects

````kotlin
interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String) {
    
    companion object Factory: IdProvider {
        override fun getId(): String {
            return "123"
        }
        const val id = "id"
        
        fun create() = Entity(getId())
    }
} 

fun main() {
    val entity = Entity.create()
    Entity.id
}
````



## Object Declarations

````kotlin
object EntityFactory {
    fun create() = Entity(id:"id", name:"name")
}

class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}
    
fun main() {
    val entity = Entity.create()
    println(entity)
}

/* Print:
id:id name:name
*/
````



## Enum Classes

````kotlin
enum class EntityType {
    EASY, MEDIUM, HARD;
    
    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType) = Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
          EntityType.EASY -> type.name
          EntityType.MEDIUM -> type.getFormattedName()
          EntityType.HARD -> "Hard"
        }
        return Entity(id, name)
    }
}

class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}
    
fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)
    
    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
}

/* Print:
id: "uma id aleatória gandona" name:EASY
id: "uma id aleatória gandona" name:Medium
*/
````



## Sealed Classes

````kotlin
enum class EntityType {
    HELP, EASY, MEDIUM, HARD;
    
    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType) = Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
          EntityType.EASY -> type.name
          EntityType.MEDIUM -> type.getFormattedName()
          EntityType.HARD -> "Hard"
          EntityType.HELP -> type.getFormattedName()
        }
        return when (type){
          EntityType.EASY -> Entity.Easy(id, name)
          EntityType.MEDIUM -> Entity.Medium(id, name)
          EntityType.HARD -> Entity.Hard(id, name, multiplier:2f)  
           EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity() {
    object Help : Entity() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
   
}
    
fun main() {
    val entity:Entity = EntityFactory.create(EntityType.EASY)
    val msg = when (entity) {
        Entity.Help -> "help class"
        is Entity.Easy -> "easy class"
        is Entity.Medium -> "medium class"
        is Entity.Hard -> "hard class"
    }
    println(msg)
}

/* Print:
easy class
*/
````





------



## Exercícios

- Exercício 1

  ````kotlin
  // Insira aqui os valores a serem operados
  val valorUm:Float? = 5f //valor 1
  val valorDois:Float? = 3f //valor 2
  val operação:String = "/" //Escolha uma operação "+" (soma), "-" (subtração), "*" (produto), "/" (divisão)
  
  fun main() {
     if (operação == "+" && valorUm != null && valorDois != null) {
         valorUm.plus(valorDois)
         println(valorUm.plus(valorDois))
     } else if (operação == "-" && valorUm != null && valorDois != null) {
         valorUm.minus(valorDois)
         println(valorUm.minus(valorDois))
     } else if (operação == "*" && valorUm != null && valorDois != null) {
         valorUm.times(valorDois)
         println(valorUm.times(valorDois))
     } else if (operação == "/" && valorUm != null && valorDois != null) {
         valorUm.div(valorDois)
         println(valorUm.div(valorDois))
     } else {
         println("Um dos valores é nulo ou a operação é inválida")
     }
  }
  ````
  
  ````kotlin
    // Insira aqui os valores a serem operados
    val valorUm:Float? = 5f  //valor 1
    val valorDois:Float? = 3f  //valor 2
    val operação:String = "+" //Escolha uma operação "+" (soma), "-" (subtração), "*" (produto), "/" (divisão)
    
    fun main() {
      if (valorUm != null && valorDois != null) 
        {when (operação) {
      "+" -> println(valorUm.plus(valorDois))
      "-" -> println(valorUm.minus(valorDois))
      "*" -> println(valorUm.times(valorDois))
      "/" -> println(valorUm.div(valorDois))
      else -> println("Operação inválida")  
       }
     }
      else {
      println("Um dos valores é nulo")
      }
    }
  ````
  
  

  