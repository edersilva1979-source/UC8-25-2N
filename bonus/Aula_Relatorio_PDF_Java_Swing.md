# Aula: Gerando Relatório de Produtos em PDF com Java Swing

## Objetivo

Nesta aula vamos aprender a gerar um relatório em PDF contendo todos os produtos cadastrados no sistema.

Ao final da aula o sistema será capaz de:

* Gerar um arquivo PDF.
* Exibir os produtos cadastrados.
* Mostrar o total de produtos.
* Mostrar o valor total do estoque.
* Abrir automaticamente o PDF após a geração.

---

# O que é um Relatório em PDF?

PDF significa:

```text
Portable Document Format
```

É um formato muito utilizado para:

* Relatórios empresariais.
* Orçamentos.
* Notas fiscais.
* Contratos.
* Documentos oficiais.

A principal vantagem é que o documento mantém a mesma aparência em qualquer computador.

---

# Como o Sistema Vai Funcionar?

O fluxo será:

```text
Produtos Cadastrados
          ↓
      ArrayList
          ↓
   Gerar Relatório
          ↓
         PDF
          ↓
   Abrir Automaticamente
```

---

# Biblioteca Utilizada

Para gerar o PDF vamos utilizar a biblioteca OpenPDF.

Ela permite criar documentos PDF utilizando Java.

---

# Passo 1: Adicionar a Biblioteca

Se o projeto utiliza Maven, adicionar no arquivo pom.xml:

```xml
<dependency>
    <groupId>com.github.librepdf</groupId>
    <artifactId>openpdf</artifactId>
    <version>3.0.5</version>
</dependency>
```

---

# Passo 2: Criar o Botão

Na tela de relatório criar um botão.

Propriedades:

```text
Nome: btnGerarPDF

Texto: Gerar PDF
```

Exemplo:

```text
----------------------------------

[Pesquisar]

[Todos]

[Estoque Baixo]

[Imprimir]

[Gerar PDF]

----------------------------------
```

---

# Passo 3: Adicionar os Imports

No início da classe:

```java
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

import org.openpdf.text.Document;
import org.openpdf.text.Element;
import org.openpdf.text.Font;
import org.openpdf.text.FontFactory;
import org.openpdf.text.Paragraph;

import org.openpdf.text.pdf.PdfPTable;
import org.openpdf.text.pdf.PdfWriter;
```

---

# Passo 4: Criar o Documento PDF

Primeiro criamos o documento.

```java
Document documento =
        new Document();
```

Esse objeto representa o arquivo PDF.

---

# Passo 5: Definir o Nome do Arquivo

```java
String caminho =
        "relatorio_produtos.pdf";
```

Esse será o nome do arquivo gerado.

---

# Passo 6: Criar o Arquivo

```java
PdfWriter.getInstance(
        documento,
        new FileOutputStream(caminho)
);
```

Aqui o Java cria fisicamente o arquivo PDF.

---

# Passo 7: Abrir o Documento

```java
documento.open();
```

Após abrir o documento podemos adicionar informações.

---

# Passo 8: Criar o Título

Criar uma fonte.

```java
Font fonteTitulo =
        FontFactory.getFont(
                FontFactory.HELVETICA_BOLD,
                18
        );
```

Criar o título.

```java
Paragraph titulo =
        new Paragraph(
                "Relatório de Produtos",
                fonteTitulo
        );
```

Centralizar.

```java
titulo.setAlignment(
        Element.ALIGN_CENTER);
```

Adicionar ao PDF.

```java
documento.add(titulo);
```

---

# Passo 9: Criar a Tabela

Criar uma tabela com quatro colunas.

```java
PdfPTable tabela =
        new PdfPTable(4);
```

Adicionar cabeçalhos.

```java
tabela.addCell("ID");
tabela.addCell("Descrição");
tabela.addCell("Valor");
tabela.addCell("Quantidade");
```

---

# Passo 10: Carregar os Produtos

Percorrer o ArrayList.

```java
for (Produto produto :
        BancoSimulado.produtos)
```

Adicionar os dados.

```java
tabela.addCell(
        String.valueOf(
                produto.getId()));

tabela.addCell(
        produto.getDescricao());

tabela.addCell(
        String.format(
                "R$ %.2f",
                produto.getValor()));

tabela.addCell(
        String.valueOf(
                produto.getQuantidade()));
```

---

# Passo 11: Adicionar a Tabela ao PDF

```java
documento.add(tabela);
```

Agora os produtos aparecem no relatório.

---

# Passo 12: Calcular o Valor do Estoque

Criar variável.

```java
double valorTotalEstoque = 0;
```

Durante o laço:

```java
valorTotalEstoque +=
        produto.getValor()
        * produto.getQuantidade();
```

Exemplo:

```text
Mouse

50 × 10 = 500

Teclado

100 × 5 = 500

Total = 1000
```

---

# Passo 13: Adicionar Totais ao PDF

Quantidade de produtos:

```java
documento.add(
        new Paragraph(
                "Total de Produtos: "
                + BancoSimulado
                .produtos.size()
        )
);
```

Valor total:

```java
documento.add(
        new Paragraph(
                "Valor Total do Estoque: R$ "
                + String.format(
                        "%.2f",
                        valorTotalEstoque)
        )
);
```

---

# Passo 14: Fechar o Documento

```java
documento.close();
```

Muito importante.

Sem esse comando o PDF pode ser criado incompleto.

---

# Passo 15: Abrir o PDF Automaticamente

```java
Desktop.getDesktop().open(
        new File(caminho));
```

Assim o sistema abre o PDF logo após a geração.

---

# Estrutura Completa do PDF

O resultado será semelhante a:

```text
-------------------------------------------------

RELATÓRIO DE PRODUTOS

-------------------------------------------------

ID   DESCRIÇÃO   VALOR   QUANTIDADE

1    Mouse       50,00   10

2    Teclado    100,00    5

3    Monitor    800,00    2

-------------------------------------------------

Total de Produtos: 3

Valor Total Estoque: R$ 2600,00

-------------------------------------------------
```

---

# Tratamento de Erros

Sempre utilizar try/catch.

```java
try {

    // código

} catch (Exception erro) {

    JOptionPane.showMessageDialog(
            null,
            erro.getMessage()
    );
}
```

Isso evita que o sistema seja encerrado caso ocorra algum erro.

---

# O que Aprendemos

Nesta aula aprendemos a:

* Utilizar a biblioteca OpenPDF.
* Criar documentos PDF.
* Adicionar títulos.
* Criar tabelas.
* Ler dados do ArrayList.
* Inserir informações no PDF.
* Calcular totais.
* Salvar arquivos.
* Abrir arquivos automaticamente.
* Tratar erros.

---

# Próximos Passos

Após dominar a geração de PDF podemos evoluir para:

* Relatórios de Clientes.
* Relatórios de Vendas.
* Relatórios com imagens.
* Relatórios com logotipo da empresa.
* Exportação para Excel.
* JasperReports.
* Banco de Dados MySQL.

Parabéns! Seu sistema agora possui cadastro, consulta, edição, exclusão, relatório em tela, impressão e exportação para PDF.
