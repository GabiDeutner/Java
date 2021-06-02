
package projeto_n05;

import javax.swing.JOptionPane;
import Objetos.obj_AlunoIntercambio;

public class fr_TelaCadastro_Intercambio extends javax.swing.JFrame {

    obj_AlunoIntercambio  local_AlunoInt = new obj_AlunoIntercambio();
    
    
    public fr_TelaCadastro_Intercambio() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lb_Nome = new javax.swing.JLabel();
        lb_Email = new javax.swing.JLabel();
        lb_Idade = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        tf_Email = new javax.swing.JTextField();
        tf_Idade = new javax.swing.JTextField();
        bt_Limpar = new javax.swing.JButton();
        ckb_Matutino = new javax.swing.JCheckBox();
        ckb_Noturno = new javax.swing.JCheckBox();
        lb_Turno = new javax.swing.JLabel();
        cb_Curso = new javax.swing.JComboBox<>();
        lb_Curso = new javax.swing.JLabel();
        bt_Consiste = new javax.swing.JButton();
        lb_PaísOrigem = new javax.swing.JLabel();
        lb_InstituicaoOrigem = new javax.swing.JLabel();
        tf_InstituicaoOrigem = new javax.swing.JTextField();
        cb_PaisOrigem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Aluno Intercambio");

        lb_Nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Nome.setText("Nome:");

        lb_Email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Email.setText("Email:");

        lb_Idade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Idade.setText("Idade:");

