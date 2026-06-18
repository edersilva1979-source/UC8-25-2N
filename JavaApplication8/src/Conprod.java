import modelo.Produto;
import javax.swing.table.*;
import javax.swing.JOptionPane;

public class Conprod extends javax.swing.JInternalFrame {

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
    
    
    
    public Conprod() {
        initComponents();
        carregarProduto();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        rbDescricao = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Prdutos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por:"));

        buttonGroup1.add(rbDescricao);
        rbDescricao.setText("Descrição");

        buttonGroup1.add(rbId);
        rbId.setText("Código");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        txtQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));

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

        jButton2.setText("Adicionar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Editar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Excluir");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rbDescricao)
                                .addGap(18, 18, 18)
                                .addComponent(rbId))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                            .addComponent(txtPesquisa, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton3)
                                                    .addComponent(jButton2)
                                                    .addComponent(jButton4))))))))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDescricao)
                    .addComponent(rbId))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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

    carregarProduto();
    limparCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregarProduto();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
