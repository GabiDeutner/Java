package Objetos;

public class obj_AlunoIntercambio  extends obj_Aluno {
    
    private String PaisOrigem;
    private String InstituicaoOrigem;

    public String getPaisOrigem() {
        return PaisOrigem;
    }

    public void setPaisOrigem(String PaisOrigem) {
        this.PaisOrigem = PaisOrigem;
    }

    public String getInstituicaoOrigem() {
        return InstituicaoOrigem;
    }

    public void setInstituicaoOrigem(String InstituicaoOrigem) {
        this.InstituicaoOrigem = InstituicaoOrigem;
    }
    
    @Override
    public boolean isIdadeValida () {
        boolean saida= true;
        if(this.Idade<18) {
            saida=false;
        }
        return saida;
    }
    
}
