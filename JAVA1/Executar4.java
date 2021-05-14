
package AulaFor;

import java.util.Scanner;

public class Executar4 extends Classe4{

public static void main (String args[]) {
        
int tecla = 0; 
 int n1=0, n2 = 0;  
Classe4 m = new Classe4();
Scanner leitor = new Scanner(System.in);
  
while ( tecla != 2 )
{ System.out.println("\nMENU\n1 Executar\n2 Sair\nitem:");
tecla = leitor.nextInt();
  
switch ( tecla )
{
case 1: 
 System.out.println("Digite o valor n1:");
 n1 = leitor.nextInt();
 System.out.println("Digite o valor n2:");
 n2 = leitor.nextInt();
m.mostrar ( n1 , n2 ); break;
case 2: System.exit(0); break;
} } }    
   
}
