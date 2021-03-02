# Três maneiras de reverter uma string em kotlin sem o uso do .reversed()

Salve, salve galera! :wave: 

Recentemente me deparei com um texto muito interessante chamado [Three Ways to Reverse a String in JavaScript](https://www.freecodecamp.org/news/how-to-reverse-a-string-in-javascript-in-3-different-ways-75e4763c68cb/), escrito por [Sonya Moisset](https://www.freecodecamp.org/news/author/sonya/). Resolvi adapta-lo para kotlin como uma forma de exercitar meu conhecimento. Vou compartilhar aqui essa aventura.

1. **Inverta uma string com funções integradas**

A primeira forma é *"Reverse a String With Built-In Functions"* (Inverta uma string com funções integradas). Nessa solução a Autora utiliza três métodos: `String.prototype.split ()`, `Array.prototype.reverse ()` e  `Array.prototype.join ()`. Adaptei para kotlin utilizando os métodos: `.toList()`, `.asReversed()` e o `.joinToString()`.

- O método `.toList()` transforma a String em uma lista de strings, separando a string em sub strings.
- O método `.asReversed()` inverte a posição dos elementos da lista. Por exemplo, se temos uma lista list = (0, 1, .., n-1, n), aplicando o método a lista será "list.asReversed()" = (n, n-1 , .., 1, 0).
- O método `.joinToString()` uni os elementos de uma lista transformando-a em uma string.

​	Essa primeira solução foi a mais tranquila. Considerando o método da autora, apenas adaptei para Kotlin, sendo que já tinha alguns desses conceitos em mente, como por exemplo o `toString()` (Citado na aula de introdução a Kotlin). 

 No processo de pesquisa para adaptar descobri o `.joinToString()`, onde podemos editar varias especificações de como nossa string vai ser escrita. No caso do `toString()` não tem como editar e o console devolve a string em forma de lista `"[g, n, i, r, t, s]"`. 

````kotlin
var palavra = "Luís Henrique" //Coloque a palavra aqui!

fun reverseString(str:String):String {
    var stringToList = str.toList() //transformando string em lista
    var reverseList = stringToList.asReversed() //invertendo posições na lista
    var listToString:String = reverseList.joinToString(separator = "") //transformando lista em string
    return listToString
}

fun main() {
    println("${reverseString(palavra)}")
}
/*
.joinToString(
        prefix = "[", 
        separator = ":",
        postfix = "]",
        limit = 3,
        truncated = "...",
        transform = { it.toUpperCase() })
        */
//----------------------------------------------------
//Forma simplificada de escrever

var palavra = "Luís Henrique" //Coloque a palavra aqui!

fun reverseString(str:String):String {
    var stringReverse = str.toList().asReversed().joinToString(separator = "")
    return stringReverse
}

fun main() {
    println("${reverseString(palavra)}")
}
````

2. **Inverta a string usando decremento de loop**

A segunda forma é a *"Reverse a String With a Decrementing For Loop"* (inverta a string usando decremento de loop). A autora utiliza o `for` para fazer esse decremento, mas tive que adaptar e usar o `while`, tive problemas na compilação e depois de ler um pouco sobre [control flow](https://kotlinlang.org/docs/control-flow.html#break-and-continue-in-loops) na documentação do kotlin, percebi que o uso do `while` seria mais adequado.

````kotlin
var palavra = "Luís Henrique" //Coloque a palavra aqui!

fun reverseString(str:String):String {
    var newString = "" //Criando uma empty string que alocará a nova string reversa 
    var i = str.length - 1 // Esse é o fator de decremento da função, explicarei mais abaixo como funciona.
    while (i >= 0){
    newString += str[i]
    i -= 1
    }
    /* na função while definimos um argumento que ele irá conferir para decidir se continua o loop ou para. começamos com i = str.length - 1, que seria a letra "e" no nome Luís Henrique. 
    Ou seja, conforme i vai assumindo valores em (str.length - 1, .., 0) a newString vai herdando as letras da str*/
    /* Descrevendo o que a função faz, vamos usar como exemplo apenas a palavra Luís.
    Para cada interação: i=str.length - 1 e newString += str[i]
    interação 1:	i = 4 - 1 = 3,	newString = "" + "s"
    interação 2:	i = 3 - 1 = 2,	newString = "s" + "í"
    interação 3:	i = 2 - 1 = 1,	newString = "sí" + "u"
    interação 4:	i = 1 - 1 = 0,	newString = "síu" + "L"
    i = 0 o loop acaba.
    */
    return newString //retorna a string reversa
}

fun main() {
    println("${reverseString(palavra)}")
}
//------------------------------------------------------

//Resolução sem comentários:

var palavra = "Luís Henrique" //Coloque a palavra aqui!

fun reverseString(str:String):String {
    var newString = ""  
    var i = str.length - 1 
    while (i >= 0){
    newString += str[i]
    i -= 1
    }
    return newString 
}

fun main() {
    println("${reverseString(palavra)}")
}
````

3. **Inverta uma string com recursão**

A terceira forma é *"Reverse a String With Recursion"* (Inverta uma string com recursão). Esse foi o mais desafiador, tive que ler um pouco sobre função recursiva e depois de entender um pouco de como ela funciona consegui adaptar. ([referencia sobre função recursiva](https://www.programiz.com/kotlin-programming/recursion))

````kotlin
fun reverseString(str:String):String {
   if (str == ""){
    return ""
   } else {
       return reverseString(str.substring(1)) + str.substring(0, 1)
   }
}

fun main() {
    println("${reverseString(palavra)}")
}
````

Mesmo sendo o mais desafiador consegui adaptar bem para o kotlin, acredito... :sweat_smile: Mas ainda não me sinto confortável para descrever o processo de interação dessa função. Indico fortemente a leitura do artigo original. Pra mim foi um grade exercício e me deu muito mais confiança na parte básica da linguagem. Entrei em contato com muitos conceitos básicos com uma abordagem mais desafiadora.

É isso pessoal, espero poder ter ajudado vocês com os conceitos acima. Aceito sugestões de melhoras tanto na escrita do texto quanto do código :thumbsup:  Abraços e bons estudos.