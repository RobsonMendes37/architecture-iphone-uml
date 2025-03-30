# Simulando um Iphone

Descrição : Este projeto é uma implementação de um sistema que simula um Iphone, capaz de atuar como um **reprodutor musical**,
**navegador de internet** e **telefone**. O objetivo do projeto é demonstrar como diferentes funcionalidades podem 
ser integradas em um único sistema, utilizando princípios de **Segregação de interface do SOLID , POO, Arrays , Encapsulamento e Polimorfismo)**.

## Arquitetura

Abaixo está o diagrama da **arquitetura UML** que representa as principais classes e como elas se relacionam:

![Arquitetura UML](https://github.com/user-attachments/assets/341b2164-9cda-421e-a4ac-932e845b1dc1)

Além disso, a arquitetura de pastas do projeto é organizada da seguinte maneira:

![Arquitetura de Pastas](https://github.com/user-attachments/assets/fb920b92-45dc-41bb-a9de-4ec815a3a70e)

## Funcionalidades

O sistema é composto por três principais funcionalidades:

1. **Reprodutor Musical**:
   - Tocar música.
   - Selecionar música.
   - Pausar música.

2. **Navegador de Internet**:
   - Exibir páginas de internet.
   - Adicionar novas abas.
   - Atualizar páginas.

3. **Telefone**:
   - Fazer chamadas.
   - Atender chamadas.
   - Iniciar correio de voz.

## Como Executar o Projeto

Para executar este projeto em sua máquina local, siga os passos abaixo:

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
```

### 2. Compilar e executar

O projeto está estruturado em Java. Para compilar e executar, use o seguinte comando:

```bash
javac -d bin src/Main.java
java -cp bin Main
```

## Estrutura de Pastas

A estrutura de pastas do projeto segue o padrão comum de organização de projetos Java:

```
/src
    /AparelhoTelefonico
        AparelhoTelefonico.java
    /NavegadorInternet
        NavegadorInternet.java
    /ReprodutorMusical
        ReprodutorMusical.java
    Main.java
/bin
    (Arquivos compilados .class)
```

- **`/src`**: Contém o código-fonte do projeto.
- **`/bin`**: Contém os arquivos compilados (.class).

## Tecnologias Usadas

- **Java**: Linguagem de programação utilizada para implementar o sistema.
- **UML**: Diagrama utilizado para descrever a arquitetura do sistema.
- **Git**: Controle de versão do código-fonte.

## Como Contribuir

Se você quiser contribuir para este projeto, siga estas etapas:

1. Faça um fork do repositório.
2. Crie uma branch para sua nova funcionalidade (`git checkout -b minha-nova-funcionalidade`).
3. Faça commit das suas mudanças (`git commit -am 'Adiciona nova funcionalidade'`).
4. Envie para o repositório remoto (`git push origin minha-nova-funcionalidade`).
5. Abra um pull request.

## Licença

Este projeto é de código aberto, distribuído sob a licença MIT.

---

Esse README descreve a estrutura do projeto, as funcionalidades principais, como executar o projeto, contribuições e a arquitetura UML, além de incluir as imagens da arquitetura de pastas e UML.

Se você tiver mais detalhes a adicionar ou se precisar de algo mais específico, posso ajustar! 😊
