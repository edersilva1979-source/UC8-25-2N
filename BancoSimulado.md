# 📚 Entendendo a Classe BancoSimulado em Java

## Objetivo

Nesta aula vamos entender detalhadamente cada linha da seguinte classe Java:

```java
package banco;

import java.util.ArrayList;
import modelo.Cliente;

public class BancoSimulado {

    public static ArrayList<Cliente> clientes =
            new ArrayList<>();

    public static int idCliente = 1;

}
```

---

# 🎯 O que é a Classe BancoSimulado?

A classe `BancoSimulado` tem a função de simular um banco de dados.

Em vez de utilizar MySQL, PostgreSQL ou SQL Server, vamos armazenar os dados na memória utilizando listas.

Isso facilita o aprendizado dos conceitos antes de trabalhar com banco de dados real.

---

# 🏗 Estrutura Geral

```text
BancoSimulado
│
├── Lista de Clientes
│
└── Contador de IDs
```

---

# 📦 Linha 1

```java
package banco;
```

## O que significa?

Define que a classe pertence ao pacote:

```text
banco
```

Os pacotes servem para organizar as classes do projeto.

---

## Exemplo de organização

```text
src
│
├── banco
│   └── BancoSimulado.java
│
├── modelo
│   └── Cliente.java
│
└── telas
    └── TelaCliente.java
```

---

# 📥 Linha 2

```java
import java.util.ArrayList;
```

## O que significa?

Importa a classe:

```text
ArrayList
```

O ArrayList é uma lista dinâmica que pode armazenar vários objetos.

---

## Exemplo

```java
ArrayList<String> nomes =
        new ArrayList<>();
```

Poderia armazenar:

```text
João
Maria
Pedro
Ana
```

---

# 📥 Linha 3

```java
import modelo.Cliente;
```

## O que significa?

Importa a classe:

```text
Cliente
```

Isso permite utilizar objetos do tipo Cliente dentro do BancoSimulado.

---

## Exemplo

```java
Cliente cliente =
        new Cliente();
```

Sem o import, o Java não saberia onde encontrar a classe Cliente.

---

# 🏛 Linha 4

```java
public class BancoSimulado {
```

## O que significa?

Cria uma classe chamada:

```text
BancoSimulado
```

Ela será responsável por armazenar os dados do sistema.

---

## Analogia

Imagine uma gaveta de arquivos.

```text
BancoSimulado
│
├── Clientes
├── Produtos
├── Pedidos
└── Mesas
```

Nesta versão estamos armazenando apenas clientes.

---

# 📋 Linha 5

```java
public static ArrayList<Cliente> clientes =
        new ArrayList<>();
```

## O que significa?

Cria uma lista chamada:

```text
clientes
```

Essa lista armazenará objetos do tipo Cliente.

---

## Entendendo a declaração

### public

```java
public
```

Permite acessar a lista de qualquer lugar do projeto.

---

### static

```java
static
```

Permite acessar a lista sem criar um objeto da classe BancoSimulado.

---

## Exemplo

```java
BancoSimulado.clientes.add(cliente);
```

Observe que não foi necessário fazer:

```java
BancoSimulado banco =
        new BancoSimulado();
```

---

### ArrayList<Cliente>

```java
ArrayList<Cliente>
```

Significa:

```text
Uma lista que aceita somente objetos Cliente
```

---

### new ArrayList<>()

```java
new ArrayList<>();
```

Cria a lista vazia.

---

## Visualmente

Quando o sistema inicia:

```text
clientes
│
└── vazio
```

Após cadastrar clientes:

```text
clientes
│
├── João
├── Maria
├── Pedro
└── Ana
```

---

# 💾 Adicionando Clientes

Exemplo:

```java
Cliente cliente =
        new Cliente(
                1,
                "João",
                "123.456.789-00",
                "joao@email.com"
        );

BancoSimulado.clientes.add(cliente);
```

---

## Resultado

```text
clientes
│
└── João
```

---

# 🔢 Linha 6

```java
public static int idCliente = 1;
```

## O que significa?

Cria um contador para gerar os IDs dos clientes.

---

## Valor inicial

```text
1
```

---

## Primeiro cadastro

```java
Cliente cliente =
        new Cliente(
                BancoSimulado.idCliente,
                "João",
                "123.456.789-00",
                "joao@email.com"
        );
```

Resultado:

```text
ID = 1
```

---

# ⬆ Incrementando o ID

Após salvar:

```java
BancoSimulado.idCliente++;
```

O operador:

```java
++
```

significa:

```text
Somar 1
```

---

## Exemplo

Antes:

```text
idCliente = 1
```

Depois:

```text
idCliente = 2
```

Próximo cadastro:

```text
ID = 2
```

Depois:

```text
ID = 3
```

E assim sucessivamente.

---

# 🧠 Fluxo Completo

## Sistema inicia

```text
Lista de Clientes = vazia

ID = 1
```

---

## Primeiro cliente

```text
João
```

Resultado:

```text
Lista:
João

Próximo ID:
2
```

---

## Segundo cliente

```text
Maria
```

Resultado:

```text
Lista:
João
Maria

Próximo ID:
3
```

---

# 📊 Representação Visual

```text
BancoSimulado
│
├── clientes
│   │
│   ├── Cliente 1
│   ├── Cliente 2
│   ├── Cliente 3
│   └── Cliente 4
│
└── idCliente
    │
    └── 5
```

---

# 🎯 Resumo

A classe BancoSimulado possui duas responsabilidades:

## Armazenar clientes

```java
public static ArrayList<Cliente> clientes
```

Funciona como uma tabela de clientes.

---

## Controlar IDs

```java
public static int idCliente
```

Gera automaticamente o próximo código do cliente.

---

# 💡 Analogia com Banco de Dados Real

No banco de dados teríamos:

```sql
CLIENTES
```

| ID | Nome  | CPF            | Email                                     |
| -- | ----- | -------------- | ----------------------------------------- |
| 1  | João  | 123.456.789-00 | [joao@email.com](mailto:joao@email.com)   |
| 2  | Maria | 987.654.321-00 | [maria@email.com](mailto:maria@email.com) |

No nosso projeto, essa tabela é simulada pelo:

```java
ArrayList<Cliente>
```

---

# 🎓 Conceitos Aprendidos

Nesta aula aprendemos:

* package
* import
* Classe
* ArrayList
* Objetos
* static
* public
* Listas
* Simulação de banco de dados
* Incremento de variáveis
* Controle de IDs

---

# 🚀 Próxima Aula

Na próxima aula iremos aprender:

* Cadastro de Clientes
* Getters e Setters
* Salvando objetos no BancoSimulado
* Consulta de Clientes com JTable

---

## Autor

Éder Silva

Professor de Desenvolvimento de Sistemas
