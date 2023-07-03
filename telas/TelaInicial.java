/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author andre
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        super ("Tela inicial"); 
        initComponents();
        setLocationRelativeTo(null);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastro = new javax.swing.JButton();
        btnTelaLogin = new javax.swing.JButton();
        btnLoginAdm = new javax.swing.JButton();
        imgFundoInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastro.setText("Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 200, 40));

        btnTelaLogin.setText("Login");
        btnTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 200, 40));

        btnLoginAdm.setText("Entrar como adm");
        btnLoginAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 200, 40));

        imgFundoInicial.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1111056762582343700/Copia_de_Sem_nome_1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgFundoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdmActionPerformed
        TelaLoginAdm tla = new TelaLoginAdm();
        tla.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnLoginAdmActionPerformed

    private void btnTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaLoginActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTelaLoginActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro tc = new TelaCadastro();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLoginAdm;
    private javax.swing.JButton btnTelaLogin;
    private javax.swing.JLabel imgFundoInicial;
    // End of variables declaration//GEN-END:variables
}
