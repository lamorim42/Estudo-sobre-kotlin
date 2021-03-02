# Introdução a arquitetura da plataforma Android

## Arquitetura em camadas

![A pilha de software do Android.](C:\Users\luish\AppData\Roaming\Typora\typora-user-images\image-20210301181810216.png)

Pilha de software com base em Linux. 

## Kernel do Linux

A fundação da plataforma Android. Confia no kernel do Linux para cobrir funcionalidades

- Contém todos os drivers de baixo nível para suporte a vários componentes de hardware.
- O Android Runtime depende do kernel do Linux para os principais serviços do sistema, como,
  - Memória, gerenciamento de processos, segmentação, etc;
  - Protocolos de rede;
  - Segurança e etc.

## HAL (Hardware Abstraction Layer)

*(Camadas de abstração de hardware)*

A HAL consiste em módulos de biblioteca, que implementam uma interface para um tipo específico de componente de hardware, como o módulo de câmera ou Bluetooth.

- Fornece abstração entre o hardware e o resto da pilha de software.

## Android Runtime

O ART é projetado para executar várias máquinas virtuais em dispositivos de baixa memória executando arquivos DEX, um formato de bytecode projetado especialmente para Android, otimizado para oferecer consumo mínimo de memória.

- Compilação "ahead-of-time" [^AOT] e "just-in-time" [^JIT]
- Coleta de lixo (GC) otimizada
- usa arquivos `DEX`, o que ajuda o ART a gerenciar a memória com mais eficiência.

## Bibliotecas C/C++ nativas

Vários componentes e serviços principais do sistema Android, como ART e HAL, são implementados por código nativo que exige bibliotecas nativas programadas em C e C++. A plataforma Android fornece as Java Framework [^APIs] para expor a funcionalidade de algumas dessas bibliotecas nativas aos aplicativos.

- **Biblioteca SQLite** usada para armazenamento de dados e luz em termos de pegadas de memória móvel e execução de tarefas.
- **WebKit Library** fornece principalmente mecanismo de navegação na Web e muitos outros recursos relacionados.
- A biblioteca do gerenciador de superfície é responsável por renderizar janelas e superfícies de desenho de vários aplicativos na tela.
- A biblioteca de estrutura de mídia fornece [^codecs] de mídia para áudio e vídeo.
- A **OpenGl** (Open Graphics Library) e **SGL** (Scalable Graphics Library) são as bibliotecas gráficas para renderização 3D e 2D, respectivamente.
- A Biblioteca FreeType é usada para renderizar fontes.

## Application Java API Framework

É uma coleção de APIs escritas em Java, que dá aos desenvolvedores acesso ao conjunto completo de recursos do sistema operacional Android. Essas APIs formam os blocos de programação que você precisa para criar os aplicativos Android simplificando a reutilização de componentes e serviços de sistema modulares e principais.

O Android vem com um conjunto de aplicativos principais para e-mail, envio de SMS, calendários, navegador de internet, contatos etc. Os aplicativos inclusos na plataforma não têm status especial entre os aplicativos que o usuário opta por instalar. Portanto, um aplicativo terceirizado pode se tornar o navegador da Web, o aplicativo de envio de SMS ou até mesmo o teclado padrão do usuário (existem algumas exceções, como o aplicativo Configurações do sistema).

Permite e simplifica a reutilização de componentes e serviços essenciais, como:

- **Activity Manager** : gerencia o ciclo de vida de aplicativos e fornece back stack de navegação comum.
- **Window Manager** : Gerencia janelas e superfícies de desenho, e é uma abstração da biblioteca gerente superfície.
- **Provedores de conteúdo** : Permite que o aplicativo acesse dados de outros aplicativos ou compartilhe seus próprios dados, ou seja, fornece mecanismo para trocar dados entre aplicativos.
- **Sistema de visualização** : contém os blocos de construção da interface do usuário usados para construir a IU de um aplicativo, incluindo listas, grades, textos, caixas, botões, etc. e também executa o gerenciamento de eventos de elementos da interface do usuário (explicado em tutoriais posteriores).
- **Gerenciador de pacotes** : gerencia vários tipos de informações relacionadas aos pacotes de aplicativos atualmente instalados no dispositivo.
- **Gerenciador de telefonia** : permite que o aplicativo use os recursos de telefone do dispositivo.
- **Gerenciador de recursos** : fornece acesso a recursos não codificados (Strings, bitmaps, gráficos e layouts localizados).
- **Gerente de localização** : trata dos recursos de reconhecimento de localização.
- **Gerenciador de notificação** : permite que os aplicativos exibam alertas personalizados na barra de status.

# DSU "Dynamic System Updates"

*(Atualizações dinâmicas do sistema)*

As Atualizações dinâmicas do sistema (DSU, na sigla em inglês) são um recurso do sistema lançado no Android 10 que faz o seguinte:

- Faz o download de uma nova [^GSI], ou outra imagem do sistema Android, para seu dispositivo.
- Cria uma nova partição dinâmica.
- Carrega o GSI para a nova partição.
- Inicializa a GSI como um SO convidado no dispositivo.

## Requisitos das DSUs

As DSUs dependem do recurso de *partição dinâmica do Android* e exigem que as GSIs sejam assinadas pelo Google ou pelos seus OEMs como uma imagem de sistema confiável. As DSUs são um recurso fornecido pelo fabricante do dispositivo.

------



[^APIs]: API é um conjunto de definições e protocolos usado no desenvolvimento e na integração de software de aplicações. API é um acrônimo em inglês que significa interface de programação de aplicações.Uma API permite que sua solução ou serviço se comunique com outros produtos e serviços sem precisar saber como eles foram implementados. Isso simplifica o desenvolvimento de aplicações, gerando economia de tempo e dinheiro. [Referência de APIs](https://www.redhat.com/pt-br/topics/api/what-are-application-programming-interfaces).
[^codecs]: Um codec é um circuito de hardware que realiza a conversão de sinais analógicos em dados digitais e também é um software e / ou hardware que comprime ainda mais os dados digitais em menos espaço. [Referência de codec](https://www.pcmag.com/encyclopedia/term/codec-examples)
[^JIT]: Just-In-Time Compiler ou compilador sob demanda. Podemos considerá-lo como um compilador dinâmico já que roda em tempo de execução e pode ir adaptando o código conforme necessidade.
[^AOT]: O compilador AOT é a mais tradicional onde você desenvolve, nele você invoca o compilador e ele faz todo o processo culminando no executável que poderá ser chamado na hora ou transportado para outro local. Normalmente ele não precisa ser tão rápido e pode fazer otimizações mais extremas. É comum ser necessário quando a aplicação foi gerada em alguma forma intermediária e roda em alguma máquina virtual que gerará um código binário a ser executado pelo processador. É como se ele criasse o código efetivamente executável em memória quando precisa. Mas também pode fazer diretamente em código fonte de uma linguagem. [Referência de AOT e JIT](https://pt.stackoverflow.com/questions/146250/o-que-%c3%a9-um-jitter).
[^GSI]: Uma imagem genérica do sistema (GSI) é uma implementação de *Android puro* com código do Android Open Source Project (AOSP) não modificado e pode ser executada em vários dispositivos Android.

# Referências: 

https://developer.android.com/guide/platform?hl=pt-br

https://www.studytonight.com/android/introduction-to-android

