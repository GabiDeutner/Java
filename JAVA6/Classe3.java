
package aulaWhile;

import java.util.*;
  
public class Classe3 
{
public double cont=0, salario, salariomaior, salariomenor, media, saldo=0;

  
public void salarios ( Scanner leitor )
{
System.out.println("\nSalário:");
salario = leitor.nextDouble(); 
cont ++; 
if ( cont == 1 ) 
{
salariomenor = salario;
salariomaior = salario; 
}
  
if ( salario < salariomenor )
salariomenor = salario;
  
if (salario > salariomaior)
salariomaior = salario;

saldo += salario;

media = saldo / cont ;


System.out.println("\nSalário Menor:" + salariomenor);
System.out.println("\nSalário Maior:" + salariomaior);
System.out.println("\nMédia de Salários:" + media);
System.out.println("\nSaldo dos Salários:" + saldo); 
}
  
public static void main (String args[]) 
{
int tecla = 0; 
  
Classe3 m = new Classe3();
Scanner leitor = new Scanner(System.in);
  
while ( tecla != 2 )
{ System.out.println("\nMENU\n1 Executar\n2 Sair\nitem:");
tecla = leitor.nextInt();
  
switch ( tecla )
{
case 1: m.salarios ( leitor ); break;
case 2: System.exit(0); break;
} } } }

