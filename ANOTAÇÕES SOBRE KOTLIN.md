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

  

- **Fazendo um bolo de aniversário:**

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
      
      

  - **Operadores aritméticos** 

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

  - **Operadores Comparativos**

    |             Função             | Expressão  |                 Comando                  |
    | :----------------------------: | :--------: | :--------------------------------------: |
    |     maior que / menor que      | a>b / a<b  |  `a.copareTo(b)>0` ou `a.copareTo(b)<0`  |
    | maior ou igual, menor ou igual | a>=b, a<=b | `a.copareTo(b)>=0` ou `a.copareTo(b)<=0` |
    |             igual              |   a == b   |              `a.equals(b)`               |
    |           diferente            |   a != b   |             `!(a.equals(b))`             |

    - Os **comandos** `.compareTo()` retornam os valores -1 (se `a < b`), 1 (se `a > b`) ou 0 (se `a = b`).
    - As **expressões** retornam valores *booleanos*, ou seja, verdadeiro ou falso. Assim como os comandos `.equals()`

  - **Operadores Lógicos**

    | Função e expressão |      Comando      |
    | :----------------: | :---------------: |
    |       E (&&)       | (exp.1)and(exp.2) |
    |     Ou (\| \|)     | (exp.1)or(exp.2)  |

  - **Operadores In e range**

    |        Função e expressão         |
    | :-------------------------------: |
    |            contém (In)            |
    |         Não contem (!In)          |
    | range/faixa de valores (int..int) |

    ------

    

- **Fazendo um banner:**

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

- **Criar um bolo com camadas e velas**

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

- **Indexação**

  - `first()`
  - `last()`
  - `String.length`
  - `String[index]`

- Formatação

  |            Nome            |                            Função                            |                           Métodos                            |
  | :------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
  |  Capitalização de strings  |   Altera a formatação entre letras maiúsculas e minúsculas   | capitalize(), toUpperCase(), toLowerCase() and decapitalize() |
  |     Remoção de espaços     | Remove espaços vazios e caracteres inadequados para impressão |                trimEnd(), trimStart(), trim()                |
  | Substituição de caracteres |               Substituir caracteres por outros               |                        replace(x, y)                         |
  |         Formatação         |       Formatar outros valores para um padrão de string       |               "padrão ${valor}".format(valor)                |

- **Empty x Blank**
  - Empty é uma string de tamanho 0
  - Blank é uma string de tamanho > 0, mas todo espaços é vazios.

- **If and When:**

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
          null -> println("Hi")
          else -> println("${greeting}")
      }
      println("${name}")
  }
  ````

  

  - **Local variable**

    ````kotlin
    val name = "Luís"
    var greeting: String? = null
    
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

- **Funções**

  ````kotlin
  fun getGreeting(): String {
     return "Hello Kotlin" 
  }
  //Tbm poderiamos escrever a função acima como:
  fun getGreeting() = "Hello Kotlin"
  
  fun sayHello() {
      println(getGreeting())
  }
  
  fun main(){
      println("Hello World")
      println(getGreeting())
      sayHello()
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
        sayHello("Hey", "Kotlin")
        sayHello("Hello", "Wolrd")
    }
    ````

- **Array**

  - `arrayOf` 

  ````kotlin
  fun main() {
     val umaArray = arrayOf("Kotlin", "Programming", "Comic Books")
      println(umaArray.size)
      println(umaArray[0])
      println(umaArray.get(0))
      
      for (coisas in umaArray) {
          println("${coisas}")
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

  

- **Lista**

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

  

- **Map**

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

- **'Função + Lista'**, *"brincando com os argumentos"*

  ````kotlin
  fun sayHello(greeting:String, itemsToGreet:List<String>) { 
      itemsToGreet.forEach { item ->
      println("${greeting} ${item}")
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

  - "Bagunçando" Argumentos:

    ````kotlin
    fun greetPerson(greeting:String = "Hello", name:String = "Kotlin") = println("${greeting} ${name}")
    
    fun main() {
        greetPerson(name = "Luís", greeting = "Hi") 
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
       sayHello(itemsToGreet = umaArray, greeting = "Hi")
    }
    //print on console:
    /*
    Hi Kotlin
    Hi Programming
    Hi Comic Books
    */
     ````

    

- **Class**

  ````kotlin
  class Person (val firstName: String, val lastName: String) 
  //Em IDE a classe é declarada em outro arquivo, um arquivo de classe.
  
  fun main() {
    val person = Person("Luís", "Amorim")
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

    