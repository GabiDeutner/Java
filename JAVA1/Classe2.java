
package AulaFor;

import java.util.Scanner;
 
public class Classe2 
{   
    public int R;
    public int X;

    
 public static void main(String[] args) 
 { 
     Scanner leitor = new Scanner(System.in);
     Classe2 c2 = new Classe2();
        
        
for ( int Y = 1 ; Y <= 10 ;  Y = Y + 2)
{
    System.out.print("\nDigite um valor para X:");
    c2.X = leitor.nextInt();
    
    c2.R = c2.X * Y;
 
    System.out.print("\nY=" + Y); 
    System.out.print(" | X="+c2.X ); 
    System.out.print(" | R = X * Y => " + c2.R); 
    
    System.out.println(); 
}
        
}
}
