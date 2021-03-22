---
Roteirizando vídeos
Por Luís Amorim
data 21/03/2021 
---

[TOC]



# Roteirizando os textos do Google

Neste projeto adaptarei os textos disponibilizados pela Google, criando um material de referência para mim e para quem mais quiser desfrutar desse conteúdo. 

Usarei como referência principal o curso [Android Basics in kotlin](https://developer.android.com/courses/android-basics-kotlin/course). Também utilizarei o arquivo [Vocabulary for Android Basics in Kotlin](https://developer.android.com/courses/android-basics-kotlin/android-basics-kotlin-vocab) para definir os conceitos que veremos no decorrer do material. Como referência do de diretrizes para desenvolver um app utilizaremos o [Guias do desenvolvedor](https://developer.android.com/guide). Não poderia ficar de fora a [Documetação oficial do Kotlin](https://kotlinlang.org/docs/home.html) como uma de nossas referências para esse material.

# Unidade I

## Seção 1

*Criando programa na linguagem Kotlin que ao ser executado exibe uma mensagem*

Antes de tudo, o que é a linguagem Kotlin?

> Kotlin é uma linguagem de programação moderna com recursos que priorizam a produtividade ao escrever um código conciso, tornando-o menos sujeito a erros.

Para escrever nosso primeiro código em Kotlin, usaremos um editor de código interativo o [play.kotlinlang.org](https://play.kotlinlang.org/). 

### Escreveremos o seguinte código na tela

````kotlin
fun main() {
    println("Hello, world!")
}
````

Página do play_kotlin já com o código escrito: https://pl.kotl.in/_EVkoMfmr

E executaremos apertando o botão de play, compilando nosso programa. Será exbido no painel inferior ``Hello, world!``.

> A *compilação* é um processo que traduz o código Kotlin do programa em uma forma que o sistema pode executar. Se a compilação for concluída com êxito, não haverá erros no programa que impedirão a execução. Se houver problemas, eles aparecerão no painel na parte inferior.

### Explicando o código

Cada parte do código tem uma finalidade especifica e todos são necessários para executa-lo.

**``fun``** é uma ==palavra-chave== na linguagem de programação Kotlin. `fun` significa função. Uma função é uma seção de um programa que realiza uma tarefa específica.

> O Kotlin tem muitas palavras especiais com significados bem específicos. Elas costumam ser chamadas de palavras-chave ou palavras reservadas.

main é o nome da função fun. As funções têm nomes para que seja possível diferenciar umas das outras. Essa função é chamada main, porque é a principal, a primeira a ser chamada quando você executa um programa. ==Todo programa Kotlin precisa de uma função chamada main==.

- O nome da função é sempre seguido por dois parênteses ``()``.

- Dentro dos parênteses, podemos colocar informações a serem usadas pela função. Essa entrada da função é chamada de <u>"argumentos"</u> ou `args`.

- Após os parênteses temos as chaves `{}`. Dentro de uma função, há um código que realiza uma tarefa. As chaves envolvem essas linhas de código.

- Então nossa função fica estruturada da seguinte maneira, até aqui. 

  ````kotlin
  fun main() {}
  ````

- Dentro das chaves temos a instrução ``println()`` que diz ao sistema para exibir uma linha de texto.

- Dentro dos parênteses do ``println()`` temos escrito  ``"Hello, world!"`` entre aspas para indicar que se trata de um texto.

### Atenção aos erros

### Exibir mais de uma mensagem 

