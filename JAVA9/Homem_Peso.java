package Ex01_Aula06;
import java.util.Scanner;

public class Homem_Peso {

public double PESOIDEAL, Altura;
 public void ler(Scanner leitor)
 {
System.out.println("\nDigite a Altura:");
 Altura= leitor.nextDouble();
}
 public double getPeso2(){ 
 return (72.7*Altura )-58 ; 
 }

}