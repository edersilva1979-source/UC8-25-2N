# Trabalhando com JInternalFrame no Java Swing

## Objetivo da Aula

Aprender a manipular múltiplas janelas internas utilizando `JDesktopPane` e `JInternalFrame`, implementando recursos comuns encontrados em sistemas profissionais, como:

* Minimizar todas as janelas
* Restaurar todas as janelas
* Organizar janelas lado a lado
* Organizar janelas em cascata
* Organizar janelas em grade
* Fechar todas as janelas

---

# O que é um JDesktopPane?

O `JDesktopPane` é um container especial do Java Swing que permite trabalhar com múltiplas janelas internas dentro da mesma aplicação.

É a base dos sistemas MDI (Multiple Document Interface).

Exemplos:

* Sistemas ERP
* Sistemas Financeiros
* Sistemas Hospitalares
* Sistemas de Gestão Empresarial

Estrutura básica:

```text
JFrame Principal
│
└── JDesktopPane
     │
     ├── JInternalFrame 1
     ├── JInternalFrame 2
     └── JInternalFrame 3
```

---

# Criando uma Janela Interna

Exemplo:

```java
JInternalFrame telaCliente = new JInternalFrame(
        "Cadastro de Clientes",
        true,
        true,
        true,
        true
);

telaCliente.setSize(500,300);
telaCliente.setVisible(true);

jDesktopPane1.add(telaCliente);
```

---

# Minimizando Todas as Janelas

Muitas aplicações possuem a opção "Minimizar Tudo".

## Código

```java
private void minimizarTodas() {

    for (JInternalFrame frame : jDesktopPane1.getAllFrames()) {

        try {
            frame.setIcon(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }

    }

}
```

## Explicação

O método:

```java
setIcon(true);
```

equivale ao botão minimizar de uma janela comum.

---

# Restaurando Todas as Janelas

Após minimizar, podemos restaurar todas.

## Código

```java
private void restaurarTodas() {

    for (JInternalFrame frame : jDesktopPane1.getAllFrames()) {

        try {
            frame.setIcon(false);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }

    }

}
```

---

# Organizando Janelas Lado a Lado

Distribui igualmente as janelas na horizontal.

## Código

```java
private void organizarLadoALado() {

    JInternalFrame[] frames = jDesktopPane1.getAllFrames();

    if (frames.length == 0) {
        return;
    }

    int larguraDesktop = jDesktopPane1.getWidth();
    int alturaDesktop = jDesktopPane1.getHeight();

    int larguraFrame = larguraDesktop / frames.length;

    for (int i = 0; i < frames.length; i++) {

        try {
            frames[i].setIcon(false);
            frames[i].setMaximum(false);
        } catch (Exception e) {
        }

        frames[i].setBounds(
                i * larguraFrame,
                0,
                larguraFrame,
                alturaDesktop
        );
    }
}
```

## Resultado

```text
+---------+---------+---------+
| Janela1 | Janela2 | Janela3 |
|         |         |         |
+---------+---------+---------+
```

---

# Organizando em Cascata

Muito utilizado em sistemas antigos e ainda presente em diversos ERPs.

## Código

```java
private void organizarCascata() {

    JInternalFrame[] frames = jDesktopPane1.getAllFrames();

    int deslocamento = 30;

    for (int i = 0; i < frames.length; i++) {

        try {
            frames[i].setIcon(false);
            frames[i].setMaximum(false);
        } catch (Exception e) {
        }

        frames[i].setBounds(
                i * deslocamento,
                i * deslocamento,
                600,
                400
        );
    }
}
```

## Resultado

```text
+-------------------+
| Janela 1          |
|   +-------------------+
|   | Janela 2          |
|   |   +-------------------+
|   |   | Janela 3          |
+---|---|-------------------+
    +---|-------------------+
        +-------------------+
```

---

# Organizando em Grade

Ideal quando existem muitas janelas abertas.

## Código

```java
private void organizarGrade() {

    JInternalFrame[] frames = jDesktopPane1.getAllFrames();

    if (frames.length == 0) {
        return;
    }

    int cols = (int) Math.ceil(Math.sqrt(frames.length));
    int rows = (int) Math.ceil((double) frames.length / cols);

    int largura = jDesktopPane1.getWidth() / cols;
    int altura = jDesktopPane1.getHeight() / rows;

    int x = 0;
    int y = 0;
    int contador = 0;

    for (JInternalFrame frame : frames) {

        try {
            frame.setIcon(false);
            frame.setMaximum(false);
        } catch (Exception e) {
        }

        frame.setBounds(x, y, largura, altura);

        contador++;
        x += largura;

        if (contador % cols == 0) {
            x = 0;
            y += altura;
        }
    }
}
```

## Resultado

```text
+---------+---------+
| Janela1 | Janela2 |
+---------+---------+
| Janela3 | Janela4 |
+---------+---------+
| Janela5 | Janela6 |
+---------+---------+
```

---

# Fechando Todas as Janelas

Permite encerrar todas as telas abertas.

## Código

```java
private void fecharTodas() {

    for (JInternalFrame frame : jDesktopPane1.getAllFrames()) {

        try {
            frame.setClosed(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }

    }

}
```

---

# Fechando Todas com Confirmação

Versão profissional.

## Código

```java
private void fecharTodas() {

    int opcao = JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente fechar todas as janelas abertas?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
    );

    if (opcao == JOptionPane.YES_OPTION) {

        for (JInternalFrame frame : jDesktopPane1.getAllFrames()) {

            try {
                frame.setClosed(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }

        }

    }

}
```

---

# Criando o Menu Janela

Sugestão para sistemas profissionais.

```text
Janela
│
├── Minimizar Todas
├── Restaurar Todas
├── Organizar em Cascata
├── Organizar Lado a Lado
├── Organizar em Grade
├── Fechar Todas
```

Cada item do menu chama o método correspondente.

Exemplo:

```java
private void menuCascataActionPerformed(
        java.awt.event.ActionEvent evt) {

    organizarCascata();

}
```

---

# Boas Práticas

✔ Evite abrir múltiplas instâncias da mesma tela.

✔ Centralize as telas ao abrir.

✔ Utilize ícones nos menus.

✔ Adicione atalhos de teclado.

✔ Sempre trate exceções.

✔ Solicite confirmação antes de fechar tudo.

✔ Mantenha um menu "Janela" para facilitar a navegação.

---

# Exercício Prático

Criar um sistema MDI contendo:

### Tela Principal

* JFrame
* JDesktopPane
* JMenuBar

### Menu Cadastros

* Clientes
* Produtos
* Fornecedores

### Menu Janela

* Minimizar Todas
* Restaurar Todas
* Cascata
* Grade
* Lado a Lado
* Fechar Todas

### Desafio Extra

Impedir que o usuário abra duas vezes a mesma tela.

Exemplo:

```java
if (telaCliente == null || telaCliente.isClosed()) {

    telaCliente = new FrmCliente();

    jDesktopPane1.add(telaCliente);

    telaCliente.setVisible(true);

}
```

---

# Conclusão

O uso de JDesktopPane e JInternalFrame permite criar aplicações desktop profissionais com múltiplas telas abertas simultaneamente.

Ao final desta aula você deve ser capaz de:

* Criar janelas internas
* Manipular estados das janelas
* Organizar telas automaticamente
* Implementar menus de gerenciamento
* Desenvolver aplicações MDI semelhantes às utilizadas em empresas e ERPs profissionais
