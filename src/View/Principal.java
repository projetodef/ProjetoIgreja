package View;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaInicialFinanceiro1 = new View.TelaInicialFinanceiro();
        btFinanceiro = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DEF Sistemas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btFinanceiro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Dropbox\\PROJETO\\Imagens que vão ser usadas no projeto (Não apagar nenhuma)\\Botoes\\btTransações.jpg")); // NOI18N
        btFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinanceiroActionPerformed(evt);
            }
        });

        btCadastro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Dropbox\\PROJETO\\Imagens que vão ser usadas no projeto (Não apagar nenhuma)\\Botoes\\btCadastro.jpg")); // NOI18N
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Financeiro");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro/Consulta");

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

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinanceiroActionPerformed
        TelaInicialFinanceiro tiFinanceiro = new TelaInicialFinanceiro();
        tiFinanceiro.setVisible(true);
                
    }//GEN-LAST:event_btFinanceiroActionPerformed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        TelaInicialCadastro tiCadastro = new TelaInicialCadastro();
        tiCadastro.setVisible(true);
              
    }//GEN-LAST:event_btCadastroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaActionPerformed
        TelaConsulta tConsulta = new TelaConsulta();
        tConsulta.setVisible(true);
       
    }//GEN-LAST:event_menuConsultaActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        TelaCadastro tCadastro = new TelaCadastro();
        tCadastro.setVisible(true);
        
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuInicioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioCadastroActionPerformed
        TelaInicialCadastro tInicialCadastro = new TelaInicialCadastro();
        tInicialCadastro.setVisible(true);
        
    }//GEN-LAST:event_menuInicioCadastroActionPerformed

    private void menuAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdicionarActionPerformed
        TelaAdicionar tAdicionar = new TelaAdicionar();
        tAdicionar.setVisible(true);
        
    }//GEN-LAST:event_menuAdicionarActionPerformed

    private void menuEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmailActionPerformed
        TelaMensagens tMensagens = new TelaMensagens();
        tMensagens.setVisible(true);
        
    }//GEN-LAST:event_menuEmailActionPerformed

    private void menuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatoriosActionPerformed
        TelaRelatorios tRelatorios = new TelaRelatorios();
        tRelatorios.setVisible(true);
        
    }//GEN-LAST:event_menuRelatoriosActionPerformed

    private void menuuAdiconarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuuAdiconarActionPerformed
        TelaAdicionar tAdicionar = new TelaAdicionar();
        tAdicionar.setVisible(true);
       
    }//GEN-LAST:event_menuuAdiconarActionPerformed

    private void menuFinanceiroTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFinanceiroTransacaoActionPerformed
        TelaTransacao tTransacao = new TelaTransacao();
        tTransacao.setVisible(true);
        
    }//GEN-LAST:event_menuFinanceiroTransacaoActionPerformed

    private void menuInicioFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioFinanceiroActionPerformed
        TelaInicialFinanceiro tiFinanceiro = new TelaInicialFinanceiro();
        tiFinanceiro.setVisible(true);
       
    }//GEN-LAST:event_menuInicioFinanceiroActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed

    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        Principal tPrincipal = new Principal();
        tPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btFinanceiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuuAdiconar;
    private View.TelaInicialFinanceiro telaInicialFinanceiro1;
    // End of variables declaration//GEN-END:variables
}
