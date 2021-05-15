
package ExercicioJava;

public class ProgramaC {
    

int va, vb, vc, vn, vbr;    


void ler_A ( int a ) { this.va = a; }
void ler_B ( int b ) { this.vb = b; }
void ler_C ( int c ) { this.vc = c; }
void ler_nulos ( int n ) { this.vn = n; }
void ler_brancos ( int br ) { this.vbr = br; }


int calculaTotal () {
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
return T;}


double calculaP1 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = (this.va + this.vb + this.vc);
double P1 = (P/T)*100;
return P1;
}


double calculaP2 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.va;
double P2 = (P/T)*100;
return P2;
}


double calculaP3 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vb;
double P3 = (P/T)*100; 
return P3;
}


double calculaP4 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vc;
double P4 = (P/T)*100; 
return P4;
}


double calculaP5 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vn;
double P5 = (P/T)*100; 
return P5;
}


double calculaP6 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vbr;
double P6 = (P/T)*100; 
return P6;
}


public void exibir(){
int T = calculaTotal ();
double P1 = calculaP1();
double P2 = calculaP2();
double P3 = calculaP3();
double P4 = calculaP4();
double P5 = calculaP5();
double P6 = calculaP6();

System.out.println("\n*** Tela de Saída ***\n");
 System.out.println("\nVotos no candidato A:" + this.va);
 System.out.println("\nVotos no candidato B:" + this.vb);
 System.out.println("\nVotos no candidato B:" + this.vc);
 System.out.println("\nVotos nulos:" + this.vn);
 System.out.println("\nVotos brancos:" + this.vbr);
 System.out.println("\nNúmero Total de eleitores:" + T);
 System.out.println("\nPercentual de votos válidos em relação ao total de eleitores:" + P1);
 System.out.println("\nPercentual de votos Candidato A em relação ao total de eleitores:" + P2);
 System.out.println("\nPercentual de votos Candidato B em relação ao total de eleitores:" + P3);
 System.out.println("\nPercentual de votos Candidato C em relação ao total de eleitores:" + P4);
 System.out.println("\nPercentual de votos nulos em relação ao total de eleitores:" + P5);
 System.out.println("\nPercentual de votos brancos em relação ao total de eleitores:" + P6);
}

}

