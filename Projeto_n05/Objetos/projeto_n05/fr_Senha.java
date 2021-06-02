
package projeto_n05;

import javax.swing.JOptionPane;


public class fr_Senha extends javax.swing.JFrame {

    private String Usuario;
    private String Senha;
   
    public fr_Senha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lb_Usuario = new javax.swing.JLabel();
        tf_Usuario = new javax.swing.JTextField();
        lb_Senha = new javax.swing.JLabel();
        tf_Senha = new javax.swing.JTextField();
        bt_Limpa = new javax.swing.JButton();
        bt_Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");

        lb_Usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Usuario.setText("Usuário:");

        lb_Senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Senha.setText("Senha:");

        bt_Limpa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Limpa.setText("Limpa");
        bt_Limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimpaActionPerformed(evt);
            }
        });

        bt_Entrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Entrar.setText("Entrar");
        bt_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_Senha)
                                .addGap(27, 27, 27)
                                .addComponent(tf_Senha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_Usuario)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(bt_Limpa)
                        .addGap(45, 45, 45)
                        .addComponent(bt_Entrar)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Usuario)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Senha)
                    .addComponent(tf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpa)
                    .addComponent(bt_Entrar))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void bt_LimpaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        LimpaCampos ();
    }                                        

    private void bt_EntrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
                
        if (isCamposPreenchidos ()) {
        
            Usuario = tf_Usuario.getText().trim().toUpperCase();
            Senha   = tf_Senha.getText().trim();
            
            if (isUsuarioValido()) {
               
                if(isSenhaValida()) {
                
                    fr_MenuPrincipal localMenu = new fr_MenuPrincipal ();
                    localMenu.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null,"Senha Inválida", "Erro Senha", JOptionPane.ERROR_MESSAGE);    
                }
                
            }
            else {
               JOptionPane.showMessageDialog(null,"Usuário Inválido", "Erro Usuario", JOptionPane.ERROR_MESSAGE);    
            }
            
        } else {
            JOptionPane.showMessageDialog(null,"Preencha todos os  Campos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        //ConsistirUsuario();
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
            java.util.logging.Logger.getLogger(fr_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Senha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_Entrar;
    private javax.swing.JButton bt_Limpa;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JLabel lb_Usuario;
    private javax.swing.JTextField tf_Senha;
    private javax.swing.JTextField tf_Usuario;
    // End of variables declaration                   



public void LimpaCampos () {
    
    tf_Senha.setText(null);
    tf_Usuario.setText(null);
}

public boolean isCamposPreenchidos () {
    boolean saida = false;

    if (!(tf_Usuario.getText().trim().isEmpty())&&
        !(tf_Usuario.getText().trim().isEmpty())
       ) {
            saida = true;
         }
    
    return saida;
        
}

public boolean isUsuarioValido() {
    boolean saida = false;
    
    if ((Usuario.equals("ADM"))||(Usuario.equals("FULANO"))) {
        saida = true;
    }
    
    return saida;
}

// 8 a 12 Caracteres  Começa Letra  possui nrs  tem caracere especial  terminar com letra
public boolean isSenhaValida() {
    
    boolean saida = false;
    
    if((Usuario.equals("ADM")&&(Senha.equals("A0909##0")))||
       (Usuario.equals("FULANO")&&(Senha.equals("f2020??9"))) ) {
        saida = true;
    }
    
    return saida;
}

}///// fim do mundo !!! /////////////////////////////////////

