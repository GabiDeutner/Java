package Ex05_Aula06;
import java.util.Scanner;

public class Principal {
         public static void main(String[] args){ 
 Scanner leitor = new Scanner(System.in);
Triangulos t1 = new Triangulos();
 int tecla =0;
 while (tecla != 3) { System.out.format("\n1 Descobrir tipo do Triângulo \n2 Sair \n Item:");
 tecla = leitor.nextInt();
 switch (tecla) { case 1:t1.ler(leitor); t1.exibir(); break;   
 case 2:System.out.println("\nPrograma Finalizado!");
 System.exit(0);break;}}}}
