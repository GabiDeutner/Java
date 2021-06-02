package Ex05_Aula06;

import java.util.Scanner;

public class Triangulos {
 
public int n1, n2, n3;
    
public void ler(Scanner leitor){
System.out.println("\nDigite o primeiro valor do ângulo (em graus): ");
 n1 = leitor.nextInt();

System.out.println("\nDigite o segundo valor do ângulo (em graus): ");
 n2 = leitor.nextInt();
     
System.out.println("\nDigite o terceiro valor do ângulo (em graus): ");
 n3 = leitor.nextInt();
}    

public void exibir(){
    if(n1==90 || n2==90 || n3==90)  {
        System.out.println("\nO Triângulo é Retângulo! ");
    }  
    else if (n1>90 || n2>90 || n3>90){
            System.out.println("\nO O Triangulo é Obtusângulo! ");
    }  
    else if (n1<90 && n2<90 && n3<90){
            System.out.println("\nO O Triângulo é Acutângulo! ");
    }    
}         
}
