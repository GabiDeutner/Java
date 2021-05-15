
package AulaJava5;

import java.util.Scanner;

public class Pessoa {
  
   
    public String [] dados; 
    
 
 public Pessoa(int capacidade){
       this.dados = new String[capacidade];
    }


public void ler (Scanner leitor){  
    
this.dados[0] = leitor.nextLine();  
this.dados[1] = leitor.nextLine(); 
this.dados[2] = leitor.nextLine(); 
this.dados[3] = leitor.nextLine(); 
this.dados[4] = leitor.nextLine(); 
this.dados[5] = leitor.nextLine(); 
    }


Pessoa ( ) { } 
 
Pessoa ( String [] tb ) {
for ( String valor: tb )
 System.out.println(valor);
}


public static void main (String []args){
 Pessoa c1 = new Pessoa ();
 Scanner leitor = new Scanner(System.in);
 c1.ler(leitor);
Pessoa c2 = new Pessoa (c1.dados);       
}
/*
public static void main (String []args) {
Pessoa c1 = new Pessoa ();
Pessoa c2 = new Pessoa (c1.dados); }     
*/   



}
