
package ExercicioJava;

public class ProgramaC {
    
// atributos de leitura
int va, vb, vc, vn, vbr;    

// métodos de leitura dos atributos
void ler_A ( int a ) { this.va = a; }
void ler_B ( int b ) { this.vb = b; }
void ler_C ( int c ) { this.vc = c; }
void ler_nulos ( int n ) { this.vn = n; }
void ler_brancos ( int br ) { this.vbr = br; }

// métodos para calcular os resultados

//calcula numero total de eleitores
int calculaTotal () {
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
return T;}

//calcula percentual de votos válidos em relação ao total de eleitores
double calculaP1 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = (this.va + this.vb + this.vc);
double P1 = (P/T)*100;
return P1;
}

//calcula percentual de votos válidos do candidato A em relação ao total de eleitores
double calculaP2 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.va;
double P2 = (P/T)*100;
return P2;
}

// calcula percentual votos válidos do candidato B em relação ao total de eleitores
double calculaP3 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vb;
double P3 = (P/T)*100; 
return P3;
}

// calcula percentual votos válidos do candidato C em relação ao total de eleitores
double calculaP4 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vc;
double P4 = (P/T)*100; 
return P4;
}

// calcula percentual votos nulos em relação ao total de eleitores
double calculaP5 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vn;
double P5 = (P/T)*100; 
return P5;
}

// calcula percentual votos brancos em relação ao total de eleitores
double calculaP6 (){
int T = (this.va + this.vb + this.vc + this.vn + this.vbr );
double P = this.vbr;
double P6 = (P/T)*100; 
return P6;
}

// método de exibição
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

