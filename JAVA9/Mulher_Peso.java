package Ex01_Aula06;
import java.util.Scanner;

public class Mulher_Peso {
    public double PESOIDEAL, Altura;
 public void ler(Scanner leitor)
 {
System.out.println("\nDigite a Altura:");
 Altura= leitor.nextDouble();
}
 public double getPeso1(){ 
 return (62.1*Altura )-44.7 ; 
 
 }

}
    
  
