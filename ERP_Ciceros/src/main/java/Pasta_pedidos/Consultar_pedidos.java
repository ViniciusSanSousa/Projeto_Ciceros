/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pasta_pedidos;

import Pasta_estoque.estoque_DTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeff & Carla
 */
public class Consultar_pedidos extends javax.swing.JFrame {
    
    /**
     * Creates new form Consultar_pedidos
     */
    public Consultar_pedidos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta_Pedido = new javax.swing.JTable();
        txt_filtro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDescricao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        rbtn_telefone = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblConsulta_Pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Data do Pedido", "Nome", "Telefone"
            }
        ));
        tblConsulta_Pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pesquisa_Automatica(evt);
            }
        });
        jScrollPane1.setViewportView(tblConsulta_Pedido);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 280, 270));
        getContentPane().add(txt_filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR PEDIDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, -1));

        btn_consultar.setBackground(new java.awt.Color(233, 180, 101));
        btn_consultar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar.setText("CONSULTAR");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, 30));

        txtAreaDescricao.setColumns(20);
        txtAreaDescricao.setRows(5);
        jScrollPane2.setViewportView(txtAreaDescricao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 250, 270));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESCRIÇÃO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 88, 30));

        rbtn_telefone.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_telefone.setText("Consultar por Telefone");
        getContentPane().add(rbtn_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        pedidos_DTO objDTO = new pedidos_DTO();
        pedidos_DAO objDAO = new pedidos_DAO();
        String filtro;
        boolean telefone_Checkd=false;
        ArrayList<pedidos_DTO> estDTO = new ArrayList<pedidos_DTO>();
        
        filtro = txt_filtro.getText();
        
        telefone_Checkd= rbtn_telefone.isSelected();
        
        DefaultTableModel model = (DefaultTableModel)tblConsulta_Pedido.getModel();
        model.setNumRows(0);
        if(telefone_Checkd == false){
            estDTO = objDAO.Consulta_por_Data(filtro);
        }
        else if(telefone_Checkd == true){
            estDTO = objDAO.Consulta_por_Tel(filtro);
        }
        
                
        for (int num = 0; num<estDTO.size();num++) {
            model.addRow(new Object[]{
            estDTO.get(num).getIdPedidos(),
            estDTO.get(num).getData(),
            estDTO.get(num).getNome(),
            estDTO.get(num).getTelefone()
            });
  
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void Pesquisa_Automatica(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pesquisa_Automatica
        // AQUI É PARA PESQUISAR AUTOMATICO
        pedidos_DTO objDTO = new pedidos_DTO();
        pedidos_DAO objDAO = new pedidos_DAO();
        
        String pegar_id_tabela, pegar_preco_tabela;
        
        int linha_clicada_tabela;
        
        linha_clicada_tabela = tblConsulta_Pedido.getSelectedRow();
        pegar_id_tabela = (tblConsulta_Pedido.getModel().getValueAt(linha_clicada_tabela, 0).toString());
        
        objDTO = objDAO.Consulta_por_ID(Integer.parseInt(pegar_id_tabela));
        
        txtAreaDescricao.setText(objDTO.getCampoObservacao());
    }//GEN-LAST:event_Pesquisa_Automatica

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
            java.util.logging.Logger.getLogger(Consultar_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtn_telefone;
    private javax.swing.JTable tblConsulta_Pedido;
    private javax.swing.JTextArea txtAreaDescricao;
    private javax.swing.JTextField txt_filtro;
    // End of variables declaration//GEN-END:variables
}
