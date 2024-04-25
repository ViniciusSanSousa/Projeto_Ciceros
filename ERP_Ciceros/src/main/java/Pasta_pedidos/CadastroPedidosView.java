/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pasta_pedidos;

/**
 *
 * @author Jeff & Carla
 */
public class CadastroPedidosView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPedidosView
     */
    public CadastroPedidosView() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtAreadescricao = new java.awt.TextArea();
        idTabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtDescricao = new javax.swing.JLabel();
        BarraSeparadacima = new javax.swing.JSeparator();
        txtObservacao = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        btnSalvar = new java.awt.Button();
        btnPagamento = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEDIDOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 41, -1, -1));
        getContentPane().add(txtAreadescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 135, 230, 233));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Lanche", "Preço"
            }
        ));
        idTabela.setViewportView(tabela);

        getContentPane().add(idTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 135, 240, 508));

        txtDescricao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDescricao.setText("Descrição");
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 112, -1, -1));
        getContentPane().add(BarraSeparadacima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 617, 10));

        txtObservacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtObservacao.setText("Observação");
        getContentPane().add(txtObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 395, -1, -1));
        getContentPane().add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 423, 239, 221));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 622, -1, -1));

        lblValor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblValor.setText("Valor");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 596, -1, -1));

        btnSalvar.setLabel("Salvar");
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 654, -1, -1));

        btnPagamento.setLabel("Pagamento");
        getContentPane().add(btnPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 654, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Quantidade");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 135, -1, 16));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 157, 65, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/imagens/ImgOp2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPedidosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator BarraSeparadacima;
    private java.awt.Button btnPagamento;
    private java.awt.Button btnSalvar;
    private javax.swing.JScrollPane idTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tabela;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea txtAreadescricao;
    private javax.swing.JLabel txtDescricao;
    private java.awt.Label txtObservacao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
