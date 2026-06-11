# CRUD de Produtos em Java Swing com ArrayList

## Objetivo

Neste projeto vamos aprender a criar um sistema simples de cadastro de produtos utilizando:

* Java
* NetBeans
* JFrame Form
* JTable
* ArrayList

Ao final teremos um CRUD completo funcionando sem banco de dados.

---

# O que é CRUD?

CRUD é uma sigla utilizada para representar as quatro operações básicas de um sistema de cadastro.

| Letra | Significado | Função    |
| ----- | ----------- | --------- |
| C     | Create      | Criar     |
| R     | Read        | Consultar |
| U     | Update      | Atualizar |
| D     | Delete      | Excluir   |

Em nosso sistema:

* Adicionar Produto = Create
* Consultar Produto = Read
* Editar Produto = Update
* Excluir Produto = Delete

---

# Estrutura do Projeto

## Classe Produto

Representa um produto cadastrado.

```java
public class Produto {

    private int id;
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto() {
    }

    public Produto(int id, String descricao, double valor, int quantidade) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Getters e Setters
}
```

---

## Classe BancoSimulado

Será nosso banco de dados em memória.

```java
import java.util.ArrayList;

public class BancoSimulado {

    public static ArrayList<Produto> produtos =
            new ArrayList<>();

    public static int idProduto = 1;

}
```

Enquanto o programa estiver aberto, os produtos permanecerão armazenados na memória.

---

# CREATE - Adicionar Produto

Botão Adicionar.

```java
private void btnAdicionarActionPerformed(
        java.awt.event.ActionEvent evt) {

    if (txtDescricao.getText().isEmpty()
            || txtValor.getText().isEmpty()
            || txtQuantidade.getText().isEmpty()) {

        JOptionPane.showMessageDialog(
                null,
                "Preencha todos os campos.");

        return;
    }

    Produto produto = new Produto();

    produto.setId(BancoSimulado.idProduto);
    produto.setDescricao(txtDescricao.getText());
    produto.setValor(
            Double.parseDouble(txtValor.getText()));
    produto.setQuantidade(
            Integer.parseInt(txtQuantidade.getText()));

    BancoSimulado.produtos.add(produto);

    BancoSimulado.idProduto++;

    JOptionPane.showMessageDialog(
            null,
            "Produto adicionado com sucesso!");

    carregarProduto();
    limparCampos();
}
```

### O que acontece?

1. Valida os campos.
2. Cria um objeto Produto.
3. Gera um ID automático.
4. Adiciona o produto no ArrayList.
5. Atualiza a tabela.
6. Limpa os campos.

---

# READ - Consultar Produtos

Método responsável por carregar os produtos na JTable.

```java
private void carregarProduto(){

    DefaultTableModel modelo =
            new DefaultTableModel();

    String pesquisa =
            txtPesquisa.getText().toLowerCase();

    modelo.addColumn("ID");
    modelo.addColumn("Descrição");
    modelo.addColumn("Valor");
    modelo.addColumn("Quantidade");

    for (Produto produto :
            BancoSimulado.produtos){

        if (produto.getDescricao()
                .toLowerCase()
                .contains(pesquisa)){

            modelo.addRow(new Object[]{
                produto.getId(),
                produto.getDescricao(),
                produto.getValor(),
                produto.getQuantidade()
            });
        }
    }

    tabelaProdutos.setModel(modelo);
}
```

---

# Pesquisa por Descrição ou ID

Para isso utilizamos dois RadioButtons:

```java
rbDescricao
rbId
```

Também devemos criar um ButtonGroup.

```java
ButtonGroup grupoPesquisa =
        new ButtonGroup();

grupoPesquisa.add(rbDescricao);
grupoPesquisa.add(rbId);

rbDescricao.setSelected(true);
```

---

## Consulta utilizando RadioButton

