package ExercicioJava;

public class ProgramaA {
    
   
public int va;
public int vb;
public int vc;
public int vd;



void ler_A ( int a ) { this.va = a; }
void ler_B ( int b ) { this.vb = b; }
void ler_C ( int c ) { this.vc = c; }
void ler_D ( int d ) { this.vd = d; }

int calculaP () {
int P = (this.va * this.vc);
return P; }

int calculaS () {
int S = (this.vb + this.vd);
return S; }

public void exibir ( ) {
 int P = calculaP();
 int S = calculaS();

 System.out.println("\n*** Tela de Saída ***\n");
 System.out.println("\nValor de ....A:" + this.va);
 System.out.println("\nValor de ....B:" + this.vb);
 System.out.println("\nValor de ....C:" + this.vc);
 System.out.println("\nValor de ....D:" + this.vd);
 System.out.println("\nValor do produto do primeiro com o terceiro valor:" + P);
 System.out.println("\nValor da soma do segundo com o quarto valor:" + S);
 
}
 
}
