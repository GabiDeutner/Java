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



}
