/*
Este exemplo cria o vetor x[] de forma explícita, em seguida
descobre o número de elementos (n), x.length é o tamanho total do
array x. Depois, é criada uma variável aux para armazenar a
soma do quadrado do elemento do array com ele mesmo. O loop for
é utilizado para armazenar e exibir o valor de aux. 
 */
package AulaVetores;

public class Classe1 {
public static void main(String []agrs)
{ int x [] = { 1, 0 , -1 };
int n = x.length;// tamaho
 double aux = 0;
for (int i = 0; i < n ; i ++)
 { aux = Math.pow( x[i], 2) + x[i];
 System.out.println(aux + "\n");
 }
 System.exit(0); }
}