        bt_Limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Limpar.setText("LimparCampos");
        bt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimparActionPerformed(evt);
            }
        });

        ckb_Matutino.setText("Matutino");
        ckb_Matutino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_MatutinoActionPerformed(evt);
            }
        });

        ckb_Noturno.setText("Noturno");
        ckb_Noturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_NoturnoActionPerformed(evt);
            }
        });

        lb_Turno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Turno.setText("Turno:");

        cb_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automação Industrial", "Informática para Negócios", "Manufatura Avançada" }));

        lb_Curso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Curso.setText("Curso:");

        bt_Consiste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Consiste.setText("Consiste");
        bt_Consiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsisteActionPerformed(evt);
            }
        });

        lb_PaísOrigem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_PaísOrigem.setText("País Origem:");

        lb_InstituicaoOrigem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_InstituicaoOrigem.setText("Instituição Origem:");

        cb_PaisOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Austrália", "Argentina", "Canadá", "Chile", "Espanha", "França", "Japão", "Inglaterra", "Itália" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_Idade)
                            .addComponent(lb_Turno)
                            .addComponent(lb_InstituicaoOrigem)
                            .addComponent(lb_PaísOrigem)
                            .addComponent(lb_Email)
                            .addComponent(lb_Curso)
                            .addComponent(lb_Nome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_Curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ckb_Matutino)
                                                .addGap(18, 18, 18)
                                                .addComponent(ckb_Noturno))
                                            .addComponent(tf_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                            .addComponent(tf_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_InstituicaoOrigem))
                                        .addGap(0, 27, Short.MAX_VALUE)))
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_PaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Consiste, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nome)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Email)
                    .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_PaísOrigem)
                    .addComponent(cb_PaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_InstituicaoOrigem)
                    .addComponent(tf_InstituicaoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Idade)
                    .addComponent(tf_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckb_Matutino)
                    .addComponent(ckb_Noturno)
                    .addComponent(lb_Turno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Curso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpar)
                    .addComponent(bt_Consiste))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>                        

    private void bt_LimparActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        limpaCamposTela();
       
    }                                         

    private void ckb_MatutinoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ckb_Noturno.setSelected(false);
    }                                            

    private void ckb_NoturnoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ckb_Matutino.setSelected(false);
    }                                           

    private void bt_ConsisteActionPerformed(java.awt.event.ActionEvent evt) {                                            

        verificaPreenchimentoCampos(); // verica se todos os campos estão preenchidos!
        
        local_AlunoInt.setNome(tf_Nome.getText().trim().toUpperCase());
        local_AlunoInt.setEmail(tf_Email.getText().trim().toLowerCase());        
        local_AlunoInt.setCurso(cb_Curso.getSelectedItem().toString());
        local_AlunoInt.setInstituicaoOrigem(tf_InstituicaoOrigem.getText().trim());
        local_AlunoInt.setPaisOrigem(cb_PaisOrigem.getSelectedItem().toString());
        
        if(ckb_Matutino.isSelected()) {  local_AlunoInt.setTurno("Matutino"); }
        else {  local_AlunoInt.setTurno("Noturno"); }
        
        if (!TamanhoMinimoCampos()) {
            JOptionPane.showMessageDialog(null,"Tamanhos Permitidos de texto:\n Nome acima de 12 caracteres e Email entre 15 e 50 Carcteres.","Consistencia de Campos",JOptionPane.ERROR_MESSAGE);
        }
        
        ConsisteIdade();
        ConsisteEmail();
        ConsisteNumericos();
       
        
        
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
            java.util.logging.Logger.getLogger(fr_TelaCadastro_Intercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_TelaCadastro_Intercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_TelaCadastro_Intercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_TelaCadastro_Intercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new fr_TelaCadastro_Intercambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_Consiste;
    private javax.swing.JButton bt_Limpar;
    private javax.swing.JComboBox<String> cb_Curso;
    private javax.swing.JComboBox<String> cb_PaisOrigem;
    private javax.swing.JCheckBox ckb_Matutino;
    private javax.swing.JCheckBox ckb_Noturno;
    private javax.swing.JLabel lb_Curso;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_Idade;
    private javax.swing.JLabel lb_InstituicaoOrigem;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_PaísOrigem;
    private javax.swing.JLabel lb_Turno;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_Idade;
    private javax.swing.JTextField tf_InstituicaoOrigem;
    private javax.swing.JTextField tf_Nome;
    // End of variables declaration                   


    public void verificaPreenchimentoCampos() {

        if(tf_Nome.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Preencha o Nome","Erro Nome",JOptionPane.ERROR_MESSAGE);
            }
            if(tf_Email.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Preencha o Email","Erro Email",JOptionPane.ERROR_MESSAGE);
            }
            if(tf_Idade.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Preencha o Idade","Erro Idade",JOptionPane.ERROR_MESSAGE);
            } 
            if(tf_InstituicaoOrigem.getText().trim().isEmpty()) 
            {
                JOptionPane.showMessageDialog(null,"Preencha o Instituição Origem","Erro Instituição Origem",JOptionPane.ERROR_MESSAGE);
            }

            if ((!ckb_Matutino.isSelected())&&(!ckb_Noturno.isSelected())) {
                JOptionPane.showMessageDialog(null,"Selecione o Turno","Erro Turno",JOptionPane.ERROR_MESSAGE);
            }

            if(cb_Curso.getSelectedIndex()==-1) {
                JOptionPane.showMessageDialog(null,"Selecione o Curso","Erro Curso",JOptionPane.ERROR_MESSAGE);
            } 
            
            if(cb_PaisOrigem.getSelectedIndex()==-1) {
                JOptionPane.showMessageDialog(null,"Selecione o País Origem","Erro País Origem",JOptionPane.ERROR_MESSAGE);
            } 
            
    }


    public void limpaCamposTela() {
            tf_Nome.setText(null);
            tf_Email.setText("");
            tf_Idade.setText(null);
            tf_InstituicaoOrigem.setText(null); /// 02/09
            ckb_Matutino.setSelected(false);    
            ckb_Noturno.setSelected(false);
            cb_Curso.setSelectedIndex(0);
            cb_PaisOrigem.setSelectedIndex(0);


    }


    public boolean TamanhoMinimoCampos () {
         boolean saida=true;

         if (!local_AlunoInt.isNomeValido()) {
             saida= false;
         }
         
         if (local_AlunoInt.isEmailValido_Tamanho()) {
             saida= false;
         }

         return saida;
    }

    public void ConsisteIdade() {
        
        if(!local_AlunoInt.isIdadeValida()) {
            JOptionPane.showMessageDialog(null,"Idade Inválida - Aluno deve ser maior de 18 anos","Erro Idade",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ConsisteEmail() {

        if(!local_AlunoInt.isEmailValido_Dominio()) 
        {
              JOptionPane.showMessageDialog(null,"Dominio do Email Inválido","Erro Email",JOptionPane.ERROR_MESSAGE);
        }

        if(!local_AlunoInt.isEmailValido_Arroba()) {
            JOptionPane.showMessageDialog(null,"Email não possiu @", "Erro Email ",JOptionPane.ERROR_MESSAGE);
        }
        
                      
    }


    

    public void ConsisteNumericos() {
        
        try {
            local_AlunoInt.setIdade(Integer.parseInt(tf_Idade.getText().trim()));
       
        } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,"Digite apenas Números em \n Idade/Nota Vestibular/Classifição Vestibular.\n Erro:"+erro.getMessage(), "Erro: tratamento numéricos ",JOptionPane.ERROR_MESSAGE);      
        }
        
 
    }

} /// fim do mundo !!!! não ultrapasse !!!!//////////////////////



