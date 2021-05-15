package aulaWhile;

import java.util.Scanner;

public class Executa11c extends Classe11c {
    public static void main (String args[]) 
{
int tecla = 0; 
  
Classe11c m = new Classe11c();
Scanner leitor = new Scanner(System.in);
  
while ( tecla != 2 )
{ System.out.println("\nMENU\n1 Executar\n2 Sair\nitem:");
tecla = leitor.nextInt();
  
switch ( tecla )
{
case 1: m.salarios ( leitor ); break;
case 2: System.exit(0); break;
} } }    
}
