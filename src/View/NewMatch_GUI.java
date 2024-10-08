/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Match;
import Model.Referee;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sapat
 */
public class NewMatch_GUI extends javax.swing.JFrame {

    /**
     * Creates new form SetUp_GUI
     */
    public NewMatch_GUI() {
        initComponents();
        refereesList_cbx.removeAllItems();
        String [] refereesNamesAndIdentifiers = main.Main.refereeManager.getRefereesNamesAndIdentifier();
        for (String nameAndIdentifier : refereesNamesAndIdentifiers) {
            refereesList_cbx.addItem(nameAndIdentifier);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        location_lbl = new javax.swing.JLabel();
        guest_lbl = new javax.swing.JLabel();
        home_txt = new javax.swing.JTextField();
        home_lbl = new javax.swing.JLabel();
        guest_txt = new javax.swing.JTextField();
        location_txt = new javax.swing.JTextField();
        refereesList_cbx = new javax.swing.JComboBox();
        whichReferee_lbl = new javax.swing.JLabel();
        send_btn = new javax.swing.JButton();
        NewMatchBG_lbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mainMenuMenu_btn = new javax.swing.JMenu();
        mainMenu_btn = new javax.swing.JMenuItem();
        toolsMenu_btn = new javax.swing.JMenu();
        notePad_btn = new javax.swing.JMenuItem();
        referees_btn = new javax.swing.JMenu();
        addReferee_btn = new javax.swing.JMenuItem();
        ReadUpdateDeleteReferee_btn = new javax.swing.JMenuItem();
        matches_btn = new javax.swing.JMenu();
        addMatch_btn = new javax.swing.JMenuItem();
        ReadUpdateDeleteMatch_btn = new javax.swing.JMenuItem();
        logoutMenu_btn = new javax.swing.JMenu();
        logout_btn = new javax.swing.JMenuItem();
        exitMenu_btn = new javax.swing.JMenu();
        exit_btn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        location_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        location_lbl.setForeground(new java.awt.Color(255, 255, 255));
        location_lbl.setText("Localizacao:");
        jPanel1.add(location_lbl);
        location_lbl.setBounds(190, 210, 190, 30);

        guest_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guest_lbl.setForeground(new java.awt.Color(255, 255, 255));
        guest_lbl.setText("Time Visitante:");
        jPanel1.add(guest_lbl);
        guest_lbl.setBounds(30, 140, 190, 30);

        home_txt.setText("Time Mandante");
        jPanel1.add(home_txt);
        home_txt.setBounds(30, 100, 440, 30);

        home_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_lbl.setForeground(new java.awt.Color(255, 255, 255));
        home_lbl.setText("Time Mandante:");
        jPanel1.add(home_lbl);
        home_lbl.setBounds(30, 70, 190, 30);

        guest_txt.setText("Time Visitante");
        jPanel1.add(guest_txt);
        guest_txt.setBounds(30, 170, 440, 30);

        location_txt.setText("Localizacao");
        location_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location_txtActionPerformed(evt);
            }
        });
        jPanel1.add(location_txt);
        location_txt.setBounds(190, 240, 280, 30);

        refereesList_cbx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refereesList_cbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2" }));
        refereesList_cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refereesList_cbxActionPerformed(evt);
            }
        });
        jPanel1.add(refereesList_cbx);
        refereesList_cbx.setBounds(190, 310, 280, 30);

        whichReferee_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        whichReferee_lbl.setForeground(new java.awt.Color(255, 255, 255));
        whichReferee_lbl.setText("Arbitro:");
        jPanel1.add(whichReferee_lbl);
        whichReferee_lbl.setBounds(190, 280, 130, 30);

        send_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        send_btn.setText("ENVIAR");
        send_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_btnActionPerformed(evt);
            }
        });
        jPanel1.add(send_btn);
        send_btn.setBounds(270, 370, 150, 50);

        NewMatchBG_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AddNewMatch.png"))); // NOI18N
        jPanel1.add(NewMatchBG_lbl);
        NewMatchBG_lbl.setBounds(0, 0, 500, 480);

        mainMenuMenu_btn.setText("Menu");

        mainMenu_btn.setText("Voltar ao Menu Principal");
        mainMenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu_btnActionPerformed(evt);
            }
        });
        mainMenuMenu_btn.add(mainMenu_btn);

        jMenuBar1.add(mainMenuMenu_btn);

        toolsMenu_btn.setText("Ferramentas");

        notePad_btn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        notePad_btn.setText("Bloco de notas");
        notePad_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notePad_btnActionPerformed(evt);
            }
        });
        toolsMenu_btn.add(notePad_btn);

        jMenuBar1.add(toolsMenu_btn);

        referees_btn.setText("Arbitros");

        addReferee_btn.setText("Cadstrar");
        addReferee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReferee_btnActionPerformed(evt);
            }
        });
        referees_btn.add(addReferee_btn);

        ReadUpdateDeleteReferee_btn.setText("Consultar/Alterar/Excluir");
        ReadUpdateDeleteReferee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadUpdateDeleteReferee_btnActionPerformed(evt);
            }
        });
        referees_btn.add(ReadUpdateDeleteReferee_btn);

        jMenuBar1.add(referees_btn);

        matches_btn.setText("Partidas");

        addMatch_btn.setText("Adicionar Nova Partida");
        addMatch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMatch_btnActionPerformed(evt);
            }
        });
        matches_btn.add(addMatch_btn);

        ReadUpdateDeleteMatch_btn.setText("Consultar/Alterar/Excluir");
        ReadUpdateDeleteMatch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadUpdateDeleteMatch_btnActionPerformed(evt);
            }
        });
        matches_btn.add(ReadUpdateDeleteMatch_btn);

        jMenuBar1.add(matches_btn);

        logoutMenu_btn.setText("Logout");
        logoutMenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenu_btnActionPerformed(evt);
            }
        });

        logout_btn.setText("Realizar Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        logoutMenu_btn.add(logout_btn);

        jMenuBar1.add(logoutMenu_btn);

        exitMenu_btn.setText("Sair");
        exitMenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenu_btnActionPerformed(evt);
            }
        });

        exit_btn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        exit_btn.setText("Fechar");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        exitMenu_btn.add(exit_btn);

        jMenuBar1.add(exitMenu_btn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void notePad_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notePad_btnActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /c start notepad.exe");
        } catch (IOException ex) {
            Logger.getLogger(MainMenu_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_notePad_btnActionPerformed

    private void addReferee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReferee_btnActionPerformed
        Model.Funcs_DAO.changeScreen(this, new NewReferee_GUI());
    }//GEN-LAST:event_addReferee_btnActionPerformed

    private void ReadUpdateDeleteReferee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadUpdateDeleteReferee_btnActionPerformed
        Model.Funcs_DAO.changeScreen(this, new ReadUpdateDeleteReferee_GUI());
    }//GEN-LAST:event_ReadUpdateDeleteReferee_btnActionPerformed

    private void addMatch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMatch_btnActionPerformed

    }//GEN-LAST:event_addMatch_btnActionPerformed

    private void ReadUpdateDeleteMatch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadUpdateDeleteMatch_btnActionPerformed
        Model.Funcs_DAO.changeScreen(this, new ReadUpdateDeleteMatch_GUI());
    }//GEN-LAST:event_ReadUpdateDeleteMatch_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        if (main.Main.manager.logout()) {
            JOptionPane.showMessageDialog(null, "LOGOUT REALIZADO COM SUCESSO!");
            Model.Funcs_DAO.changeScreen(this, new SetUp_GUI());
        } else {
            JOptionPane.showMessageDialog(null, "IMPOSSIVEL FAZER O LOGOUT!");
        }
    }//GEN-LAST:event_logout_btnActionPerformed

    private void logoutMenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenu_btnActionPerformed

    }//GEN-LAST:event_logoutMenu_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        Model.Funcs_DAO.exit();
    }//GEN-LAST:event_exit_btnActionPerformed

    private void exitMenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenu_btnActionPerformed

    }//GEN-LAST:event_exitMenu_btnActionPerformed

    private void mainMenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu_btnActionPerformed
        Model.Funcs_DAO.changeScreen(this, new MainMenu_GUI());
    }//GEN-LAST:event_mainMenu_btnActionPerformed

    private void refereesList_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refereesList_cbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refereesList_cbxActionPerformed

    private void send_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_btnActionPerformed
        try {
            String selectedReferee = (String) refereesList_cbx.getSelectedItem();
            String refereesCpf = Model.Funcs_DAO.extractIdentifier(selectedReferee);
            Referee referee = main.Main.refereeManager.getReferee(refereesCpf);
            referee.addNewMatch(new Match(location_txt.getText(), home_txt.getText(), guest_txt.getText()));
            JOptionPane.showMessageDialog(null, "PARTIDA CADASTRADA COM SUCESSO!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCORREU UM ERRO AO CADASTRAR PARTIDA!\nOcorreu um erro ao cadastrar partida, revise as informacoes!\nCodigo do erro: " + e);
        }
        
    }//GEN-LAST:event_send_btnActionPerformed

    private void location_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_location_txtActionPerformed

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
            java.util.logging.Logger.getLogger(NewMatch_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMatch_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMatch_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMatch_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMatch_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NewMatchBG_lbl;
    private javax.swing.JMenuItem ReadUpdateDeleteMatch_btn;
    private javax.swing.JMenuItem ReadUpdateDeleteReferee_btn;
    private javax.swing.JMenuItem addMatch_btn;
    private javax.swing.JMenuItem addReferee_btn;
    private javax.swing.JMenu exitMenu_btn;
    private javax.swing.JMenuItem exit_btn;
    private javax.swing.JLabel guest_lbl;
    private javax.swing.JTextField guest_txt;
    private javax.swing.JLabel home_lbl;
    private javax.swing.JTextField home_txt;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location_lbl;
    private javax.swing.JTextField location_txt;
    private javax.swing.JMenu logoutMenu_btn;
    private javax.swing.JMenuItem logout_btn;
    private javax.swing.JMenu mainMenuMenu_btn;
    private javax.swing.JMenuItem mainMenu_btn;
    private javax.swing.JMenu matches_btn;
    private javax.swing.JMenuItem notePad_btn;
    public static javax.swing.JComboBox refereesList_cbx;
    private javax.swing.JMenu referees_btn;
    public static javax.swing.JButton send_btn;
    private javax.swing.JMenu toolsMenu_btn;
    private javax.swing.JLabel whichReferee_lbl;
    // End of variables declaration//GEN-END:variables
}
