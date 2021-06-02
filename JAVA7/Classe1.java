package AulaJava;
import java.util.Scanner;

public class Classe1 {
    

public double va;
public double vb;
public double vc;


void ler_A ( double a ) { this.va = a; }
void ler_B ( double b ) { this.vb = b; }
void ler_C ( double c ) { this.vc = c; }
    



double cal_Delta () {
double delta = Math.pow(this.vb,2) - 4 * this.va *
this.vc;
return delta; }
double cal_x1 (double delta ) {
double x1 = (-this.vb + Math.sqrt(delta))/(2*this.va);
return x1; }
double cal_x2 (double delta ) {
double x2 = (-this.vb - Math.sqrt(delta))/(2*this.va);
return x2; }


public void exibir ( ) {
 double delta = cal_Delta();
 System.out.println("\n*** Tela de Saída ***\n");
 System.out.println("\nValor de ....A:" + this.va);
 System.out.println("\nValor de ....B:" + this.vb);
 System.out.println("\nValor de ....C:" + this.vc);
 System.out.println("\nValor de Delta:" + delta);
 
if (delta < 0) { 
    System.out.println("\nImpossível calcular x1 e x2\nDelta é negativo!");
System.out.println(); return; }
else
{ double x1 = cal_x1( delta );
 double x2 = cal_x2( delta );
 System.out.println("\nValor de ....x1:"+ x1);
 System.out.println("\nValor de ....x2:"+ x2 +
"\n");}
}

public static void main ( String [] args ) {
Scanner leitor = new Scanner(System.in);
Classe1 a1 = new Classe1 ( );
double a, b, c; int tecla=0;
while (tecla != 2) {
System.out.print("\nMenu\n1 Executar Programa\n2 Finalizar o Programa\nitem:");
tecla=leitor.nextInt ( );
switch ( tecla ){
case 1: System.out.println("\nDigite A, B e C separados por Enter ou por Espaço:");
a = leitor.nextDouble();
b = leitor.nextDouble(); c = leitor.nextDouble();
 if ( a == 0 ) { System.out.println("\nErro!'A' deve ser diferente de zero!\n");
 System.out.println(); return; }

 a1.ler_A ( a ); a1.ler_B ( b ); a1.ler_C ( c );
 a1.exibir ( ); break;
case 2: System.out.println("\nO programa será finalizado!");
 System.out.println (); 
 return; }
 break; 
}
} 
 }  

