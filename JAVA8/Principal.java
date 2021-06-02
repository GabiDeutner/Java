
package Aula06;
import java.util.Scanner;

public class Principal {

 public static void main(String[] args){ 
 
 Scanner leitor = new Scanner(System.in);
 Media m1 = new Media();
 Triangulo t1 = new Triangulo();
 
 int tecla =0;
 while (tecla != 3) {
 System.out.format("\n1 Calcular Média\n2 Calcular Área\n3 Sair\nItem:");
 tecla = leitor.nextInt();
 
 switch (tecla) {
 case 1:m1.ler(leitor);
 System.out.format("\nMédia: %.2f" , m1.getMedia());
break;
     
 case 2: t1.ler(leitor); System.out.format("\nÁrea do Triângulo: %.3f", t1.getArea());
 break;
     
 case 3:System.out.println("\nPrograma Finalizado!");
 System.exit(0);break;}
 }
 }
}

