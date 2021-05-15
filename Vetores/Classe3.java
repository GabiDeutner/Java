
package AulaVetores;

import java.util.Scanner;


public class Classe3 {
public static void main (String [] args) {  
Scanner leitor = new Scanner(System.in);
String letra, frase;
System.out.println("\nDigite a frase:");
frase = leitor.nextLine();
int n = frase.length(); 
for (int i = 0; i < n ; i ++) {
 letra = frase.substring (i, i+1);
 System.out.println("\n"+letra); }
 System.out.println("\nA frase tem "+ n+"caracteres..!\n"); System.exit(0); }
 
}
