package projeto_n05;

import javax.swing.JOptionPane;
import Objetos.obj_UsuarioSenha_Sup;

public class fr_ValidaSenha_sup extends javax.swing.JFrame {

    
    obj_UsuarioSenha_Sup  local_UsuarioSenha_Sup = new obj_UsuarioSenha_Sup ();
    
     
    public fr_ValidaSenha_sup() {
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
        lb_ContraSenhaConfirma = new javax.swing.JLabel();
        tf_CSenhaConfirma = new javax.swing.JTextField();
        lb_ContraSenha = new javax.swing.JLabel();
        tf_CSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Validar Senha Suporte");

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

        lb_ContraSenhaConfirma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_ContraSenhaConfirma.setText("Confirmar Contra Senha:");

        lb_ContraSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_ContraSenha.setText("Contra Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(bt_Limpa)
                        .addGap(42, 42, 42)
                        .addComponent(bt_Consiste))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_ContraSenhaConfirma)
                            .addComponent(lb_ContraSenha)
                            .addComponent(lb_SenhaConfirma)
                            .addComponent(lb_Senha)
                            .addComponent(lb_Usuario))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_CSenha)
                            .addComponent(tf_SenhaConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tf_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tf_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tf_CSenhaConfirma))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ContraSenha)
                    .addComponent(tf_CSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ContraSenhaConfirma)
                    .addComponent(tf_CSenhaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpa)
                    .addComponent(bt_Consiste))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void bt_LimpaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limparCampos();
    }                                        

    private void bt_ConsisteActionPerformed(java.awt.event.ActionEvent evt) {                                            
     
        
        if (isCamposPreenchidos()) {
    
           local_UsuarioSenha_Sup.setUsuario(tf_Usuario.getText().trim().toUpperCase());
           local_UsuarioSenha_Sup.setSenha(tf_Senha.getText().trim());
           local_UsuarioSenha_Sup.setContraSenha(tf_CSenha.getText().trim());
                     
           
           if(local_UsuarioSenha_Sup.is_UsuarioValido()) {
           
              
               if(local_UsuarioSenha_Sup.is_SenhaValida(tf_SenhaConfirma.getText().trim())) {
                   
                   if(local_UsuarioSenha_Sup.is_CSenhaValida(tf_CSenhaConfirma.getText().trim())) {
                       
                       JOptionPane.showMessageDialog(null, "OK!!!");
                       
                   } else {
                          
                       JOptionPane.showMessageDialog(null, 
                                                       "Contra Senha Inválida. Regras: \n Começar com '_' e terminas com Número. \n Apenas Números e Letras e Caracteres Especiais= !,@,#,$,%,&,* e ?. \n Tamanho entre 10 e 15 caracteres \n Contra Senha e Confirma Contra Senha devem ser iguais.",
                                                       "Erro Contra Senha", 
                                                       JOptionPane.ERROR_MESSAGE);
             
                   }
             
                   
               } else {
                   JOptionPane.showMessageDialog(null, 
                                             "Senha Inválida. Regras: \n Começar com _ e terminas com Número. \n Apenas Números e Letras e Caracteres Especiais= !,@,#,$,%,&,* e ?. \n Tamanho entre 10 e 15 caracteres \n Senha e Confirma Senha devem ser iguais.",
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
            java.util.logging.Logger.getLogger(fr_ValidaSenha_sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_ValidaSenha_sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_ValidaSenha_sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_ValidaSenha_sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_ValidaSenha_sup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_Consiste;
    private javax.swing.JButton bt_Limpa;
    private javax.swing.JLabel lb_ContraSenha;
    private javax.swing.JLabel lb_ContraSenhaConfirma;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JLabel lb_SenhaConfirma;
    private javax.swing.JLabel lb_Usuario;
    private javax.swing.JTextField tf_CSenha;
    private javax.swing.JTextField tf_CSenhaConfirma;
    private javax.swing.JTextField tf_Senha;
    private javax.swing.JTextField tf_SenhaConfirma;
    private javax.swing.JTextField tf_Usuario;
    // End of variables declaration                   


public void limparCampos() {
    tf_Usuario.setText(null);
    tf_Senha.setText(null);
    tf_SenhaConfirma.setText(null);
    tf_CSenha.setText(null);
    tf_CSenhaConfirma.setText(null);
}
    

    
public boolean isCamposPreenchidos() {
    boolean saida = false;
    
    if((!tf_Senha.getText().trim().isEmpty())&&
       (!tf_SenhaConfirma.getText().trim().isEmpty())&&
       (!tf_CSenha.getText().trim().isEmpty())&&
       (!tf_CSenhaConfirma.getText().trim().isEmpty())&&
       (!tf_Usuario.getText().trim().isEmpty())
      ) {
        saida = true;
    }
      
    return saida;
}

   



} ///////////////////////////////////final 
