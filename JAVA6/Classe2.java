
package aulaWhile;


public class Classe2 {

int somapar ( int inicio, int fim ) { 
 int somapares =0;
 
 while ( inicio <= fim ) { 
 if ( inicio % 2 == 0 ) 
 { somapares += inicio; }
 inicio ++; }
return somapares ; }

void executar (int a, int b) {
    int pares = somapar (a, b); 

 System.out.println("\nSoma de pares:"+pares); 
}

public static void main(String []agrs){
    
    Classe2 m = new Classe2 (); 
    m.executar(10, 20); 
} 
}
