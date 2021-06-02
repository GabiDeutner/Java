package Objetos;

public class obj_UsuarioSenha {
    
   protected String Nome; 
   protected String Usuario;
   protected String Senha;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
   
    public boolean is_UsuarioValido()  {
    
        boolean saida = true;

         //8 a 20 caracteres  
         if ((this.Usuario.length()<8)||(this.Usuario.length()>20)) {

             saida = false;
         }

         // e comneçar com Letra
             if (!Character.isLetter(this.Usuario.charAt(0))) {
                 saida = false;
             }

         // só letras e números 
         for(int i=0;i<this.Usuario.length();i++) {
           if((!Character.isDigit(this.Usuario.charAt(i)))&&
              (!Character.isLetter(this.Usuario.charAt(i)))
              )
           {
               saida = false;
           }    
         }



         return saida;
     }
    
 
    
    public boolean is_SenhaValida(String Confirma) {
            boolean saida = true;

             // valido entre 8 e 12 carac
            if((this.Senha.length()<8)||(this.Senha.length()>12)) {
                saida= false;
            }

             // tem que começar com letra 
            if (!Character.isLetter(this.Senha.charAt(0))) {
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
                        ((this.Senha.charAt(i))!='*')&&((this.Senha.charAt(i))!='?')
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
