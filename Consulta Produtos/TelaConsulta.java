package Telas;

import banco.BancoSimulado;
import javax.swing.JOptionPane;
import modelo.Produto;
import javax.swing.table.DefaultTableModel;

public class Consulta extends javax.swing.JFrame {

 private int idSelecionado = 0;
    
private void limparCampos() {
    
    txtDescricao.setText("");
    txtValor.setText("");
    txtQuantidade.setText("");
    txtPesquisa.setText("");
  
    idSelecionado = 0;

    txtDescricao.requestFocus();
}    
    
private void carregarProduto() {
    
    DefaultTableModel modelo = new DefaultTableModel();

    String pesquisa = txtPesquisa.getText().toLowerCase();

    modelo.addColumn("ID");
    modelo.addColumn("Descrição");
    modelo.addColumn("Valor");
    modelo.addColumn("Quantidade");

    for (Produto produto : BancoSimulado.produtos) {

        boolean encontrou = false;

        if (rbDescricao.isSelected()) {

            if (produto.getDescricao().toLowerCase().contains(pesquisa)) {
                encontrou = true;
            }

        } else if (rbId.isSelected()) {

            try {
                int idPesquisado = Integer.parseInt(pesquisa);

                if (produto.getId() == idPesquisado) {
                    encontrou = true;
                }

            } catch (NumberFormatException erro) {
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
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Consulta.class.getName());

    public Consulta() {
        initComponents();
        rbDescricao.setSelected(true);
        carregarProduto();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPesquisa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbDescricao = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        grupoPesquisa.add(rbDescricao);
        rbDescricao.setSelected(true);
        rbDescricao.setText("Descrição");

        grupoPesquisa.add(rbId);
        rbId.setText("Código");

        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\comercial3\\OneDrive - SPS Power\\Documentos\\UC08\\Aula04\\Icones\\32 x 32\\lupa.png")); // NOI18N
        jToggleButton1.setText("Pesquisar");
        jToggleButton1.addActionListener(this::jToggleButton1ActionPerformed);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        jButton2.setText("Excluir");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(this::btnAdicionarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar)
                            .addComponent(jToggleButton1)
                            .addComponent(jButton2)
                            .addComponent(btnAdicionar))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDescricao)
                    .addComponent(rbId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        carregarProduto();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
          int linha = tabelaProdutos.getSelectedRow();

    if (linha >= 0) {

              idSelecionado = Integer.parseInt(
                      tabelaProdutos.getValueAt(linha, 0).toString()
              );

        txtDescricao.setText(
            tabelaProdutos.getValueAt(linha, 1).toString()
        );

        txtValor.setText(
            tabelaProdutos.getValueAt(linha, 2).toString()
        );

        txtQuantidade.setText(
            tabelaProdutos.getValueAt(linha, 3).toString()
        );
    }
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    
        
    if (idSelecionado == 0) {
        JOptionPane.showMessageDialog(null, "Selecione um produto na tabela.");
        return;
    }

    for (Produto produto : BancoSimulado.produtos) {

        if (produto.getId() == idSelecionado) {

            produto.setDescricao(txtDescricao.getText());
            produto.setValor(Double.parseDouble(txtValor.getText()));
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));

            JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");

            carregarProduto();
            limparCampos();

            idSelecionado = 0;

            break;
        }
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (txtDescricao.getText().isEmpty() ||
        txtValor.getText().isEmpty() ||
        txtQuantidade.getText().isEmpty()) {

        JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        return;
    }

    Produto produto = new Produto();

    produto.setId(BancoSimulado.idProduto);
    produto.setDescricao(txtDescricao.getText());
    produto.setValor(Double.parseDouble(txtValor.getText()));
    produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));

    BancoSimulado.produtos.add(produto);

    BancoSimulado.idProduto++;

    JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
    
    limparCampos();
    carregarProduto();
    
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (idSelecionado == 0) {
        JOptionPane.showMessageDialog(null, "Selecione um produto na tabela.");
        return;
    }

    int resposta = JOptionPane.showConfirmDialog(
        null,
        "Deseja realmente excluir este produto?",
        "Confirmar exclusão",
        JOptionPane.YES_NO_OPTION
    );

    if (resposta == JOptionPane.YES_OPTION) {

        for (Produto produto : BancoSimulado.produtos) {

            if (produto.getId() == idSelecionado) {

                BancoSimulado.produtos.remove(produto);

                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");

                carregarProduto();
                limparCampos();

                idSelecionado = 0;

                break;
            }
        }
    }
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Consulta().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup grupoPesquisa;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
