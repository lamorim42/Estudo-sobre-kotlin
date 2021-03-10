# Três formas de Fatorizar um número em Kotlin

Salve salve, galera! :wave:

Trago mais uma de minhas sagas. Hoje adaptei o texto [Three Ways to Factorialize a Number in JavaScript](https://www.freecodecamp.org/news/how-to-factorialize-a-number-in-javascript-9263c89a4b38/) para Kotlin. Espero que possa ajudar de alguma forma.

## Prefácio

Nesse texto veremos como fazer o fatorial de um número, então primeiramente vamos ver a definição de fatorial.

### Fatorial

**Definição**: Seja **n** um número natural, o fatorial de **n** é definido por:

- **0! = 1**

- **n! = n . (n – 1).(n – 2) … 3 . 2 . 1**

 Exemplo: 

- 0! = 1
- 5! = 5 * 4 * 3 * 2 * 1 = 120 

Tendo essa definição em mente, já podemos pensar sobre o algoritimo para fatorizar um número.

## Usando uma função recursiva:

Mais uma vez utlizamos o método da [função recursiva](https://www.programiz.com/kotlin-programming/recursion).

````kotlin
fun main(){
    fun fatoracao(num: Int): Int{
        //tirando os números negativos
     return  if (num < 0){
      -1
    } else if (num == 0){ 
      1 //se n=0, fatoracao(0)=1 
    } else {
      num * fatoracao(num-1) //quando n>=1
	}   
/*
--- Primeira parte da função recursiva:
Lembre-se que teremos algumas chamadas na função!
1ª chamada: fatoracao(5) -> 5 * fatoracao(5-1)
2ª chamada: fatoracao(4) -> 4 * fatoracao(4-1)
3ª chamada: fatoracao(3) -> 3 * fatoracao(3-1)
4ª chamada: fatoracao(2) -> 2 * fatoracao(2-1)
5ª chamada: fatoracao(1) -> 1 * fatoracao(1-1)

--- Segunda parte da função recursiva
5ª chamada: return 5*(5-1)
5ª chamada: return 20*(4-1)
5ª chamada: return 60*(3-1)
5ª chamada: return 120*(2-1)
5ª chamada: return 120
*/        
}
    println(fatoracao(5))
}
//Print:
//5040
````

### Resolução sem comentários:

````kotlin
fun main(){
    fun fatoracao(num: Int): Int{
     return  if (num < 0){
      -1
    } else if (num == 0){ 
      1 
    } else {
      num * fatoracao(num-1)     
}
    println(fatoracao(5))
}
````



## Usando o while

````kotlin
fun main() {
    println(fatoracao(5))
}
fun fatoracao(num: Int): Int {
    //criando as variávei para receber o valor de num e operar com esse valor
    var fat: Int = num
    var i: Int = num
    //retornando valores para 0 e 1
    if (num == 0 || num == 1) {
        return 1
    }
    while (i > 1) {
        i -= 1 //declaração da iteração
        fat *= i // produto de n*(n-1)
        }
    /*
    		    i		i -= 1		fat		fat *= i
    1ª Iteração: 5			4		 5		 20 = 5*4
    2ª Iteração: 4			3		 20		 60 = 20*3
    3ª Iteração: 3			2		 60		 120 = 60*2
    4ª Iteração: 2			1		 120	 120 = 120*1	 
    Loop termina
    */
        return fat
    
}
//Print:
//5040
````

### Resolução sem comentários:

````kotlin
fun main() {
    println(fatoracao(5))
}
fun fatoracao(num: Int): Int {
    var retun: Int = num
    var dec: Int = num
    if (num == 0 || num == 1) {
        return 1
    }
    while (dec > 1) {
        dec -= 1
        retun *= dec
        }
        return retun
}
````



## Usando o for

````kotlin
fun main() {

    println(fatoracao(5))
}
fun fatoracao(num: Int): Int {
    //criando a variável para receber o valor de num 
    var fat:Int = num
    //retornando valores para 0 e 1
    if (fat == 0 || fat == 1) {
        return 1
    }
    for (i in fat - 1 downTo 1){
        fat *= i
    }
     /*
    		   fat			i			fat *= i
    1ª Iteração: 5			4		 	 20 = 5*4
    2ª Iteração: 20			3		 	 60 = 20*3
    3ª Iteração: 60			2		 	 120 = 60*2
    4ª Iteração: 120		1		 	 120 = 120*1		 	 
    Loop termina
    */
    return fat
}
//Print:
//5040
````

### Resolução sem comentários:

````kotlin
fun main() {
    println(fatoracao(5))
}
fun fatoracao(num: Int): Int {
    var fat:Int = num
    if (fat == 0 || fat == 1) {
        return 1
    }
    for (i in fat - 1 downTo 1){
        fat *= i
    }
    return fat
}
````

É isso ai pessoal, espero que esses exemplos possam ajudar vocês assim como mw ajudaram. 

Abraços, até a próxima!