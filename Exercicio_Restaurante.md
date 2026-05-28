# 🍽️ Sistema Restaurante em Java Swing com NetBeans

# Exercício Guiado Completo

Projeto desktop utilizando:

* Java Swing
* NetBeans
* JMenuBar
* JPanel
* JButton
* Hint (ToolTipText)
* JDesktopPane
* JInternalFrame
* Classes simulando banco de dados

---

# 📚 Objetivo do Projeto

Criar um sistema simples de restaurante contendo:

✅ Cadastro de clientes
✅ Cadastro de produtos
✅ Cadastro de mesas
✅ Cadastro de pedidos
✅ Menu profissional
✅ Barra de ferramentas
✅ Janelas internas
✅ Banco de dados simulado em memória

---

# 🏗️ Estrutura do Projeto

```text
SistemaRestaurante
│
├── src
│   │
│   ├── telas
│   │     ├── TelaPrincipal.java
│   │     ├── TelaCliente.java
│   │     ├── TelaProduto.java
│   │     ├── TelaMesa.java
│   │     └── TelaPedido.java
│   │
│   ├── modelo
│   │     ├── Cliente.java
│   │     ├── Produto.java
│   │     ├── Mesa.java
│   │     └── Pedido.java
│   │
│   └── banco
│         └── BancoSimulado.java
```

---

# 🚀 Parte 1 - Criando o Projeto

## Passo 1

Abra o NetBeans.

---

## Passo 2

Crie um novo projeto:

```text
Java with Ant
→ Java Application
```

---

## Passo 3

Nome do projeto:

```text
SistemaRestaurante
```

---

## Passo 4

Crie os pacotes:

```text
telas
modelo
banco
```

---

# 🖥️ Parte 2 - Criando a Tela Principal

Crie um:

```text
JFrame Form
```

Nome:

```text
TelaPrincipal
```

Pacote:

```text
telas
```

Essa será a janela principal do sistema.

---

# 📋 Parte 3 - Criando o Menu Principal

## Menus principais

```text
Cadastro
Consulta
Pedidos
Sistema
```

---

## Submenus Cadastro

```text
Cliente
Produto
Mesa
```

---

## Submenus Consulta

```text
Clientes
Produtos
Pedidos
```

---

## Submenus Pedidos

```text
Novo Pedido
```

---

## Submenus Sistema

```text
Sair
```

---

# 🛠️ Parte 4 - Criando a Barra de Ferramentas

## Passo 1

Adicione um:

```text
JPanel
```

abaixo do menu principal.

---

## Passo 2

Nome da variável:

```java
painelBotoes
```

---

## Passo 3

Altere o background:

```java
Preto
```

---

## Passo 4

Adicione 4 botões:

```text
Cliente
Produto
Pedido
Sair
```

---

## Passo 5

Renomeie as variáveis:

```java
btnCliente
btnProduto
btnPedido
btnSair
```

---

# 💡 Parte 5 - Adicionando Hint nos Botões

```java
btnCliente.setToolTipText("Abrir cadastro de clientes");

btnProduto.setToolTipText("Abrir cadastro de produtos");

btnPedido.setToolTipText("Abrir novo pedido");

btnSair.setToolTipText("Sair do sistema");
```

---

# 🧱 Parte 6 - Adicionando o JDesktopPane

Adicione um:

```text
Desktop Pane
```

abaixo da barra de ferramentas.

---

## Nome da variável

```java
desktopPrincipal
```

---

# 🧾 Parte 7 - Criando as Classes de Modelo

# Classe Cliente

```java
package modelo;

public class Cliente {

    private int id;
    private String nome;
    private String telefone;

    public Cliente(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return id + " | " + nome + " | " + telefone;
    }
}
```

---

# Classe Produto

```java
package modelo;

public class Produto {

    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return id + " | " + nome + " | R$ " + preco;
    }
}
```

---

# Classe Mesa

```java
package modelo;

public class Mesa {

    private int numero;
    private String status;

    public Mesa(int numero, String status) {
        this.numero = numero;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Mesa " + numero + " | " + status;
    }
}
```

---

# Classe Pedido

```java
package modelo;

public class Pedido {

    private int id;
    private String cliente;
    private String produto;
    private int mesa;

    public Pedido(int id, String cliente, String produto, int mesa) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Pedido " + id + " | Cliente: " + cliente + " | Produto: " + produto + " | Mesa: " + mesa;
    }
}
```

---

# 🗄️ Parte 8 - Criando o Banco Simulado

Crie a classe:

```text
BancoSimulado
```

Pacote:

```text
banco
```

---

## Código

```java
package banco;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Produto;
import modelo.Mesa;
import modelo.Pedido;

public class BancoSimulado {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static ArrayList<Produto> produtos = new ArrayList<>();

    public static ArrayList<Mesa> mesas = new ArrayList<>();

    public static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static int idCliente = 1;

    public static int idProduto = 1;

    public static int idPedido = 1;
}
```

