package projeto_n05;

import javax.swing.JOptionPane;
import Objetos.obj_UsuarioSenha;

public class fr_ValidaSenha extends javax.swing.JFrame {

    
    obj_UsuarioSenha  local_UsuarioSenha = new obj_UsuarioSenha ();
    

    public fr_ValidaSenha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lb_Senha = new javax.swing.JLabel();
        tf_Senha = new javax.swing.JTextField();
        lb_SenhaConfirma = new javax.swing.JLabel();
        tf_SenhaConfirma = new javax.swing.JTextField();
        bt_Limpa = new javax.swing.JButton();
        bt_Consiste = new javax.swing.JButton();
        lb_Usuario = new javax.swing.JLabel();
        tf_Usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Validar Senha");

        lb_Senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Senha.setText("Senha:");

        lb_SenhaConfirma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_SenhaConfirma.setText("Confirmar Senha:");

        bt_Limpa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Limpa.setText("Limpa");
        bt_Limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimpaActionPerformed(evt);
            }
        });

        bt_Consiste.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Consiste.setText("Coniste");
        bt_Consiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsisteActionPerformed(evt);
            }
        });

        lb_Usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Usuario.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Limpa)
                        .addGap(42, 42, 42)
                        .addComponent(bt_Consiste))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_SenhaConfirma)
                            .addComponent(lb_Senha)
                            .addComponent(lb_Usuario))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Senha)
                            .addComponent(tf_SenhaConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tf_Usuario))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Usuario)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Senha)
                    .addComponent(tf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_SenhaConfirma)
                    .addComponent(tf_SenhaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpa)
                    .addComponent(bt_Consiste))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void bt_LimpaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limparCampos();
    }                                        

    private void bt_ConsisteActionPerformed(java.awt.event.ActionEvent evt) {                                            
     
        
        if (isCamposPreenchidos()) {
    
           local_UsuarioSenha.setUsuario(tf_Usuario.getText().trim().toUpperCase());
           local_UsuarioSenha.setSenha(tf_Senha.getText().trim());
                     
           
           if(local_UsuarioSenha.is_UsuarioValido()) {
           
              
               if(local_UsuarioSenha.is_SenhaValida(tf_SenhaConfirma.getText().trim())) {
                   
                   JOptionPane.showMessageDialog(rootPane,"OK!!!!!");
               } else {
                   JOptionPane.showMessageDialog(null, 
                                             "Senha Inválida. Regras: \n Começar com Letra e terminas com Número. \n Apenas Números e Letras e Caracteres Especiais= !,@,#,$,%,&,* e ?. \n Tamanho entre 8 e 12 caracteres \n Senha e Confirma Senha devem ser iguais.",
                                             "Erro Senha", 
                                             JOptionPane.ERROR_MESSAGE);
               }
               
               
           } else {
               JOptionPane.showMessageDialog(null, 
                                             "Usuario Inválido. \n Começar com Letra. \n Apenas Números e Letras. \n Tamanho entre 8 e 20 caracteres",
                                             "Erro Usuario", 
                                             JOptionPane.ERROR_MESSAGE);
           }
           
       } else {
           JOptionPane.showMessageDialog(null, "Preencha todos os campos","Erro Preenchimento", JOptionPane.ERROR_MESSAGE);
       }
        
        
        
    }                                           

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
            java.util.logging.Logger.getLogger(fr_ValidaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_ValidaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_ValidaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_ValidaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_ValidaSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_Consiste;
    private javax.swing.JButton bt_Limpa;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JLabel lb_SenhaConfirma;
    private javax.swing.JLabel lb_Usuario;
    private javax.swing.JTextField tf_Senha;
    private javax.swing.JTextField tf_SenhaConfirma;
    private javax.swing.JTextField tf_Usuario;
    // End of variables declaration                   


public void limparCampos() {
    tf_Usuario.setText(null);
    tf_Senha.setText(null);
    tf_SenhaConfirma.setText(null);
}
    

    
public boolean isCamposPreenchidos() {
    boolean saida = false;
    
    if((!tf_Senha.getText().trim().isEmpty())&&
       (!tf_SenhaConfirma.getText().trim().isEmpty())&&
       (!tf_Usuario.getText().trim().isEmpty())
      ) {
        saida = true;
    }
      
    return saida;
}

   



} ///////////////////////////////////final 
