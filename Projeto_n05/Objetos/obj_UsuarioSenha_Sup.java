package Objetos;

public class obj_UsuarioSenha_Sup extends obj_UsuarioSenha {
    
    private String ContraSenha;

    public String getContraSenha() {
        return ContraSenha;
    }

    public void setContraSenha(String ContraSenha) {
        this.ContraSenha = ContraSenha;
    }
    
    public boolean is_CSenhaValida(String Confirma) {
            boolean saida = true;

             // valido entre 8 e 12 carac
            if((this.ContraSenha.length()<10)||(this.ContraSenha.length()>15)) {
                saida= false;
            }

             // tem que começar com letra 
            if (this.ContraSenha.charAt(0)!='_') {
                saida= false;
            }

            // ultimo caractere é numero
            if (!Character.isDigit(this.ContraSenha.charAt(this.ContraSenha.length()-1))) {
                saida= false;
            }

            // checar só letras Números e CAracteres Esp: @ # $ & *% ! ?
            for (int i=1; i<this.ContraSenha.length();i++) {

                if(!Character.isLetter(this.ContraSenha.charAt(i))&& 
                   !Character.isDigit(this.ContraSenha.charAt(i)))
                {
                    if (((this.ContraSenha.charAt(i))!='!')&&((this.ContraSenha.charAt(i))!='@')&&((this.ContraSenha.charAt(i))!='#')&&
                        ((this.ContraSenha.charAt(i))!='$')&&((this.ContraSenha.charAt(i))!='%')&&((this.ContraSenha.charAt(i))!='&')&&
                        ((this.ContraSenha.charAt(i))!='*')&&((this.ContraSenha.charAt(i))!='?')
                       ) 
                    {
                      saida=false;
                       break;   
                    }

                } // if

            } // fim for
    
    
            if (!this.ContraSenha.equals(Confirma)) {
                saida=false;
            }


            return saida;

    }

  
    @Override
    public boolean is_SenhaValida(String Confirma) {
            boolean saida = true;

             // valido entre 8 e 12 carac
            if((this.Senha.length()<10)||(this.Senha.length()>15)) {
                saida= false;
            }

             // tem que começar com letra 
            if ((this.Senha.charAt(0))!='_') {
                saida= false;
            }

            // ultimo caractere é numero
            if (!Character.isDigit(this.Senha.charAt(this.Senha.length()-1))) {
                saida= false;
            }

            // checar só letras Números e CAracteres Esp: @ # $ & *% ! ?
            for (int i=0; i<this.Senha.length();i++) {

                if(!Character.isLetter(this.Senha.charAt(i))&& 
                   !Character.isDigit(this.Senha.charAt(i)))
                {
                    if (((this.Senha.charAt(i))!='!')&&((this.Senha.charAt(i))!='@')&&((this.Senha.charAt(i))!='#')&&
                        ((this.Senha.charAt(i))!='$')&&((this.Senha.charAt(i))!='%')&&((this.Senha.charAt(i))!='&')&&
                        ((this.Senha.charAt(i))!='*')&&((this.Senha.charAt(i))!='?')&&((this.Senha.charAt(i))!='_')
                       ) 
                    {
                      saida=false;
                       break;   
                    }

                } // if

            } // fim for
    
    
            if (!this.Senha.equals(Confirma)) {
                saida=false;
            }


            return saida;

    }
    
}
