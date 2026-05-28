# Java Swing com NetBeans

## Menu Bar, Barra de Ferramentas, Hint e JDesktopPane

---

# Índice

1. O que é Menu Bar
2. Criando Menu Bar no NetBeans
3. Criando Barra de Ferramentas com JPanel
4. Adicionando Ícones nos Botões
5. Criando Hint (ToolTipText)
6. Trabalhando com JDesktopPane
7. Criando JInternalFrame
8. Abrindo Telas Internas
9. Estrutura Profissional do Sistema

---

# 1. O que é Menu Bar

A Menu Bar é a barra de menus localizada no topo da aplicação.

Ela organiza funcionalidades do sistema em menus e submenus.

Exemplo:

```text
Cadastro
    Cliente
    Produto
    Serviço

Consulta
    Cliente
    Produto
    Serviço
```

No Java Swing utilizamos:

| Componente | Função          |
| ---------- | --------------- |
| JMenuBar   | Barra principal |
| JMenu      | Menu            |
| JMenuItem  | Item do menu    |

---

# 2. Criando Menu Bar no NetBeans

## Passo 1

Abra o JFrame no modo Design.

```text
TelaPrincipal.java
```

---

## Passo 2

Na Palette:

```text
Swing Menus
```

Arraste:

```text
Menu Bar
```

para o JFrame.

---

## Passo 3

Renomeie os menus:

| Original | Novo Nome |
| -------- | --------- |
| File     | Cadastro  |
| Edit     | Consulta  |

---

## Passo 4

Adicione os itens:

### Cadastro

```text
Cliente
Produto
Serviço
```

### Consulta

```text
Cliente
Produto
Serviço
```

---

## Código esperado

```java
JMenuBar menuBar = new JMenuBar();

JMenu menuCadastro = new JMenu("Cadastro");
JMenu menuConsulta = new JMenu("Consulta");

menuCadastro.add(new JMenuItem("Cliente"));
menuCadastro.add(new JMenuItem("Produto"));
menuCadastro.add(new JMenuItem("Serviço"));

menuConsulta.add(new JMenuItem("Cliente"));
menuConsulta.add(new JMenuItem("Produto"));
menuConsulta.add(new JMenuItem("Serviço"));

menuBar.add(menuCadastro);
menuBar.add(menuConsulta);

setJMenuBar(menuBar);
```

---

# 3. Criando Barra de Ferramentas com JPanel

## Objetivo

Criar uma barra com:

```text
Novo
Salvar
Excluir
```

---

## Passo 1

Na Palette:

```text
Swing Containers
```

Arraste:

```text
Panel
```

para abaixo da Menu Bar.

---

## Passo 2

Renomeie a variável:

```java
painelBotoes
```

---

## Passo 3

Altere o background:

```text
Preto
```

ou:

```java
new Color(0,0,0)
```

---

## Passo 4

Adicione 3 botões.

Na Palette:

```text
Swing Controls
```

Arraste:

```text
Button
```

---

## Passo 5

Configure os textos:

```text
Novo
Salvar
Excluir
```

---

## Passo 6

Renomeie as variáveis:

```java
btnNovo
btnSalvar
btnExcluir
```

---

# 4. Adicionando Ícones nos Botões

## Estrutura recomendada

Crie um pacote:

```text
imagens
```

Arquivos:

```text
novo.png
salvar.png
excluir.png
```

---

## Configuração dos botões

No botão:

```text
Properties → icon
```

Importe a imagem.

---

## Ajuste posição do texto

```text
horizontalTextPosition = CENTER
verticalTextPosition = BOTTOM
```

---

## Código esperado

```java
btnNovo.setIcon(new ImageIcon(getClass().getResource("/imagens/novo.png")));

btnNovo.setText("Novo");

btnNovo.setHorizontalTextPosition(SwingConstants.CENTER);

btnNovo.setVerticalTextPosition(SwingConstants.BOTTOM);
```

---

# 5. Criando Hint (ToolTipText)

Hint é a mensagem exibida ao passar o mouse sobre um botão.

---

## Exemplos

| Botão   | Hint                |
| ------- | ------------------- |
| Novo    | Criar novo cadastro |
| Salvar  | Salvar informações  |
| Excluir | Excluir registro    |

---

## Como configurar

Selecione o botão.

Na propriedade:

```text
toolTipText
```

Digite o texto desejado.

---

## Código esperado

```java
btnNovo.setToolTipText("Criar novo cadastro");

btnSalvar.setToolTipText("Salvar informações");

btnExcluir.setToolTipText("Excluir registro");
```

---

# 6. Trabalhando com JDesktopPane

O JDesktopPane é uma área de trabalho que permite abrir múltiplas janelas internas.

Muito utilizado em:

* ERP
* Sistemas financeiros
* Sistemas comerciais
* Sistemas hospitalares

---

# Estrutura

```text
JFrame
    |
    └── JDesktopPane
            |
            ├── JInternalFrame
            ├── JInternalFrame
            └── JInternalFrame
```

---

# 7. Criando JInternalFrame

## Passo 1

Clique com botão direito em:

```text
Source Packages
```

Escolha:

```text
New → JInternalFrame Form
```

---

## Passo 2

Nome:

```text
TelaCliente
```

---

## Passo 3

Adicione componentes:

* JLabel
* JTextField
* JButton

---

## Exemplo

```text
Nome:
CPF:
[ Salvar ]
```

---

## Configurações importantes

| Propriedade | Valor |
| ----------- | ----- |
| closable    | true  |
| maximizable | true  |
| iconifiable | true  |
| resizable   | true  |

---

# 8. Abrindo Telas Internas

## Passo 1

Adicione um:

```text
Desktop Pane
```

na TelaPrincipal.

---

## Passo 2

Renomeie:

```java
desktopPrincipal
```

---

## Passo 3

No evento do menu Cliente:

```java
private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {

    TelaCliente tela = new TelaCliente();

    desktopPrincipal.add(tela);

    tela.setVisible(true);

}
```

---

# Explicação do código

## Criar a janela

```java
TelaCliente tela = new TelaCliente();
```

---

## Adicionar no DesktopPane

```java
desktopPrincipal.add(tela);
```

---

## Tornar visível

```java
tela.setVisible(true);
```

---

# 9. Estrutura Profissional do Sistema

```text
TelaPrincipal
    |
    └── JDesktopPane
            |
            ├── TelaCliente
            ├── TelaProduto
            ├── TelaServico
            └── TelaConsulta
```

---

# Resultado Final

O sistema terá:

* Menu profissional
* Barra de ferramentas
* Botões com ícones
* Hint nos botões
* Área de trabalho interna
* Múltiplas janelas internas

---

# Conceitos Importantes

| Componente     | Função             |
| -------------- | ------------------ |
| JFrame         | Janela principal   |
| JMenuBar       | Barra de menus     |
| JMenu          | Menus              |
| JMenuItem      | Itens do menu      |
| JPanel         | Painel organizador |
| JButton        | Botão              |
| ToolTipText    | Hint               |
| JDesktopPane   | Área de trabalho   |
| JInternalFrame | Janela interna     |

---

# Dicas Profissionais

## Remover borda do botão

```java
btnNovo.setBorderPainted(false);
```

---

## Remover preenchimento

```java
btnNovo.setContentAreaFilled(false);
```

---

## Remover foco

```java
btnNovo.setFocusPainted(false);
```

---

## Alterar cor do texto

```java
btnNovo.setForeground(Color.WHITE);
```

---



# Autor

Éder Silva
Professor e Desenvolvedor de Sistemas
