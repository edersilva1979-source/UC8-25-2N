# 📚 Entendendo a Classe Cliente em Java

## Objetivo

Nesta aula vamos entender detalhadamente cada linha da seguinte classe Java:

```java
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String email;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

}
```

---

# 🏗 Declaração da Classe

```java
public class Cliente {
```

## O que significa?

Estamos criando uma classe chamada:

```text
Cliente
```

Uma classe funciona como uma planta ou modelo que será utilizada para criar objetos.

### Exemplo

Imagine uma ficha de cadastro.

A classe define quais informações existirão nessa ficha.

```text
Cliente
---------------------
ID
Nome
CPF
Email
```

Depois podemos criar vários clientes a partir desse modelo.

```text
João
Maria
Pedro
Ana
```

Todos serão objetos da classe Cliente.

---

# 📌 Atributo ID

```java
private int id;
```

## O que significa?

Cria uma variável chamada:

```text
id
```

Responsável por armazenar o código do cliente.

### Exemplo

```text
1
2
3
4
```

---

## Explicação do tipo

```java
int
```

Significa:

```text
Número inteiro
```

Exemplos:

```text
1
10
250
999
```

---

## Explicação do private

```java
private
```

Significa que a variável só pode ser acessada pela própria classe.

Isso é chamado de:

```text
Encapsulamento
```

---

# 👤 Atributo Nome

```java
private String nome;
```

Cria uma variável chamada:

```text
nome
```

Responsável por armazenar o nome do cliente.

### Exemplos

```text
João Silva
Maria Souza
Pedro Santos
```

---

## Explicação do tipo

```java
String
```

É utilizado para armazenar textos.

---

# 🪪 Atributo CPF

```java
private String cpf;
```

Cria uma variável para armazenar o CPF.

### Exemplo

```text
123.456.789-00
```

Foi utilizado String porque CPF não será utilizado em cálculos.

---

# 📧 Atributo Email

```java
private String email;
```

Cria uma variável para armazenar o e-mail do cliente.

### Exemplo

```text
joao@email.com
```

Também utiliza String por ser um texto.

---

# 🔨 Construtor Vazio

```java
public Cliente() {
}
```

## O que é um construtor?

O construtor é um método especial utilizado para criar objetos.

---

## Neste caso

Estamos criando um construtor vazio.

Isso permite criar um cliente sem informar nenhum dado inicialmente.

### Exemplo

```java
Cliente cliente = new Cliente();
```

Nesse momento:

```text
ID = 0
Nome = null
CPF = null
Email = null
```

Os dados poderão ser preenchidos posteriormente através dos métodos setters.

---

# 🔨 Construtor Completo

```java
public Cliente(int id, String nome, String cpf, String email) {
```

Este construtor recebe todos os dados do cliente no momento da criação.

---

## Parâmetros recebidos

```java
int id
String nome
String cpf
String email
```

---

## Exemplo de utilização

```java
Cliente cliente = new Cliente(
    1,
    "João Silva",
    "123.456.789-00",
    "joao@email.com"
);
```

---

# 🔄 this.id = id;

```java
this.id = id;
```

## O que significa?

Copia o valor recebido para o atributo da classe.

### Exemplo

Valor recebido:

```text
1
```

Resultado:

```text
this.id = 1
```

---

## O que é this?

```java
this
```

Significa:

```text
Este objeto
```

Ou seja:

```java
this.id
```

refere-se ao atributo da classe.

---

# 🔄 this.nome = nome;

```java
this.nome = nome;
```

Copia o nome recebido para o atributo da classe.

### Exemplo

Recebido:

```text
João Silva
```

Resultado:

```text
this.nome = João Silva
```

---

# 🔄 this.cpf = cpf;

```java
this.cpf = cpf;
```

Copia o CPF recebido para o atributo da classe.

### Exemplo

Recebido:

```text
123.456.789-00
```

Resultado:

```text
this.cpf = 123.456.789-00
```

---

# 🔄 this.email = email;

```java
this.email = email;
```

Copia o e-mail recebido para o atributo da classe.

### Exemplo

Recebido:

```text
joao@email.com
```

Resultado:

```text
this.email = joao@email.com
```

---

# 🧠 O que acontece internamente?

Quando executamos:

```java
Cliente cliente = new Cliente(
    1,
    "João Silva",
    "123.456.789-00",
    "joao@email.com"
);
```

O Java faz:

```java
this.id = 1;
this.nome = "João Silva";
this.cpf = "123.456.789-00";
this.email = "joao@email.com";
```

---

# 📋 Resultado Final

O objeto criado ficará assim:

```text
Cliente
--------------------------------

ID: 1

Nome: João Silva

CPF: 123.456.789-00

Email: joao@email.com
```

---

# 🏛 Analogia Simples

Imagine uma ficha de cadastro.

## A classe

É a ficha em branco.

```text
Nome: __________

CPF: ___________

Email: __________
```

---

## O construtor

É o preenchimento da ficha.

```text
Nome: João Silva

CPF: 123.456.789-00

Email: joao@email.com
```

---

## O objeto

É a ficha já preenchida.

---

# 🎯 Conceitos Aprendidos

Nesta aula aprendemos:

* Classe
* Objeto
* Atributos
* Encapsulamento
* Variáveis
* String
* int
* Construtor vazio
* Construtor completo
* Palavra reservada this
* Programação Orientada a Objetos (POO)

---

# 🚀 Próxima Aula

Na próxima aula iremos aprender:

* Getters
* Setters
* Encapsulamento na prática
* Classe Produto
* Classe Pedido
* Integração com JTable

---

## Autor

Éder Silva

Professor de Desenvolvimento de Sistemas
