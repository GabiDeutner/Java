package Ex04_Aula06;

import java.util.Scanner;

public class Valores {
    
public int n1, n2, n3;
    
public void ler(Scanner leitor){
System.out.println("\nDigite o primeiro valor (n1):");
 n1 = leitor.nextInt();

System.out.println("\nDigite o segundo valor (n2), deve ser diferente do primeiro: ");
 n2 = leitor.nextInt();
     
System.out.println("\nDigite o terceiro valor (n3), deve ser diferentes dos dois anteriores:");
 n3 = leitor.nextInt();
}
     
public void exibir(){
    if(n1>n2 && n1>n3)  {
        System.out.println("\nO maior valor digitado foi: " + n1);
    }  
    else if (n2>n1 && n2>n3){
            System.out.println("\nO maior valor digitado foi: " + n2);
    }  
    else if (n3>n1 && n3>n2){
            System.out.println("\nO maior valor digitado foi: " + n3);
    }    
}       
     
}
