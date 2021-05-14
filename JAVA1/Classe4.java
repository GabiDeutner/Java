/*
CLASSE 4 Divisibilidade Faça um algoritmo contendo uma function para
armazenar o somatório de todos os valores entre n1 e n2, que são divisíveis por 3 e
por 4 ao mesmo tempo e um VOID para mostrar o valor na tela. (faça a classe,
instancie, indente o código, crie um leitor para ler n1 e n2, execute no main() com
menu switch case, complete o código para rodar no IDE, peça ao usuário que digite o
valor de n1 e de n2.
 */
package AulaFor;

public class Classe4 {
    
 int soma (int x, int y ) {
int resultado=0;
 for (int i =x; i<=y; i++) {
 if ( i % 3 == 0 && i % 4 == 0 )
 resultado += i;
 }
return resultado; }
 
void mostrar (int n1, int n2) {
int result = soma(n1,n2);

System.out.println("Somatorio de " + n1 + " ate "+n2+" = " + result); }


/*void main ( String args [] ){
 int n1=15, n2 = 2148;
 mostrar ( n1 , n2 ); }  */

}
