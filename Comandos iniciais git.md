| Comandos CMD                                  | O que o comando faz                |
| --------------------------------------------- | ---------------------------------- |
| dir                                           | Revela os arquivos da pasta        |
| cd _"nome da pasta"_                          | entra na pasta _"nome da pasta"_   |
| cd ..                                         | Volta uma pasta na hierarquia      |
| cd /                                          | Vai para o diretório "Principal"   |
| mkdir _"nova da pasta"_                       | Cria uma nova "pasta"              |
| rmdir _"nome da pasta"_                       | Rmove a _"nome da pasta"_          |
| del                                           | Deleta um arquivo                  |
| cls                                           | Limpa o prompt de comando          |
| echo _"texto"_                                | Printa na tela _"texto"_           |
| echo > _"nome do arquivo.md"_                 | Cria um arquivo de texto em branco |
| mv _"nome do arquivo"_ ./nome do repositório/ | Move um arquivo para outra pasta   |



| Comandos Git                                                 | Função                                                       |
| ------------------------------------------------------------ | :----------------------------------------------------------- |
| git init                                                     | Cria o repositório onde será salvo as versões. _Cria uma pasta .git/ que é invisivel, para visualiza-la usamos o comando "ls -a ou dir -a"._ |
| git add _"Nome do arquivo"_ (variações do comando: git add . ou git add *) | Revela o arquivo para o git, deixando o **Staged**.          |
| git commit -m "msg..."                                       | Cria o commit, mudando o estado do arquivo de staged para **Unmodified**. Quando editamos o arqui ele vai para **Modified**. |
| git status                                                   | Diz o stato dos arquivos                                     |
| git remote add [^ origin ] "https..."                        | Adiciona servidor para transferir repositórios               |
| git push origin master                                       | Empurra repositorio de local para servidor remoto            |
| git pull origin master                                       | Puxa repositório do github para o git                        |
| git clone "https..."                                         | Clona um repositório hospedado no github                     |
| git remote -v                                                | mostra os repositórios associados aquele diretório.          |

[^ origin ]: origin é o apelido que se da ao link do servidor.





