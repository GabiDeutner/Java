package Ex03_Aula06;

import java.util.Scanner;
public class Area {
public int n_lados;    
public double lado, area;
    
public void ler(Scanner leitor)
 {
System.out.println("\nDigite o numero de lados:");
 n_lados = leitor.nextInt();
 System.out.println("\nDigite a medida do lado:");
lado = leitor.nextInt();
 }
 
 public void calcular (){
   if (n_lados == 3){
       area = ((lado*lado)*Math.sqrt(3))/4;
   }  
   else if (n_lados == 4){
         area = lado * lado;
   }
    else if (n_lados == 5){
         area = 5*(((lado*lado)*Math.sqrt(3))/4);
   }
    else{
         System.out.println("É um outro polígono!");
   }
 }

 public void exibir(){
     if(n_lados >=3 && n_lados <5){
     System.out.println("A área do polígono é: "+ area);
 }  
     else{
         System.out.println("É um outro polígono!");
     }
}
 
}