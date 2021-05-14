
package AulaFor;

import java.util.Scanner;
 
public class Classe1 
{
    static public int R;
    static public int X;
    static public int cont;
    
   public static void main(String[] args) 
    {
         Scanner leitor = new Scanner(System.in); 
         
    for ( cont = 1 ; cont <= 5 ; cont ++) // cont = cont + 1
        { 
            System.out.print ("\ncont=" + cont);
            System.out.print (" | X...=" + X);
            System.out.print (" | R...=" + R);
                  
            System.out.println ( "\nDigite um valor para X:" );
            X=leitor.nextInt();
        
             R = X * cont;
        
           //  System.out.println(cont + "o vez:" + R);
             System.out.println(); 
        }
 
    }
    
}

