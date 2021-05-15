
package aulaWhile;


public class Classe2 {
//procurar todos os valores pares entre o início e o fim e somar todos
// inicio é 10 e o fim é 20, procura os pares entre 10 e 20
int somapar ( int inicio, int fim ) { //dois valores, um de inicio e um de fim
 int somapares =0;
 
 while ( inicio <= fim ) { //enquanto o início for menor ou igual ao fim
 if ( inicio % 2 == 0 ) // para ver se o valor é par
 { somapares += inicio; }
 inicio ++; }
return somapares ; }

void executar (int a, int b) {
    int pares = somapar (a, b); // recebe a=10 e b=20

 System.out.println("\nSoma de pares:"+pares); 
}

public static void main(String []agrs){
    
    Classe2 m = new Classe2 (); 
    m.executar(10, 20); // inicio vai ser 10 e final vai ser 20
} 
}
