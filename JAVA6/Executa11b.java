package aulaWhile;

import java.io.IOException;
import java.util.Scanner;

public class Executa11b extends Classe11b {
public static void main (String args[]) throws IOException 
{
int tecla = 0; 
  
Classe11b m = new Classe11b();
Scanner leitor = new Scanner(System.in);
  
while ( tecla != 2 )
{ System.out.println("\nMENU\n1 Executar\n2 Sair\nitem:");
tecla = leitor.nextInt();
  
switch ( tecla )
{
case 1: m.salarios ( leitor ); break;
case 2: System.exit(0); break;
} } } }    

