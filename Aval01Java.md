# 📚 Avaliação Java Swing 01

## 🎯 Objetivo

Desenvolver uma aplicação desktop utilizando **Java Swing** no **Apache NetBeans**, aplicando conceitos de Programação Orientada a Objetos, criação de telas, menus e manipulação de dados em tabelas.

---

# 📋 Nome do Projeto

```text
avaljava01
```

---

# 🏗️ Etapa 1 - Criar a Classe Aluno

Crie uma classe chamada **Aluno** contendo os seguintes atributos:

| Atributo | Tipo   |
| -------- | ------ |
| id       | int    |
| nome     | String |
| turma    | String |
| email    | String |

### Exemplo

```java
public class Aluno {

    private int id;
    private String nome;
    private String turma;
    private String email;

    public Aluno() {
    }

    public Aluno(int id, String nome, String turma, String email) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.email = email;
    }

    // Getters e Setters
}
```

---

# 🖥️ Etapa 2 - Criar a Tela Principal

Crie uma janela principal utilizando **JFrame**.

---

# 📑 Etapa 3 - Criar a MenuBar

A tela principal deverá possuir uma barra de menus com a seguinte estrutura:

## Arquivo

```text
Arquivo
 ├── Novo
 └── Editar
```

### Funções

* Novo
* Editar

---

## Editar

```text
Editar
 ├── Desfazer
 └── Refazer
```

### Funções

* Desfazer
* Refazer

---

## Exibir

```text
Exibir
 ├── Zoom
 ├── ----------------
 └── Régua
```

### Funções

* Zoom
* Separador
* Régua

---

## Ajuda

```text
Ajuda
 └── Sobre o Sistema
```

### Funções

* Sobre o Sistema

Ao clicar em **Sobre o Sistema**, exiba uma mensagem contendo:

```text
Sistema Avaliação Java Swing
Versão 1.0
Desenvolvido pelos alunos
```

---

# 🪟 Etapa 4 - Criar a Tela Novo Aluno

Ao clicar no menu:

```text
Arquivo → Novo
```

deverá ser aberta uma segunda tela chamada:

```text
Novo Aluno
```

---

# 📝 Etapa 5 - Criar o Formulário

A tela deverá possuir os seguintes campos:

| Campo  |
| ------ |
| ID     |
| Nome   |
| Turma  |
| E-mail |

---

# 📊 Etapa 6 - Criar uma JTable

A tela deverá conter uma tabela para exibir os alunos cadastrados.

### Colunas

| ID | Nome | Turma | E-mail |
| -- | ---- | ----- | ------ |

---

# 🔘 Etapa 7 - Criar os Botões

Adicionar dois botões na parte inferior da tela.

## Botão Adicionar

Ao clicar:

* Ler os dados dos campos.
* Criar um objeto Aluno.
* Adicionar o aluno na tabela.
* Limpar os campos após o cadastro.

### Fluxo

```text
Preencher Campos
        ↓
Clicar em Adicionar
        ↓
Inserir na JTable
        ↓
Limpar Campos
```

---

## Botão Excluir

Ao clicar:

* Selecionar um registro da tabela.
* Remover o registro selecionado.

### Fluxo

```text
Selecionar Linha
        ↓
Clicar em Excluir
        ↓
Remover da JTable
```

---

# ⭐ Desafio Extra

Implementar:

* Confirmação antes de excluir.
* Mensagem de cadastro realizado com sucesso.
* Mensagem caso nenhum aluno esteja selecionado para exclusão.
* Ordenação da tabela por nome.

---

# 🎯 Resultado Esperado

Ao final da atividade todos deverão ser capazes de:

✅ Criar classes em Java

✅ Trabalhar com Programação Orientada a Objetos

✅ Criar interfaces gráficas com Swing

✅ Utilizar JMenuBar

✅ Abrir múltiplas telas

✅ Utilizar JTable

✅ Adicionar e excluir registros

✅ Manipular eventos de botões

---

## 🏆 Entrega

O projeto deverá conter:

```text
avaljava01
│
├── Classe Aluno
├── Tela Principal
├── Tela Novo Aluno
├── JMenuBar Completa
├── JTable Funcionando
├── Botão Adicionar
└── Botão Excluir
```

Bom desenvolvimento! 🚀

