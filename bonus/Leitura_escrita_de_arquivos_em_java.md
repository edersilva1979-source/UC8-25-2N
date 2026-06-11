# Aula: Leitura e Escrita de Arquivos em Java Swing com NetBeans

## Objetivo da Aula

Nesta aula vamos aprender a trabalhar com arquivos de texto utilizando Java Swing.

Ao final da aula você será capaz de:

* Criar arquivos de texto
* Salvar informações em arquivos
* Abrir arquivos existentes
* Ler o conteúdo de arquivos
* Utilizar o componente `JFileChooser`
* Criar um pequeno editor de texto em Java

---

# O que é manipulação de arquivos?

Manipular arquivos significa permitir que um programa grave e leia informações armazenadas no computador.

Imagine um bloco de notas:

* Você digita um texto
* Salva o arquivo
* Fecha o programa
* Abre novamente
* O texto continua lá

É exatamente isso que vamos aprender.

---

# Criando o Projeto

## Passo 1

Abra o NetBeans.

Clique em:

```text
File → New Project
```

Escolha:

```text
Java with Ant
```

Depois:

```text
Java Application
```

Nome do projeto:

```text
ManipulandoArquivosSwing
```

Desmarque:

```text
Create Main Class
```

Clique em:

```text
Finish
```

---

# Criando a Tela

Clique com o botão direito no pacote do projeto.

Escolha:

```text
New → JFrame Form
```

Nome da classe:

```java
TelaArquivos
```

---

# Componentes Utilizados

Adicione os seguintes componentes à tela.

## JTextArea

Nome:

```java
txtConteudo
```

Função:

Receber e exibir o texto do arquivo.

---

## JButton

Crie três botões.

### Botão Salvar

Nome:

```java
btnSalvar
```

Texto:

```text
Salvar Arquivo
```

---

### Botão Abrir

Nome:

```java
btnAbrir
```

Texto:

```text
Abrir Arquivo
```

---

### Botão Limpar

Nome:

```java
btnLimpar
```

Texto:

```text
Limpar
```

---

# Importações Necessárias

Adicione as seguintes importações no início da classe:

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
```

---

# Salvando um Arquivo

Código do botão Salvar:

```java
private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {

    JFileChooser escolherArquivo = new JFileChooser();

    int opcao = escolherArquivo.showSaveDialog(this);

    if (opcao == JFileChooser.APPROVE_OPTION) {

        File arquivo = escolherArquivo.getSelectedFile();

        try {

            FileWriter escritorArquivo =
                    new FileWriter(arquivo);

            BufferedWriter escritor =
                    new BufferedWriter(escritorArquivo);

            escritor.write(txtConteudo.getText());

            escritor.close();
            escritorArquivo.close();

            JOptionPane.showMessageDialog(this,
                    "Arquivo salvo com sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(this,
                    "Erro ao salvar arquivo!");

        }
    }
}
```

---

# Entendendo o Código

### JFileChooser

```java
JFileChooser escolherArquivo =
        new JFileChooser();
```

Abre uma janela para escolher onde salvar o arquivo.

---

### showSaveDialog()

```java
showSaveDialog(this);
```

Mostra a janela de salvar arquivo.

---

### getSelectedFile()

```java
File arquivo =
        escolherArquivo.getSelectedFile();
```

Obtém o local escolhido pelo usuário.

---

### FileWriter

```java
FileWriter escritorArquivo =
        new FileWriter(arquivo);
```

Cria a conexão entre o programa e o arquivo.

---

### BufferedWriter

```java
BufferedWriter escritor =
        new BufferedWriter(escritorArquivo);
```

Permite escrever informações no arquivo.

---

### write()

```java
escritor.write(txtConteudo.getText());
```

Salva o conteúdo digitado no JTextArea.

---

### close()

```java
escritor.close();
```

Fecha o arquivo após a gravação.

---

# Abrindo um Arquivo

Código do botão Abrir:

```java
private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {

    JFileChooser escolherArquivo =
            new JFileChooser();

    int opcao =
            escolherArquivo.showOpenDialog(this);

    if (opcao == JFileChooser.APPROVE_OPTION) {

        File arquivo =
                escolherArquivo.getSelectedFile();

        try {

            FileReader leitorArquivo =
                    new FileReader(arquivo);

            BufferedReader leitor =
                    new BufferedReader(leitorArquivo);

            String linha;
            String conteudo = "";

            while ((linha = leitor.readLine()) != null) {

                conteudo += linha + "\n";

            }

            txtConteudo.setText(conteudo);

            leitor.close();
            leitorArquivo.close();

            JOptionPane.showMessageDialog(this,
                    "Arquivo aberto com sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(this,
                    "Erro ao abrir arquivo!");

        }
    }
}
```

---

# Entendendo a Leitura

### FileReader

```java
FileReader leitorArquivo =
        new FileReader(arquivo);
```

Abre o arquivo para leitura.

---

### BufferedReader

```java
BufferedReader leitor =
        new BufferedReader(leitorArquivo);
```

Permite ler linha por linha.

---

### readLine()

```java
leitor.readLine()
```

Lê uma linha do arquivo.

---

### while

```java
while ((linha = leitor.readLine()) != null)
```

Continua lendo enquanto existirem linhas.

---

### setText()

```java
txtConteudo.setText(conteudo);
```

Exibe o conteúdo do arquivo na tela.

---

# Limpando o Conteúdo

Código do botão Limpar:

```java
private void btnLimparActionPerformed(
        java.awt.event.ActionEvent evt) {

    txtConteudo.setText("");

}
```

Esse botão limpa apenas o conteúdo da tela.

O arquivo salvo não é alterado.

---

# Melhorando o Salvamento

Podemos garantir que o arquivo seja salvo com extensão `.txt`.

```java
if (!arquivo.getName()
        .toLowerCase()
        .endsWith(".txt")) {

    arquivo = new File(
            arquivo.getAbsolutePath() + ".txt");

}
```

Assim o usuário não precisa digitar a extensão manualmente.

---

# Exemplo Prático

Vamos utilizar a aplicação como um bloco de notas simples.

### Passo 1

Digite:

```text
Olá mundo!
Estou aprendendo Java.
```

---

### Passo 2

Clique em:

```text
Salvar Arquivo
```

Salve como:

```text
teste.txt
```

---

### Passo 3

Clique em:

```text
Limpar
```

---

### Passo 4

Clique em:

```text
Abrir Arquivo
```

Escolha:

```text
teste.txt
```

O texto aparecerá novamente na tela.

---

# Exercício Proposto

Crie um projeto chamado:

```text
BlocoDeNotasJava
```

A tela deve possuir:

* JTextArea
* Botão Novo
* Botão Abrir
* Botão Salvar
* Botão Sair

---

## Regras

### Novo

Limpa o conteúdo da tela.

```java
txtConteudo.setText("");
```

---

### Abrir

Carrega um arquivo de texto.

---

### Salvar

Salva o conteúdo digitado.

---

### Sair

Fecha a aplicação.

```java
System.exit(0);
```

---

# Resumo da Aula

Nesta aula aprendemos a utilizar:

```java
File
FileWriter
BufferedWriter
FileReader
BufferedReader
JFileChooser
```

Com essas classes podemos criar programas capazes de salvar e abrir arquivos diretamente no computador do usuário.

Esse conhecimento é muito importante porque permite criar sistemas que armazenam informações sem depender de banco de dados.

É um dos primeiros passos para desenvolver aplicações completas em Java.
