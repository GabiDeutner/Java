/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaVetores;

import java.util.Scanner;

public class Classe02 {

  static final int n = 3;

  static double sal  [] = new double  [ n ];
  static int    ida  [] = new int [ n ];
  static String nome [] = new String [ n ];

 


public static void main ( String [] args )
{ 
  Scanner leitor = new Scanner(System.in);
  String x= ""; 
  double novoSal;

 

// for de entrada de dados
  for (int i = 0; i < n ; i ++)
  {
    System.out.print("\nDigite salário:");
    sal [ i ] = leitor.nextDouble();
    
    System.out.print("\nidade:");
    ida [ i ] = leitor.nextInt();
    
    System.out.print("\nNome:");
    
    leitor.nextLine();
    nome[ i ] = leitor.nextLine();

 

  }

 


// for de saida ou impressao de resultados 
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
}

 

}    

