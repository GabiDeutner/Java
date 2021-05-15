
package contadorIncremento;

public class Classe1 {
    
    public static int contador = 0;
    
    static public int diminuir = 20;
 

public static void calcular()
{
    while ( contador < 10 )
    { 
        contador = contador + 1; // incremento 
        
        diminuir = diminuir - 2; // decremento
    }
}
        
public static void exibir() {
    
System.out.println("\nContador="+contador);
System.out.println("\nDiminuir="+diminuir); 

}

public static void main(String []args) {
calcular();
exibir(); System.exit(0); } }

 

