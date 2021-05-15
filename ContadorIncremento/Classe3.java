package contadorIncremento;

import java.util.Scanner;
 
public class Classe3 
{
public static void main(String args[])
{
 
Scanner leitor= new Scanner(System.in);
 
int cont = 1;
 
float valor = 0, saldo = 0, media = 0;
 
while ( cont <= 10 )
{ 
  System.out.print(cont +"o Valor:");
  valor = leitor.nextFloat();
 
  //saldo = saldo + valor; // acumular o valor
    saldo += valor;
  
  
    media = saldo / cont;
  
  System.out.println( "\nSaldo parcial:" + String.format( "= %.3f", saldo ) );
  System.out.println("\nMedia parcial:"+ String.format("= %.1f",media) );
 
  cont = cont + 1; //contador/incremento
}
 
media = saldo / cont;
 
System.out.println("\nSaldo Final:"+ String.format("= %.2f",saldo ) );
System.out.println("\nMedia Final:"+ String.format("= %.1f",media) );
 
System.exit(0);
 
}
}
