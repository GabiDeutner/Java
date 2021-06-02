
package projeto_n05;

import javax.swing.JOptionPane;
import Objetos.obj_Aluno;

public class fr_TelaCadastro extends javax.swing.JFrame {

    obj_Aluno  local_Aluno = new obj_Aluno();
    
    
    public fr_TelaCadastro() {
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
        lb_NotaVestibular = new javax.swing.JLabel();
        lb_ClassifVestibular = new javax.swing.JLabel();
        tf_NotaVestibular = new javax.swing.JTextField();
        tf_ClassifVestibular = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PrimeiraTela ");

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
        cb_Curso.setSelectedIndex(-1);

        lb_Curso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_Curso.setText("Curso:");

        bt_Consiste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Consiste.setText("Consiste");
        bt_Consiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsisteActionPerformed(evt);
            }
        });

        lb_NotaVestibular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_NotaVestibular.setText("NotaVestibular:");

        lb_ClassifVestibular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ClassifVestibular.setText("Classificação Vestibular:");

        tf_NotaVestibular.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_Idade)
                    .addComponent(lb_Turno)
                    .addComponent(lb_ClassifVestibular)
                    .addComponent(lb_NotaVestibular)
                    .addComponent(lb_Email)
                    .addComponent(lb_Curso)
                    .addComponent(lb_Nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckb_Matutino)
                                .addGap(18, 18, 18)
                                .addComponent(ckb_Noturno))
                            .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_Idade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_ClassifVestibular, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_NotaVestibular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bt_Limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Consiste, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_NotaVestibular)
                    .addComponent(tf_NotaVestibular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ClassifVestibular)
                    .addComponent(tf_ClassifVestibular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpar)
                    .addComponent(bt_Consiste))
                .addGap(61, 61, 61))
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
        
        local_Aluno.setNome(tf_Nome.getText().trim().toUpperCase());
        local_Aluno.setEmail(tf_Email.getText().trim().toLowerCase());
        
        local_Aluno.setCurso(cb_Curso.getSelectedItem().toString());
        if(ckb_Matutino.isSelected()) {  local_Aluno.setTurno("Matutino"); }
        else {  local_Aluno.setTurno("Noturno"); }
        
        if (!TamanhoMinimoCampos()) {
            JOptionPane.showMessageDialog(null,"Tamanhos Permitidos de texto:\n Nome acima de 12 caracteres e Email entre 15 e 50 Carcteres.","Consistencia de Campos",JOptionPane.ERROR_MESSAGE);
        }
        
        ConsiteEmail();
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
            java.util.logging.Logger.getLogger(fr_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_Consiste;
    private javax.swing.JButton bt_Limpar;
    private javax.swing.JComboBox<String> cb_Curso;
    private javax.swing.JCheckBox ckb_Matutino;
    private javax.swing.JCheckBox ckb_Noturno;
    private javax.swing.JLabel lb_ClassifVestibular;
    private javax.swing.JLabel lb_Curso;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_Idade;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_NotaVestibular;
    private javax.swing.JLabel lb_Turno;
    private javax.swing.JTextField tf_ClassifVestibular;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_Idade;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_NotaVestibular;
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

            if(tf_NotaVestibular.getText().trim().isEmpty()) 
            {
                JOptionPane.showMessageDialog(null,"Preencha o Nota do Vestibular","Erro Nota do Vestibular",JOptionPane.ERROR_MESSAGE);
            }

            if(tf_ClassifVestibular.getText().trim().isEmpty()) 
            {
                JOptionPane.showMessageDialog(null,"Preencha o Classificação do Vestibular","Erro Classificação do Vestibular",JOptionPane.ERROR_MESSAGE);
            }

            if ((!ckb_Matutino.isSelected())&&(!ckb_Noturno.isSelected())) {
                JOptionPane.showMessageDialog(null,"Selecione o Turno","Erro Turno",JOptionPane.ERROR_MESSAGE);
            }

            if(cb_Curso.getSelectedIndex()==-1) {
                JOptionPane.showMessageDialog(null,"Selecione o Curso","Erro Curso",JOptionPane.ERROR_MESSAGE);
            } 
    }


    public void limpaCamposTela() {
            tf_Nome.setText(null);
            tf_Email.setText("");
            tf_Idade.setText(null);
            tf_NotaVestibular.setText(null);    /// 02/09 
            tf_ClassifVestibular.setText(null); /// 02/09
            ckb_Matutino.setSelected(false);    
            ckb_Noturno.setSelected(false);
            cb_Curso.setSelectedIndex(-1);


    }


    public boolean TamanhoMinimoCampos () {
         boolean saida=true;

         if (!local_Aluno.isNomeValido()) {
             saida= false;
         }
     
         if (local_Aluno.isEmailValido_Tamanho()) {
             saida= false;
         }

         return saida;
    }

    public void ConsiteEmail() {

        if(!local_Aluno.isEmailValido_Dominio()) 
        {
              JOptionPane.showMessageDialog(null,"Dominio do Email Inválido","Erro Email",JOptionPane.ERROR_MESSAGE);
        }

        if(!local_Aluno.isEmailValido_Arroba()) {
            JOptionPane.showMessageDialog(null,"Email não possiu @", "Erro Email ",JOptionPane.ERROR_MESSAGE);
        }
        
                      
    }


    

    public void ConsisteNumericos() {
        
        try {
            local_Aluno.setIdade(Integer.parseInt(tf_Idade.getText().trim()));
            local_Aluno.setClassificacaoVestibular(Integer.parseInt(tf_ClassifVestibular.getText().trim()));
            local_Aluno.setNotaVestibular(Double.parseDouble(tf_NotaVestibular.getText().trim()));
       
        } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,"Digite apenas Números em \n Idade/Nota Vestibular/Classifição Vestibular.\n Erro:"+erro.getMessage(), "Erro: tratamento numéricos ",JOptionPane.ERROR_MESSAGE);      
        }
        
 
    }

} /// fim do mundo !!!! não ultrapasse !!!!//////////////////////



