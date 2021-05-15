package AulaVetores;

import java.util.Scanner;

public class ClasseSalario {

  static final int n = 3;

  static double sal  [] = new double  [ n ];
  static int    ida  [] = new int [ n ];
  static String nome [] = new String [ n ];

public static void main ( String [] args )
{ 
  Scanner leitor = new Scanner(System.in);
  String x= ""; 
  double novoSal;

  for (int i = 0; i < n ; i ++)
  {
    sal [ 0 ] = 12000;
    sal [ 1 ] = 10243.20;
            
    ida [ 0 ] = 30;
    ida [ 1 ] = 45;
    
    nome[ 0 ] = "Sara Lemes";
    nome[ 1 ] = "Ricardo Jafé ";
   }

for ( int i = 0; i <= (n-1); i ++)
{ 
  novoSal = sal [ i ] * 1.1;
  
  System.out.print("\ni=" + i);
  System.out.print("| n=" + n);
  System.out.print("| sal["+i+"]=" +  sal [ i ]);
  System.out.print("| Nome:" + nome [ i ] );
  System.out.print("| Novo Salário=" + String.format("%.1f", novoSal )  );
}

System.exit(0);
} }    

   
