/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author silvabarberb
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senha = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        usuariotexto = new javax.swing.JTextField();
        ButtonEntrar = new javax.swing.JButton();
        senhatexto = new javax.swing.JPasswordField();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        senha.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        senha.setText("Senha");
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 80, -1));

        Login.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        Login.setText("Login");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 120, -1));

        usuario.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        usuario.setText("Usuario");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, -1));

        usuariotexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotextoActionPerformed(evt);
            }
        });
        getContentPane().add(usuariotexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 290, 40));

        ButtonEntrar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setActionCommand("ButtonEntrar");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 290, 50));

        senhatexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhatextoActionPerformed(evt);
            }
        });
        getContentPane().add(senhatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 290, 40));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/teladelogin.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        // executa quando clico no botao
        this.controller.entrarNoSistema();
        
        
    }//GEN-LAST:event_ButtonEntrarActionPerformed

    private void usuariotextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariotextoActionPerformed

    private void senhatextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhatextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhatextoActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senhatexto;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuariotexto;
    // End of variables declaration//GEN-END:variables

    public void exibirMensagem(String mensagem) {
    
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getSenhatexto() {
        return senhatexto;
    }

    public void setSenhatexto(JPasswordField senhatexto) {
        this.senhatexto = senhatexto;
    }

    public JTextField getUsuariotexto() {
        return usuariotexto;
    }

    

    
    
    
    
}
