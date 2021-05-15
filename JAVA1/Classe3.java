
package AulaFor;

public class Classe3 
{
    
    public static void mostrar (int x, int y )
    {
        double saldoInd =0, mediaInd = 0, contInd = 0;
        
        for ( int i = x  ; i <= y ; i ++) 
        {
            if ( i % 3 != 0 )
            {
              System.out.println ( i + " não divisivel por 3..");
              saldoInd += i; 
              contInd ++;
            }
        }
        mediaInd = saldoInd / contInd;
        
        System.out.print("\nSaldo de não divisiveis por 3.....: " + saldoInd );
        System.out.print("\nQuantidade de não divisiveis por 3: " + contInd );
        System.out.print("\n\n\nMédia de não divisiveis por 3.: " + mediaInd );
        System.out.println( );
     }
 
public static void main ( String args [] )
    {
       mostrar ( 12, 1025 );
    }
}
