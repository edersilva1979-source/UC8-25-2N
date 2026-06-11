# Aula: Impressão de Relatório de Produtos em Java Swing

## Objetivo

Nesta aula vamos aprender a imprimir o relatório de produtos exibido em uma JTable.

Ao final da aula o sistema será capaz de:

* Abrir a janela de impressão.
* Imprimir os dados exibidos na tabela.
* Adicionar título ao relatório.
* Adicionar numeração de páginas.
* Tratar possíveis erros de impressão.

---

# Por que imprimir relatórios?

Em sistemas comerciais é muito comum a necessidade de imprimir informações para:

* Conferência de estoque.
* Inventário.
* Auditorias.
* Reuniões gerenciais.
* Controle interno.

Exemplo:

```text
RELATÓRIO DE PRODUTOS

ID    DESCRIÇÃO     VALOR     QTDE
1     Mouse         50,00      10
2     Teclado      100,00       5
3     Monitor      800,00       2

Total de Produtos: 3
Valor Total Estoque: R$ 2600,00
```

---

# O Método print()

A JTable possui um método próprio chamado:

```java
tabelaRelatorio.print();
```

Esse método abre automaticamente a janela de impressão do Windows.

Não é necessário instalar bibliotecas externas.

---

# Passo 1: Criar o Botão Imprimir

Na tela de relatório adicione um botão.

Propriedades:

```text
Nome: btnImprimir

Texto: Imprimir Relatório
```

Layout sugerido:

```text
-------------------------------------------------

Pesquisar: [____________]

[Pesquisar]
[Todos]
[Estoque Baixo]
[Imprimir Relatório]

-------------------------------------------------
```

---

# Passo 2: Criar o Evento do Botão

Clique duas vezes no botão para gerar o evento:

```java
private void btnImprimirActionPerformed(
        java.awt.event.ActionEvent evt) {

}
```

---

# Passo 3: Impressão Simples

Primeira versão:

```java
private void btnImprimirActionPerformed(
        java.awt.event.ActionEvent evt) {

    try {

        tabelaRelatorio.print();

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                null,
                erro.getMessage()
        );
    }
}
```

---

# Entendendo o Código

O comando:

```java
tabelaRelatorio.print();
```

Faz com que a JTable seja enviada para a impressora.

Automaticamente o Java exibe a tela de impressão.

Exemplo:

```text
Selecionar Impressora

[Imprimir]
[Cancelar]
```

---

# Passo 4: Informar o Resultado da Impressão

Podemos mostrar mensagens para o usuário.

```java
private void btnImprimirActionPerformed(
        java.awt.event.ActionEvent evt) {

    try {

        boolean imprimiu =
                tabelaRelatorio.print();

        if (imprimiu) {

            JOptionPane.showMessageDialog(
                    null,
                    "Relatório impresso com sucesso!"
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Impressão cancelada."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                null,
                erro.getMessage()
        );
    }
}
```

---

# O que é o boolean imprimiu?

O método print() retorna:

```text
true
```

Quando a impressão é realizada.

Ou:

```text
false
```

Quando o usuário cancela.

Exemplo:

```java
boolean imprimiu =
        tabelaRelatorio.print();
```

---

# Passo 5: Melhorando o Relatório

Podemos adicionar um título e a numeração das páginas.

Para isso utilizamos:

```java
MessageFormat
```

---

# Import Necessário

No início da classe:

```java
import java.text.MessageFormat;
```

---

# Criando Cabeçalho

```java
MessageFormat cabecalho =
        new MessageFormat(
                "Relatório de Produtos");
```

Esse texto aparecerá no topo de todas as páginas.

---

# Criando Rodapé

```java
MessageFormat rodape =
        new MessageFormat(
                "Página {0}");
```

Resultado:

```text
Página 1
Página 2
Página 3
...
```

---

# Passo 6: Impressão Profissional

```java
private void btnImprimirActionPerformed(
        java.awt.event.ActionEvent evt) {

    try {

        MessageFormat cabecalho =
                new MessageFormat(
                        "Relatório de Produtos");

        MessageFormat rodape =
                new MessageFormat(
                        "Página {0}");

        boolean imprimiu =
                tabelaRelatorio.print(
                        JTable.PrintMode.FIT_WIDTH,
                        cabecalho,
                        rodape
                );

        if (imprimiu) {

            JOptionPane.showMessageDialog(
                    null,
                    "Relatório impresso com sucesso!"
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Impressão cancelada."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                null,
                erro.getMessage()
        );
    }
}
```

---

# O que é FIT_WIDTH?

```java
JTable.PrintMode.FIT_WIDTH
```

Significa:

```text
Ajustar a largura da tabela
ao tamanho da página.
```

Sem isso algumas colunas podem ser cortadas.

---

# Resultado Final

O relatório impresso terá aparência semelhante a:

```text
------------------------------------------------

RELATÓRIO DE PRODUTOS

------------------------------------------------

ID   DESCRIÇÃO   VALOR   QUANTIDADE

1    Mouse       50,00   10
2    Teclado    100,00    5
3    Monitor    800,00    2

------------------------------------------------

Página 1

------------------------------------------------
```

---

# Vantagens da Impressão pela JTable

* Fácil implementação.
* Não exige bibliotecas externas.
* Funciona em qualquer sistema operacional compatível com Java.
* Mantém o mesmo formato exibido na tela.
* Ideal para projetos acadêmicos.

---

# Limitações

A impressão da JTable é indicada para relatórios simples.

Para relatórios profissionais normalmente utilizamos:

* JasperReports
* iReport
* PDF
* FastReport
* Crystal Reports

Mas para aprender os conceitos de impressão, a JTable atende perfeitamente.

---

# O que Aprendemos

Nesta aula aprendemos:

* Criar botão de impressão.
* Utilizar o método print().
* Abrir a janela de impressão do sistema.
* Tratar erros.
* Adicionar cabeçalho.
* Adicionar rodapé.
* Numerar páginas.
* Ajustar a largura da tabela.

Agora nosso sistema de produtos possui:

✅ Cadastro

✅ Consulta

✅ Alteração

✅ Exclusão

✅ Relatórios

✅ Impressão de Relatórios

Um conjunto de funcionalidades muito próximo dos sistemas comerciais utilizados no mercado.