---

# 👤 Parte 9 - Tela de Cadastro de Clientes

Crie um:

```text
JInternalFrame Form
```

Nome:

```text
TelaCliente
```

---

## Componentes

```text
JLabel Nome
JTextField txtNome

JLabel Telefone
JTextField txtTelefone

JButton btnSalvar

JTextArea areaClientes
```

---

## Código do botão Salvar

```java
private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {

    String nome = txtNome.getText();

    String telefone = txtTelefone.getText();

    Cliente cliente = new Cliente(
            BancoSimulado.idCliente,
            nome,
            telefone
    );

    BancoSimulado.clientes.add(cliente);

    BancoSimulado.idCliente++;

    areaClientes.append(cliente.toString() + "\n");

    txtNome.setText("");

    txtTelefone.setText("");
}
```

---

## Imports

```java
import banco.BancoSimulado;
import modelo.Cliente;
```

---

# 🍔 Parte 10 - Tela de Produtos

Crie:

```text
TelaProduto
```

---

## Componentes

```text
JLabel Nome
JTextField txtNome

JLabel Preço
JTextField txtPreco

JButton btnSalvar

JTextArea areaProdutos
```

---

## Código do botão

```java
private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {

    String nome = txtNome.getText();

    double preco = Double.parseDouble(txtPreco.getText());

    Produto produto = new Produto(
            BancoSimulado.idProduto,
            nome,
            preco
    );

    BancoSimulado.produtos.add(produto);

    BancoSimulado.idProduto++;

    areaProdutos.append(produto.toString() + "\n");

    txtNome.setText("");

    txtPreco.setText("");
}
```

---

## Imports

```java
import banco.BancoSimulado;
import modelo.Produto;
```

---

# 🧾 Parte 11 - Tela de Pedidos

Crie:

```text
TelaPedido
```

---

## Componentes

```text
JLabel Cliente
JTextField txtCliente

JLabel Produto
JTextField txtProduto

JLabel Mesa
JTextField txtMesa

JButton btnRegistrar

JTextArea areaPedidos
```

---

## Código do botão Registrar

```java
private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {

    String cliente = txtCliente.getText();

    String produto = txtProduto.getText();

    int mesa = Integer.parseInt(txtMesa.getText());

    Pedido pedido = new Pedido(
            BancoSimulado.idPedido,
            cliente,
            produto,
            mesa
    );

    BancoSimulado.pedidos.add(pedido);

    BancoSimulado.idPedido++;

    areaPedidos.append(pedido.toString() + "\n");

    txtCliente.setText("");

    txtProduto.setText("");

    txtMesa.setText("");
}
```

---

## Imports

```java
import banco.BancoSimulado;
import modelo.Pedido;
```

---

# 🪟 Parte 12 - Abrindo as Telas Internas

Na:

```text
TelaPrincipal
```

crie os métodos:

```java
private void abrirTelaCliente() {

    TelaCliente tela = new TelaCliente();

    desktopPrincipal.add(tela);

    tela.setVisible(true);
}
```

---

```java
private void abrirTelaProduto() {

    TelaProduto tela = new TelaProduto();

    desktopPrincipal.add(tela);

    tela.setVisible(true);
}
```

---

```java
private void abrirTelaPedido() {

    TelaPedido tela = new TelaPedido();

    desktopPrincipal.add(tela);

    tela.setVisible(true);
}
```

---

# 🔗 Parte 13 - Ligando Menus e Botões

## Menu Cliente

```java
abrirTelaCliente();
```

---

## Menu Produto

```java
abrirTelaProduto();
```

---

## Menu Novo Pedido

```java
abrirTelaPedido();
```

---

## Botão Sair

```java
System.exit(0);
```

---

# 🧠 Explicação do Projeto

| Componente     | Função                |
| -------------- | --------------------- |
| JFrame         | Janela principal      |
| JMenuBar       | Barra de menus        |
| JPanel         | Barra de ferramentas  |
| JButton        | Botões                |
| ToolTipText    | Hint                  |
| JDesktopPane   | Área de trabalho      |
| JInternalFrame | Janela interna        |
| ArrayList      | Simula banco de dados |

---

# 🎯 Resultado Esperado

Ao final do exercício teremos:

✅ Sistema desktop funcional
✅ Estrutura profissional
✅ Cadastro de clientes
✅ Cadastro de produtos
✅ Cadastro de pedidos
✅ Janelas internas
✅ Banco de dados simulado

---

# 🚀 Desafios Extras

## Criar TelaMesa

Adicionar:

```text
Número da mesa
Status da mesa
Botão Salvar
Área para listar mesas
```

---

## Melhorias sugeridas

* JTable
* Login
* MySQL
* JDBC
* DAO
* MVC
* Relatórios
* Impressão
* Sistema de caixa
* Controle financeiro

---

# 👨‍🏫 Autor

Éder Silva
Professor e Desenvolvedor de Sistemas
