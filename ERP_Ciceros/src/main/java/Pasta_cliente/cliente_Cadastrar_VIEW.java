/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pasta_cliente;

import Pasta_Login.usuario_DTO;
import Pasta_pedidos.CadastroPedidosView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vsant
 */
public class cliente_Cadastrar_VIEW extends javax.swing.JFrame {
    cliente_DTO objDTO = new cliente_DTO();
    cliente_DTO objDTO_Tela_Pedidos = new cliente_DTO();
    String nome_cliente,id_cliente;
    /**
     * Creates new form cliente_Cadastrar
     */
    public cliente_Cadastrar_VIEW() {
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
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCliNome = new javax.swing.JTextField();
        txtCliEndereco = new javax.swing.JTextField();
        txtCliFone = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtCliPesquisar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_pesquisar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        txtCliId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_pedido = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("NOME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("ENDEREÇO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("TELEFONE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CLIENTES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1280, -1));
        getContentPane().add(txtCliNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 353, -1));
        getContentPane().add(txtCliEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 480, -1));
        getContentPane().add(txtCliFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, -1));

        btn_salvar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, -1));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Endereço"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Evento_clicar(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 222, 1150, 360));
        getContentPane().add(txtCliPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 151, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("TELEFONE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        btn_pesquisar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_pesquisar.setText("PESQUISAR");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        btn_alterar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_alterar.setText("ALTERAR");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        btn_excluir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_excluir.setText("EXCLUIR");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        txtCliId.setEditable(false);
        txtCliId.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtCliId.setEnabled(false);
        txtCliId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtCliId, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 90, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 714, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 714, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setText("ID CLIENTE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        btn_pedido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_pedido.setText("PEDIDO");
        btn_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        cliente_DTO objDTO = new cliente_DTO();
        cliente_DAO objDAO = new cliente_DAO();
        String nome, endereco, telefone;
        
        nome = txtCliNome.getText();
        endereco = txtCliEndereco.getText();
        telefone = txtCliFone.getText();
        
        objDTO.setNome(nome);
        objDTO.setEndereco(endereco);
        objDTO.setTelefone(telefone);
        
        objDAO.adicionar(objDTO);
        Limpar_Campos();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
            Pesquisar();
            Limpar_Campos();
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
           cliente_DAO objDAO = new cliente_DAO();
           String nome,endereco, telefone;
           int ID;
           
           objDTO.setChave_Primaria(Integer.parseInt(txtCliId.getText()));
           objDTO.setNome(txtCliNome.getText());
           objDTO.setTelefone(txtCliFone.getText());
           objDTO.setEndereco(txtCliEndereco.getText());
           
           objDAO.Alterar(objDTO);
           Limpar_Campos();
           
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void Evento_clicar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Evento_clicar
       String Pegar_ID_da_Tabela, Pegar_Nome_da_Tabela, Pegar_Telefone_da_Tabela, Pegar_Endereco_da_Tabela;
       int Linha_Clicada_Tabela,ID_Convertido_Int;
       
       Linha_Clicada_Tabela = tblClientes.getSelectedRow();
       
       Pegar_ID_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 0).toString());
       Pegar_Nome_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 1).toString());
       Pegar_Telefone_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 2).toString());
       Pegar_Endereco_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 3).toString());
       
       txtCliId.setText(Pegar_ID_da_Tabela);
       txtCliNome.setText(Pegar_Nome_da_Tabela);
       txtCliFone.setText(Pegar_Telefone_da_Tabela);
       txtCliEndereco.setText(Pegar_Endereco_da_Tabela);
       
       id_cliente=Pegar_ID_da_Tabela;
       nome_cliente=Pegar_Nome_da_Tabela;
       
       objDTO_Tela_Pedidos.setChave_Primaria(Integer.parseInt(id_cliente));
       objDTO_Tela_Pedidos.setNome(nome_cliente);
    }//GEN-LAST:event_Evento_clicar

    private void txtCliIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliIdActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        cliente_DAO objDAO = new cliente_DAO();
        int ID;
        
        ID = Integer.parseInt(txtCliId.getText());
        
        if(ID != 0){
            objDAO.Excluir(ID);
            Limpar_Campos();
            Pesquisar();
        }
        
        
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidoActionPerformed
            
        CadastroPedidosView telaCadastroPedido = new CadastroPedidosView();
        telaCadastroPedido.setLocationRelativeTo(null);
        telaCadastroPedido.setVisible(true);
     
        telaCadastroPedido.exportarDados_Cliente(objDTO_Tela_Pedidos);
    }//GEN-LAST:event_btn_pedidoActionPerformed

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
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente_Cadastrar_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pedido;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCliEndereco;
    private javax.swing.JTextField txtCliFone;
    private javax.swing.JTextField txtCliId;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JTextField txtCliPesquisar;
    // End of variables declaration//GEN-END:variables
    
    public void Limpar_Campos(){
        txtCliId.setText(null);
        txtCliNome.setText(null);
        txtCliEndereco.setText(null);
        txtCliFone.setText(null);
        
    
    }
    
    public void Pesquisar(){
        cliente_DTO objDTO = new cliente_DTO();
        cliente_DAO objDAO = new cliente_DAO();
        String filtro;
        
        filtro = txtCliPesquisar.getText();
        
        DefaultTableModel model = (DefaultTableModel)tblClientes.getModel();
        model.setNumRows(0);
        ArrayList<cliente_DTO> lista_DTO = objDAO.consultar(filtro);
        
         for (int num = 0; num < lista_DTO.size(); num++) {
                model.addRow(new Object[]{
                lista_DTO.get(num).getChave_Primaria(),
                lista_DTO.get(num).getNome(),
                lista_DTO.get(num).getTelefone(),
                lista_DTO.get(num).getEndereco()
                });

            }
    
    }

}

