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
public class TelaTransacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaTransações
     */
    public TelaTransacao() {
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btFiltros = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÊS");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("<<<");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText(">>>");

        jLabel2.setText("Previsão Para o mês:");

        jLabel3.setText("Saldo Atual");

        jLabel4.setText("R$ 3.000,00");

        jLabel5.setText("R$2.100,00");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dizimo", "20",  new Double(1500.0)},
                {"Oferta", "20",  new Double(500.0)},
                {"Dizimo", "24",  new Double(1000.0)},
                {"Aluguel - Fixo", "05",  new Double(500.0)},
                {"Limpeza - Variavel", "07", null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Onde / Quem", "Dia", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        btFiltros.setText("Filtros");
        btFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrosActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btFiltros))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(btOk)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addComponent(btFiltros))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btOk)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(532, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrosActionPerformed
       TelaFiltrosTransacao tfTranslacao = new TelaFiltrosTransacao();
       tfTranslacao.setVisible(true);
       dispose();
    }//GEN-LAST:event_btFiltrosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTransacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFiltros;
    private javax.swing.JButton btOk;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
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
