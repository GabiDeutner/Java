package Objetos;

public class obj_Aluno {
    
    protected String Nome;
    protected int    Idade;
    private   int    ClassificacaoVestibular;
    private   double NotaVestibular;
    protected String Email;
    protected String Turno;
    protected String Curso;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getClassificacaoVestibular() {
        return ClassificacaoVestibular;
    }

    public void setClassificacaoVestibular(int ClassificacaoVestibular) {
        this.ClassificacaoVestibular = ClassificacaoVestibular;
    }

    public double getNotaVestibular() {
        return NotaVestibular;
    }

    public void setNotaVestibular(double NotaVestibular) {
        this.NotaVestibular = NotaVestibular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    public boolean isIdadeValida () {
        boolean saida= true;
        if(this.Idade<16) {
            saida=false;
        }
        return saida;
    }
    
    public boolean isNomeValido () {
       boolean saida=true;
       if (this.Nome.length()<12) {
             saida= false;
         }
       return saida;
    }
    
    public boolean isEmailValido_Tamanho () {
       boolean saida=true;
    
         if ((Email.length()<15)||(Email.length()>50)) {
             saida= false;
         }

         return saida;
    }     
    
    public boolean isEmailValido_Dominio () {
       boolean saida=true;
    
         if(!Email.endsWith(".com.br")&&(!Email.endsWith(".com"))&&(!Email.endsWith(".net"))) {
             saida= false;
         }
      return saida;    
    }
    
    public boolean isEmailValido_Arroba () {
       boolean saida=true;
    
        if(!Email.contains("@")) {
            saida = false;
        }
   
         return saida;
    }
    
    

} /////////////////////////////fim classe
