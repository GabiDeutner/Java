package Ex03_Aula06;
import java.util.Scanner;
public class Lados {
    
public int n_lados;

 public void ler(Scanner leitor)
 {
System.out.println("\nDigite o numero de lados:");
 n_lados = leitor.nextInt();
}

 public void exibir (){
   if (n_lados == 3){
       System.out.println("É um triângulo!");
   }  
   else if (n_lados == 4){
         System.out.println("É um quadrado!");
   }
    else if (n_lados == 5){
         System.out.println("É um pentágono!");
   }
    else if (n_lados < 3 ){
         System.out.println("não é um polígono!");
   }
     else if (n_lados > 5 ){
         System.out.println("Polígono não identificado!");
   }
    else{
         System.out.println("Polígono não identificado!");
   }
 }
 }
