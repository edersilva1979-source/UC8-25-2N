# 📊 Aula: Consulta de Clientes com JTable no Java Swing

## Objetivo da Aula

Nesta aula vamos aprender a criar uma tela de consulta de clientes utilizando o componente JTable do Java Swing.

Ao final da aula o aluno será capaz de:

* Criar uma JTable
* Utilizar DefaultTableModel
* Carregar dados em uma tabela
* Pesquisar registros
* Trabalhar com ArrayList
* Exibir objetos em tabelas
* Integrar a JTable com um banco de dados simulado

---

# 📚 O que é JTable?

A JTable é o componente do Java Swing utilizado para exibir dados em formato de tabela.

Exemplo:

| ID | Nome        | CPF            | Email                                     |
| -- | ----------- | -------------- | ----------------------------------------- |
| 1  | João Silva  | 123.456.789-00 | [joao@email.com](mailto:joao@email.com)   |
| 2  | Maria Souza | 987.654.321-00 | [maria@email.com](mailto:maria@email.com) |

Ela é amplamente utilizada em:

* Sistemas comerciais
* Sistemas hospitalares
* ERPs
* Sistemas financeiros
* Sistemas de gestão

---

# 🏗 Estrutura do Projeto

```text
src
│
├── banco
│   └── BancoSimulado.java
│
├── modelo
│   ├── Cliente.java
│   └── Produto.java
│
└── telas
    └── TelaConsultaCliente.java
```

---

# 👤 Classe Cliente

Crie a classe:

```text
modelo.Cliente
```

## Código Completo

```java
package modelo;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
```

---


```

---

# 🗄 Banco de Dados Simulado

Crie a classe:

```text
banco.BancoSimulado
```

## Código

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

# 🪟 Criando a Tela de Consulta

No NetBeans:

```text
New
JInternalFrame Form
```

Nome:

```text
TelaConsultaCliente
```

---

# 🎨 Componentes da Tela

Adicione os componentes:

```text
JLabel
JTextField
JButton
JTable
JScrollPane
```

Layout sugerido:

```text
Consulta de Clientes

Pesquisar:
[ txtPesquisa          ]
[ Pesquisar ]

--------------------------------------------------

| ID | Nome | CPF | Email |

--------------------------------------------------
```

---

# 🔧 Nome dos Componentes

```java
txtPesquisa

btnPesquisar

tabelaClientes
```

---

# 📥 Imports Necessários

```java
import banco.BancoSimulado;
import modelo.Cliente;
import javax.swing.table.DefaultTableModel;
```

---

# 📊 Carregando Dados na JTable

Crie o método:

```java
private void carregarClientes() {

    String pesquisa =
            txtPesquisa.getText().toLowerCase();

    DefaultTableModel modelo =
            new DefaultTableModel();

    modelo.addColumn("ID");
    modelo.addColumn("Nome");
    modelo.addColumn("CPF");
    modelo.addColumn("Email");

    for (Cliente cliente : BancoSimulado.clientes) {

        if (cliente.getNome()
                .toLowerCase()
                .contains(pesquisa)) {

            modelo.addRow(new Object[]{

                cliente.getId(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getEmail()

            });

        }

    }

    tabelaClientes.setModel(modelo);

}
```

---

# 🚀 Executando Automaticamente

No construtor da tela:

```java
public TelaConsultaCliente() {

    initComponents();

    carregarClientes();

}
```

---

# 🔍 Botão Pesquisar

Dê duplo clique no botão Pesquisar.

Adicione:

```java
private void btnPesquisarActionPerformed(
        java.awt.event.ActionEvent evt) {

    carregarClientes();

}
```

---

# 📝 Inserindo Dados para Teste

Você pode inserir dados manualmente:

```java
Cliente c1 = new Cliente(
        1,
        "João Silva",
        "123.456.789-00",
        "joao@email.com"
);

Cliente c2 = new Cliente(
        2,
        "Maria Souza",
        "987.654.321-00",
        "maria@email.com"
);

BancoSimulado.clientes.add(c1);

BancoSimulado.clientes.add(c2);
```

---

# 🧠 Explicação do DefaultTableModel

O DefaultTableModel é responsável por controlar:

* Colunas
* Linhas
* Dados

Criando colunas:

```java
modelo.addColumn("Nome");
```

Adicionando linhas:

```java
modelo.addRow(...)
```

Atualizando a JTable:

```java
tabelaClientes.setModel(modelo);
```

---

# 🎯 Resultado Esperado

Ao executar a tela:

```text
-------------------------------------------------

Pesquisar: [ João ] [Pesquisar]

-------------------------------------------------

| ID | Nome        | CPF            | Email
|
-------------------------------------------------

| 1  | João Silva  | 123.456.789-00 | joao@email.com |

-------------------------------------------------
```

---

# 💡 Exercícios Propostos

## Exercício 1

Criar:

```text
TelaConsultaProduto
```

Utilizando JTable.

---

## Exercício 2

Adicionar pesquisa por CPF.

---

## Exercício 3

Adicionar botão Limpar.

---

## Exercício 4

Adicionar ordenação por Nome.

---

## Exercício 5

Adicionar botão Atualizar.

---

# 🎓 Conceitos Aprendidos

Nesta aula foram trabalhados:

* JTable
* JScrollPane
* DefaultTableModel
* ArrayList
* Objetos
* Encapsulamento
* Pesquisa de dados
* Interface gráfica Java Swing
* Integração entre classes

---

# 🚀 Próxima Aula

Na próxima aula iremos aprender:

* Alterar registros na JTable
* Excluir registros
* Selecionar linhas
* Atualizar dados automaticamente
* CRUD completo utilizando JTable

---

## Autor

Éder Silva

Professor de Desenvolvimento de Sistemas
