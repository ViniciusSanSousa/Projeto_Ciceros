/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pasta_Login;

import Pasta_menu.menu_VIEW;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vsant
 */
public class login_VIEW extends javax.swing.JFrame {

    /**
     * Creates new form login_VIEW
     */
    public login_VIEW() {
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

        txt_usuario = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        btn_recuperar_senha = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 156, 98));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, -1));
        getContentPane().add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 210, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SENHA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUÁRIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        btn_sair.setBackground(new java.awt.Color(233, 180, 101));
        btn_sair.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair.setText("SAIR");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 170, 30));

        btn_recuperar_senha.setBackground(new java.awt.Color(233, 180, 101));
        btn_recuperar_senha.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_recuperar_senha.setForeground(new java.awt.Color(255, 255, 255));
        btn_recuperar_senha.setText("RECUPERAR SENHA");
        btn_recuperar_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperar_senhaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_recuperar_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 30));

        btn_login.setBackground(new java.awt.Color(233, 180, 101));
        btn_login.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("ENTRAR");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 170, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, -1));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_recuperar_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperar_senhaActionPerformed
            alterar_Login_VIEW telaAlterar = new alterar_Login_VIEW();
            telaAlterar.setLocationRelativeTo(null);
            telaAlterar.setVisible(true);
    }//GEN-LAST:event_btn_recuperar_senhaActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Logar();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_recuperar_senha;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
   
    private void Logar(){
        try {
            String usuario="", senha="";
        
                usuario_DTO objdto = new usuario_DTO();
                
                usuario = txt_usuario.getText();
                senha = new String(txt_senha.getPassword());

                objdto.getUsusario(usuario);
                objdto.getSenha(senha);
                
                usuario_DAO objusuarioDAO = new usuario_DAO();
                
                ResultSet rsusuariodao = objusuarioDAO.autenticacaoUsuario(objdto);
                
                if (rsusuariodao.next()) {
                    //chamar tela que quero abrir
                    menu_VIEW objtelamenu = new menu_VIEW();
                    objtelamenu.setLocationRelativeTo(null);
                    objtelamenu.setVisible(true);
                    
                    dispose();
                }
                else{
                    //mostrar mensagem de erro
                    JOptionPane.showMessageDialog(null, "Usuario ou senha esta errado.");
                }
        } 
        catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null,"Erro na tela login" + erro);
        } 
    }

}


