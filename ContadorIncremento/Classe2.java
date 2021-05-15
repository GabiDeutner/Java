package contadorIncremento;

import java.util.Scanner;

public class Classe2 {
public String resp = "não";
public float valor = 0; public float saldo = 0;
public void ler () { Scanner leitor = new
Scanner(System.in);
while ( ! resp.equals("sim") )
{ System.out.println("\nDigite valor:");
 valor=leitor.nextFloat();
 saldo = saldo + valor;//acumulador
 System.out.println("\nDeseja sair?");
 resp=leitor.next(); } }

public void exibir(){
    System.out.println("\nSaldo Acumulado="+ String.format("= %.2f",saldo ) );}

public static void main(String args[]) {
    
Classe2 c2 = new Classe2(); 

c2.ler();
c2.exibir();
System.exit(0);}}