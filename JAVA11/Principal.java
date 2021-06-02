package Ex04_Aula06;

import java.util.Scanner;

public class Principal {
         public static void main(String[] args){ 
 Scanner leitor = new Scanner(System.in);
Valores v1 = new Valores();
 int tecla =0;
 while (tecla != 3) { System.out.format("\n1 Ler e calcular maior valor \n2 Sair \n Item:");
 tecla = leitor.nextInt();
 switch (tecla) { case 1:v1.ler(leitor); v1.exibir(); break;   
 case 2:System.out.println("\nPrograma Finalizado!");
 System.exit(0);break;}}}}
