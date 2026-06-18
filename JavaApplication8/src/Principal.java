
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;



public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());


    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Cliente = new javax.swing.JMenuItem();
        Produto = new javax.swing.JMenuItem();
        Produto1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        desktopPrincipal = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();

        jPopupMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPopupMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Cliente.setText("Cliente");
        Cliente.addActionListener(this::ClienteActionPerformed);
        jPopupMenu1.add(Cliente);

        Produto.setText("Produto");
        jPopupMenu1.add(Produto);

        Produto1.setText("Serviço");
        jPopupMenu1.add(Produto1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão de Serviços");
        setBackground(new java.awt.Color(123, 129, 136));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ed Soluções\\Documents\\01 - Senac\\UC8 - JAVA\\Icones\\32 x 32\\cliente(1).png")); // NOI18N
        jButton1.setToolTipText("Cadastro de Clientes");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ed Soluções\\Documents\\01 - Senac\\UC8 - JAVA\\Icones\\32 x 32\\caixa(1).png")); // NOI18N
        jButton2.setToolTipText("Cadastro de Serviços");

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ed Soluções\\Documents\\01 - Senac\\UC8 - JAVA\\Icones\\32 x 32\\ordem-de-servico.png")); // NOI18N
        jButton3.setToolTipText("Gerar Ordem de Serviços");

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ed Soluções\\Documents\\01 - Senac\\UC8 - JAVA\\Icones\\32 x 32\\atualizacao-do-sistema.png")); // NOI18N
        jButton4.setToolTipText("Clique aqui para fazer Logout");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(this::jButton4ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        desktopPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        desktopPrincipal.setComponentPopupMenu(jPopupMenu1);

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jMenu1.setText("Cadastro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("Clientes");
        jMenuItem1.setToolTipText("");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem11.setText("Produto");
        jMenuItem11.addActionListener(this::jMenuItem11ActionPerformed);
        jMenu1.add(jMenuItem11);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Serviços");
        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jMenuItem3.setText("Cliente");
        jMenuItem3.addActionListener(this::jMenuItem3ActionPerformed);
        jMenu2.add(jMenuItem3);

        jMenuItem12.setText("Produto");
        jMenuItem12.addActionListener(this::jMenuItem12ActionPerformed);
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Serviço");
        jMenuItem13.addActionListener(this::jMenuItem13ActionPerformed);
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");

        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(this::jMenuItem4ActionPerformed);
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Produtos");
        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator1);

        jMenuItem6.setText("Serviços");
        jMenuItem6.addActionListener(this::jMenuItem6ActionPerformed);
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Utilitário");

        jMenuItem7.setText("Agenda");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Calculadora");
        jMenu4.add(jMenuItem8);
        jMenu4.add(jSeparator2);

        jMenuItem9.setText("Bloco de Notas");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sobre");

        jMenuItem10.setText("Informações sobre o Sistema");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Janela");

        jMenuItem14.setText("Lado a Lado Verticalmente");
        jMenuItem14.addActionListener(this::jMenuItem14ActionPerformed);
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Em Grade");
        jMenuItem15.addActionListener(this::jMenuItem15ActionPerformed);
        jMenu7.add(jMenuItem15);

        jMenuItem18.setText("Em Cascata");
        jMenuItem18.addActionListener(this::jMenuItem18ActionPerformed);
        jMenu7.add(jMenuItem18);

        jMenuItem16.setText("Minimizar Todas");
        jMenuItem16.addActionListener(this::jMenuItem16ActionPerformed);
        jMenu7.add(jMenuItem16);
        jMenu7.add(jSeparator3);

        jMenuItem17.setText("Fechar Todas");
        jMenuItem17.addActionListener(this::jMenuItem17ActionPerformed);
        jMenu7.add(jMenuItem17);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPrincipal)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       TelaCliente tela = new TelaCliente();

        desktopPrincipal.add(tela);

        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1KeyPressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RelCli relcli = new RelCli();

        desktopPrincipal.add(relcli);

        relcli.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        telaLogin telalogin = new telaLogin();
        setVisible(false);
        telalogin.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        try {
    for (JInternalFrame frame : desktopPrincipal.getAllFrames()) {
        frame.setIcon(true);
    }
} catch (PropertyVetoException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        JInternalFrame[] frames = desktopPrincipal.getAllFrames();

    if (frames.length == 0) {
        return;
    }

    int larguraDesktop = desktopPrincipal.getWidth();
    int alturaDesktop = desktopPrincipal.getHeight();

    int larguraFrame = larguraDesktop / frames.length;

    for (int i = 0; i < frames.length; i++) {

        try {
            frames[i].setIcon(false); // restaura se estiver minimizada
            frames[i].setMaximum(false); // remove maximização
        } catch (Exception e) {
        }

        frames[i].setBounds(
            i * larguraFrame,  // posição X
            0,                 // posição Y
            larguraFrame,      // largura
            alturaDesktop      // altura
        );
    }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
         JInternalFrame[] frames = desktopPrincipal.getAllFrames();

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
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
           JInternalFrame[] frames = desktopPrincipal.getAllFrames();

    if (frames.length == 0) {
        return;
    }

    int cols = (int) Math.ceil(Math.sqrt(frames.length));
    int rows = (int) Math.ceil((double) frames.length / cols);

    int largura = desktopPrincipal.getWidth() / cols;
    int altura = desktopPrincipal.getHeight() / rows;

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
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
         JInternalFrame[] frames = desktopPrincipal.getAllFrames();

    for (JInternalFrame frame : frames) {
        frame.dispose();
    }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
         CadProsuto telaprod = new CadProsuto();

        desktopPrincipal.add(telaprod);

        telaprod.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadServico cadservico = new CadServico();

        desktopPrincipal.add(cadservico);

        cadservico.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConCli concli = new ConCli();

        desktopPrincipal.add(concli);

        concli.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Conprod conprod = new Conprod();

        desktopPrincipal.add(conprod);

        conprod.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Conservico conservico = new Conservico();

        desktopPrincipal.add(conservico);

        conservico.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        RelProd relprod = new RelProd();

        desktopPrincipal.add(relprod);

        relprod.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RelServico relservico = new RelServico();

        desktopPrincipal.add(relservico);

        relservico.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Produto;
    private javax.swing.JMenuItem Produto1;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
