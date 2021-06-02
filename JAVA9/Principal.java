package Ex01_Aula06;
import java.util.Scanner;

public class Principal {

 public static void main(String[] args){ 
 Scanner leitor = new Scanner(System.in);
 Mulher_Peso m1 = new Mulher_Peso();
 Homem_Peso h1 = new Homem_Peso();
 int tecla =0;
 while (tecla != 3) { System.out.format("\n1 Peso ideal mulher\n2 Peso ideal homem\n3 Sair\nItem:");
 tecla = leitor.nextInt();
 switch (tecla) { case 1:m1.ler(leitor);
 System.out.format("\nPeso ideal mulher: %.2f" , m1.getPeso1());
break;
 case 2: h1.ler(leitor); System.out.format("\nPeso ideal homem: %.3f", h1.getPeso2()); break;
 case 3:System.out.println("\nPrograma Finalizado!");
 System.exit(0);break;}}}}
