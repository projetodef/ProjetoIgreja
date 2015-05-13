/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

/**
 *
 * @author Thiago
 */
public class TelaMensagens extends javax.swing.JFrame {

    /**
     * Creates new form TelaMensagens
     */
    public TelaMensagens() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuAdicionar = new javax.swing.JMenu();
        menuInicioFinanceiro = new javax.swing.JMenuItem();
        menuFinanceiroTransacao = new javax.swing.JMenuItem();
        menuuAdiconar = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenuItem();
        menuEmail = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuInicioCadastro = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Não há mensagens por enquanto.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Mensagens");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Avisaremos quando houver uma nova mensagem para você!");

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 0));

        menuInicio.setText("Inicio");
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuInicio);

        menuAdicionar.setText("Financeiro");
        menuAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdicionarActionPerformed(evt);
            }
        });

        menuInicioFinanceiro.setText("Inicio");
        menuInicioFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioFinanceiroActionPerformed(evt);
            }
        });
        menuAdicionar.add(menuInicioFinanceiro);

        menuFinanceiroTransacao.setText("Transações");
        menuFinanceiroTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFinanceiroTransacaoActionPerformed(evt);
            }
        });
        menuAdicionar.add(menuFinanceiroTransacao);

        menuuAdiconar.setText("Adicionar");
        menuuAdiconar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuuAdiconarActionPerformed(evt);
            }
        });
        menuAdicionar.add(menuuAdiconar);

        menuRelatorios.setText("Relatorios");
        menuRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatoriosActionPerformed(evt);
            }
        });
        menuAdicionar.add(menuRelatorios);

        menuEmail.setText("E-mail");
        menuEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmailActionPerformed(evt);
            }
        });
        menuAdicionar.add(menuEmail);

        jMenuBar1.add(menuAdicionar);

        jMenu3.setText("Cadastro");

        menuInicioCadastro.setText("Inicio");
        menuInicioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioCadastroActionPerformed(evt);
            }
        });
        jMenu3.add(menuInicioCadastro);

        menuCadastro.setText("Cadastro");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });
        jMenu3.add(menuCadastro);

        menuConsulta.setText("Consulta");
        menuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(menuConsulta);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ajuda");

        jMenuItem1.setText("Contato: (83) 8780-4654");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(98, 98, 98)
                .addComponent(btOk)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("Não há mensagens por enquanto.\nAvisaremos quando houver uma nova mensagem para você!");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        Principal tPrincipal = new Principal();
        tPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed

    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuInicioFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioFinanceiroActionPerformed
        TelaInicialFinanceiro tiFinanceiro = new TelaInicialFinanceiro();
        tiFinanceiro.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInicioFinanceiroActionPerformed

    private void menuFinanceiroTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFinanceiroTransacaoActionPerformed
        TelaTransacao tTransacao = new TelaTransacao();
        tTransacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuFinanceiroTransacaoActionPerformed

    private void menuuAdiconarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuuAdiconarActionPerformed
        TelaAdicionar tAdicionar = new TelaAdicionar();
        tAdicionar.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuuAdiconarActionPerformed

    private void menuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatoriosActionPerformed
        TelaRelatorios tRelatorios = new TelaRelatorios();
        tRelatorios.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuRelatoriosActionPerformed

    private void menuEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmailActionPerformed
        TelaMensagens tMensagens = new TelaMensagens();
        tMensagens.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuEmailActionPerformed

    private void menuAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdicionarActionPerformed
        TelaAdicionar tAdicionar = new TelaAdicionar();
        tAdicionar.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAdicionarActionPerformed

    private void menuInicioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioCadastroActionPerformed
        TelaInicialCadastro tInicialCadastro = new TelaInicialCadastro();
        tInicialCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInicioCadastroActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        TelaCadastro tCadastro = new TelaCadastro();
        tCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaActionPerformed
        TelaConsulta tConsulta = new TelaConsulta();
        tConsulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuConsultaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
       TelaInicialFinanceiro tInicialFinanceiro = new TelaInicialFinanceiro();
       tInicialFinanceiro.setVisible(true);
       dispose();
    }//GEN-LAST:event_btOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMensagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAdicionar;
    private javax.swing.JMenuItem menuCadastro;
    private javax.swing.JMenuItem menuConsulta;
    private javax.swing.JMenuItem menuEmail;
    private javax.swing.JMenuItem menuFinanceiroTransacao;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuInicioCadastro;
    private javax.swing.JMenuItem menuInicioFinanceiro;
    private javax.swing.JMenuItem menuRelatorios;
    private javax.swing.JMenuItem menuuAdiconar;
    // End of variables declaration//GEN-END:variables
}
