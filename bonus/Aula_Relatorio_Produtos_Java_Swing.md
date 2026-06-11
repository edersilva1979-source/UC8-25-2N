# Aula: Criando um Relatório de Produtos em Java Swing

## Objetivo

Nesta aula vamos criar uma tela de relatório para visualizar os produtos cadastrados em nosso sistema.

O relatório permitirá:

* Listar todos os produtos cadastrados.
* Visualizar quantidade de produtos.
* Calcular o valor total do estoque.
* Pesquisar produtos.
* Filtrar produtos com estoque baixo.

Todo o relatório será alimentado pelo ArrayList utilizado no CRUD.

---

# O que é um Relatório?

Um relatório é uma tela utilizada para exibir informações de forma organizada.

Enquanto a tela de cadastro serve para incluir, alterar e excluir dados, a tela de relatório serve para consultar e analisar informações.

Exemplo:

```text
ID    DESCRIÇÃO      VALOR    QTDE
1     Mouse          50,00      10
2     Teclado       100,00       5
3     Monitor       800,00       2
```

---

# Passo 1: Criar a Tela de Relatório

No NetBeans:

```text
Pacote telas
   ↓
Novo JFrame Form ou JInternalFrame
   ↓
FrmRelatorioProdutos
```

Sugestão de componentes:

| Componente | Nome             |
| ---------- | ---------------- |
| JTable     | tabelaRelatorio  |
| JTextField | txtPesquisa      |
| JButton    | btnPesquisar     |
| JButton    | btnTodos         |
| JButton    | btnEstoqueBaixo  |
| JLabel     | lblTotalProdutos |
| JLabel     | lblValorEstoque  |

---

# Passo 2: Abrir a Tela pelo Menu

No Menu Relatórios:

```text
Relatórios
    ↓
Relatório de Produtos
```

Evento do menu:

```java
FrmRelatorioProdutos relatorio =
        new FrmRelatorioProdutos();

desktopPane.add(relatorio);

relatorio.setVisible(true);
```

---

# Passo 3: Criar o Método carregarRelatorio()

Este método será responsável por carregar os produtos na tabela.

```java
private void carregarRelatorio() {

    DefaultTableModel modelo =
            new DefaultTableModel();

    modelo.addColumn("ID");
    modelo.addColumn("Descrição");
    modelo.addColumn("Valor");
    modelo.addColumn("Quantidade");

    for (Produto produto :
            BancoSimulado.produtos) {

        modelo.addRow(new Object[]{
            produto.getId(),
            produto.getDescricao(),
            produto.getValor(),
            produto.getQuantidade()
        });
    }

    tabelaRelatorio.setModel(modelo);
}
```

---

# Entendendo o Código

Primeiro criamos o modelo da tabela.

```java
DefaultTableModel modelo =
        new DefaultTableModel();
```

Depois criamos as colunas.

```java
modelo.addColumn("ID");
modelo.addColumn("Descrição");
modelo.addColumn("Valor");
modelo.addColumn("Quantidade");
```

Em seguida percorremos o ArrayList.

```java
for (Produto produto :
        BancoSimulado.produtos)
```

Por fim adicionamos cada produto na tabela.

```java
modelo.addRow(...)
```

---

# Passo 4: Carregar o Relatório ao Abrir a Tela

No construtor da tela:

```java
public FrmRelatorioProdutos() {

    initComponents();

    carregarRelatorio();
}
```

Assim os dados aparecem automaticamente.

---

# Passo 5: Mostrar Quantidade de Produtos

Criar um contador.

```java
int totalProdutos = 0;
```

Dentro do laço:

```java
totalProdutos++;
```

Após o laço:

```java
lblTotalProdutos.setText(
        String.valueOf(totalProdutos));
```

---

# Passo 6: Calcular o Valor Total do Estoque

Cada produto possui:

```text
Valor × Quantidade
```

Exemplo:

```text
Mouse
50 × 10 = 500

Teclado
100 × 5 = 500

Total = 1000
```

Código:

```java
double valorTotal = 0;
```

Dentro do laço:

```java
valorTotal +=
        produto.getValor()
        * produto.getQuantidade();
```

Após o laço:

```java
lblValorEstoque.setText(
        String.format(
                "R$ %.2f",
                valorTotal));
```

---

# Passo 7: Criar a Pesquisa

Capturar o texto digitado.

```java
String pesquisa =
        txtPesquisa.getText()
        .toLowerCase();
```

Filtrar produtos.

```java
if (produto.getDescricao()
        .toLowerCase()
        .contains(pesquisa)) {
```

Botão Pesquisar:

```java
private void btnPesquisarActionPerformed(
        java.awt.event.ActionEvent evt) {

    pesquisarRelatorio();
}
```

---

# Passo 8: Criar Relatório de Estoque Baixo

Muitos sistemas possuem um relatório mostrando produtos próximos de acabar.

Exemplo:

```text
Quantidade <= 5
```

Código:

```java
if (produto.getQuantidade() <= 5) {

    modelo.addRow(new Object[]{
        produto.getId(),
        produto.getDescricao(),
        produto.getValor(),
        produto.getQuantidade()
    });
}
```

---

# Passo 9: Botão Mostrar Todos

Após aplicar filtros, o usuário pode desejar visualizar novamente todos os produtos.

Botão:

```java
private void btnTodosActionPerformed(
        java.awt.event.ActionEvent evt) {

    carregarRelatorio();
}
```

---

# Resultado Final

A tela ficará semelhante a:

```text
---------------------------------------------------

RELATÓRIO DE PRODUTOS

Pesquisar: [____________]

[Pesquisar]
[Todos]
[Estoque Baixo]

---------------------------------------------------

ID | DESCRIÇÃO | VALOR | QTDE

---------------------------------------------------

Total de Produtos: 10

Valor Total Estoque: R$ 8.500,00

---------------------------------------------------
```

---

# O que Aprendemos

Nesta aula aprendemos a:

* Criar uma tela de relatório.
* Utilizar JTable para exibir dados.
* Ler informações de um ArrayList.
* Calcular indicadores.
* Contar registros.
* Somar valores.
* Filtrar dados.
* Criar pesquisa.
* Criar relatório de estoque baixo.

Esses conceitos são amplamente utilizados em sistemas comerciais, ERP, controle de estoque, vendas e gestão empresarial.

---

# Próximos Passos

Após concluir este relatório, podemos evoluir para:

* Relatório de Clientes.
* Relatório de Vendas.
* Relatório em PDF.
* Impressão.
* Banco de Dados MySQL.
* Integração com JasperReports.
* Dashboard com gráficos.

Parabéns! Agora seu sistema possui um CRUD completo e um módulo de relatórios.
