package Objetos;

public class obj_CalculoMedia {

    private String Aluno;
    private double P1;
    private double P2;
    private double P3;
    private double At;
    private double Media;

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String Aluno) {
        this.Aluno = Aluno;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }

    public double getP3() {
        return P3;
    }

    public void setP3(double P3) {
        this.P3 = P3;
    }

    public double getAt() {
        return At;
    }

    public void setAt(double At) {
        this.At = At;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double Media) {
        this.Media = Media;
    }
    
    public void CalculoMedia (double p1, double p2, double at){
        this.Media = p1*0.32 + p2*0.48 + at*0.2;
    }  
    
    public void CalculoMedia (double p1, double p2, double p3, double at){
        if (p1<p2) {
            this.Media = p3*0.32 + p2*0.48 + at*0.2;
            
        } else {
            this.Media = p1*0.32 + p3*0.48 + at*0.2;
        }
        
        if(this.Media>6) {
            this.Media=6;        
        }
        
    }  
    
}