```java
private void carregarProduto() {

    DefaultTableModel modelo =
            new DefaultTableModel();

    String pesquisa =
            txtPesquisa.getText().toLowerCase();

    modelo.addColumn("ID");
    modelo.addColumn("Descrição");
    modelo.addColumn("Valor");
    modelo.addColumn("Quantidade");

    for (Produto produto :
            BancoSimulado.produtos) {

        boolean encontrou = false;

        if (rbDescricao.isSelected()) {

            if (produto.getDescricao()
                    .toLowerCase()
                    .contains(pesquisa)) {

                encontrou = true;
            }

        } else if (rbId.isSelected()) {

            try {

                int idPesquisado =
                        Integer.parseInt(pesquisa);

                if (produto.getId()
                        == idPesquisado) {

                    encontrou = true;
                }

            } catch (NumberFormatException e) {

                encontrou = false;
            }
        }

        if (encontrou) {

            modelo.addRow(new Object[]{
                produto.getId(),
                produto.getDescricao(),
                produto.getValor(),
                produto.getQuantidade()
            });
        }
    }

    tabelaProdutos.setModel(modelo);
}
```

---

# Selecionando um Produto da Tabela

Quando o usuário clicar em uma linha, os dados serão enviados para os campos.

```java
private int idSelecionado = 0;
```

```java
private void tabelaProdutosMouseClicked(
        java.awt.event.MouseEvent evt) {

    int linha =
            tabelaProdutos.getSelectedRow();

    if (linha >= 0) {

        idSelecionado = Integer.parseInt(
                tabelaProdutos
                .getValueAt(linha, 0)
                .toString());

        txtDescricao.setText(
                tabelaProdutos
                .getValueAt(linha, 1)
                .toString());

        txtValor.setText(
                tabelaProdutos
                .getValueAt(linha, 2)
                .toString());

        txtQuantidade.setText(
                tabelaProdutos
                .getValueAt(linha, 3)
                .toString());
    }
}
```

---

# UPDATE - Editar Produto

Botão Editar.

```java
private void btnEditarActionPerformed(
        java.awt.event.ActionEvent evt) {

    if (idSelecionado == 0) {

        JOptionPane.showMessageDialog(
                null,
                "Selecione um produto.");

        return;
    }

    for (Produto produto :
            BancoSimulado.produtos) {

        if (produto.getId() == idSelecionado) {

            produto.setDescricao(
                    txtDescricao.getText());

            produto.setValor(
                    Double.parseDouble(
                            txtValor.getText()));

            produto.setQuantidade(
                    Integer.parseInt(
                            txtQuantidade.getText()));

            JOptionPane.showMessageDialog(
                    null,
                    "Produto atualizado!");

            carregarProduto();
            limparCampos();

            idSelecionado = 0;

            break;
        }
    }
}
```

---

# DELETE - Excluir Produto

Botão Excluir.

```java
private void btnExcluirActionPerformed(
        java.awt.event.ActionEvent evt) {

    if (idSelecionado == 0) {

        JOptionPane.showMessageDialog(
                null,
                "Selecione um produto.");

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    null,
                    "Deseja excluir?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {

        for (Produto produto :
                BancoSimulado.produtos) {

            if (produto.getId()
                    == idSelecionado) {

                BancoSimulado.produtos
                        .remove(produto);

                JOptionPane.showMessageDialog(
                        null,
                        "Produto removido!");

                carregarProduto();
                limparCampos();

                idSelecionado = 0;

                break;
            }
        }
    }
}
```

---

# Método Limpar Campos

```java
private void limparCampos() {

    txtDescricao.setText("");
    txtValor.setText("");
    txtQuantidade.setText("");
    txtPesquisa.setText("");

    idSelecionado = 0;

    txtDescricao.requestFocus();
}
```

---

# Fluxo Completo do Sistema

```text
Adicionar Produto
       ↓
ArrayList
       ↓
Carregar JTable
       ↓
Selecionar Produto
       ↓
┌───────────┬───────────┐
│           │           │
Editar    Excluir
│           │
Atualiza  Remove
│           │
Atualiza JTable
```

---

# Conclusão

Neste projeto aprendemos:

* Criar uma classe Produto.
* Utilizar ArrayList como banco de dados.
* Criar uma JTable dinâmica.
* Consultar registros.
* Pesquisar por ID ou descrição.
* Selecionar registros da tabela.
* Adicionar produtos.
* Editar produtos.
* Excluir produtos.
* Implementar um CRUD completo.

Esse é um excelente projeto para iniciantes, pois apresenta os principais conceitos utilizados em sistemas comerciais desenvolvidos em Java Swing.
