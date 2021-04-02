---
Roteirizando vídeos
Por Luís Amorim
data 21/03/2021 
---

[TOC]



# Como começar em Kotlin

Salve, salve Devs :v:

Neste projeto adaptarei os textos disponibilizados pela Google e JetBrains para criar um material de referência para mim e para quem mais quiser desfrutar desse conteúdo. O propósito principal desse artigo é ser um material de revisão, mas pretendo escreve-lo de forma que possa ser lido por um leigo no universo da programação.

Usarei como referência principal o curso [Android Basics in kotlin](https://developer.android.com/courses/android-basics-kotlin/course), também utilizarei o arquivo [Vocabulary for Android Basics in Kotlin](https://developer.android.com/courses/android-basics-kotlin/android-basics-kotlin-vocab) para definir os conceitos que veremos no decorrer do material. E não poderia ficar de fora, a [Documetação oficial do Kotlin](https://kotlinlang.org/docs/home.html) como uma de nossas referências para esse material.

Nesse artigo veremos:

- O que é a linguagem <a href = "#kotlin">Kotlin</a>;
- o que é <a href="#compilacao">compilar</a>;
- o que é uma <a href="#funcao">função</a>;
- o que é uma <a href="#palavraChave">palavra-chave</a>; 
- <a href="#declaraFuncao">como declarar uma função</a>;
- O que é um <a href="#argumento">argumento</a>.

# O começo 

Vamos começar respondendo uma pergunta, que acho, fundamental. O que é a linguagem <a id="kotlin">Kotlin</a>?

> **Kotlin** é uma linguagem de programação moderna com recursos que priorizam a produtividade ao escrever um código conciso, tornando-o menos sujeito a erros.

Para escrever nosso primeiro código em Kotlin, usaremos um editor de código interativo o [play.kotlinlang.org](https://play.kotlinlang.org/). 

# Hello, World!

````kotlin
fun main() {
    println("Hello, world!")
}
````

*[Página do play_kotlin já com o código escrito](https://pl.kotl.in/_EVkoMfmr)*

Esse é nosso primeiro programinha em Kotlin e ao ser compilado exibirá na tela ``Hello, world!``.

> A <a id ="compilacao">**compilação**</a> é um processo que traduz o código Kotlin do programa em uma forma que o sistema pode executar. Se a compilação for concluída com êxito, não haverá erros no programa que impedirão a execução. Se houver problemas, eles aparecerão no painel na parte inferior.

# Explicando o código

Cada parte do código tem uma finalidade especifica e todos são necessários para executá-lo.

**``fun``** é uma <a id="palavraChave">palavra-chave</a> na linguagem de programação Kotlin. `fun` significa <a id="funcao">função</a>. Uma **função** é um bloco discreto de código que executa uma operação e pode retornar um valor.  Em outras palavras, uma função é uma seção de um programa que realiza uma tarefa específica.

> O Kotlin tem muitas palavras especiais com significados bem específicos. Elas costumam ser chamadas de **palavras-chave** ou **palavras reservadas**.

Pretendo escrever outro artigo explicando função em Kotlin, o que você acha? Deixe seu comentário :wink: :thumbsup: 

<a id="declaraFuncao">**``main``** é o nome da função ``fun``. As funções têm nomes para que seja possível diferenciar umas das outras. Essa função é chamada ``main``, porque é a principal, a primeira a ser chamada quando você executa um programa. ==Todo programa Kotlin precisa de uma função chamada main==.</a>

- O nome da função é sempre seguido por dois parênteses ``()``.

- Dentro dos parênteses, podemos colocar informações a serem usadas pela função. Essa entrada da função é chamada de <u>"argumentos"</u> ou `args`.

  > Um <a id="argumento">**argumento**</a> é um valor que é passado para **funções** . Os argumentos podem ser valores ou **variáveis** , ou mesmo outras funções.

- Após os parênteses temos as chaves `{}`. Dentro de uma função, há um código que realiza uma tarefa. As chaves envolvem essas linhas de código.

- Então nossa função fica estruturada da seguinte maneira, até aqui. 

  ````kotlin
  fun main() {}
  ````

- Dentro das chaves temos a instrução ``println()`` que diz ao sistema para exibir uma linha de texto.

- Dentro dos parênteses do ``println()`` temos escrito  ``"Hello, world!"`` entre aspas para indicar que se trata de um texto.

É isso pessoal, espero que esse material possa ajudar de alguma forma, principalmente quem quer um material de revisão. Pretendo escrever mais artigos como esse até o final do bootcamp everis kotlin Developer.

Como sempre feedbacks construtivos são sempre bem vindos, espero o apoio de vocês. Vlw, flws :wave:

