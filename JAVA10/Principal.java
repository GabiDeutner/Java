package Ex03_Aula06;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args){ 
 Scanner leitor = new Scanner(System.in);
 Lados l1 = new Lados();
 Area h1 = new Area();
 int tecla =0;
 while (tecla != 3) { System.out.format("\n1 Tipo Polígono\n2 Calcular área\n3 Sair\nItem:");
 tecla = leitor.nextInt();
 switch (tecla) { case 1:l1.ler(leitor); l1.exibir(); break;   
 case 2: h1.ler(leitor); h1.calcular(); h1.exibir(); break;
 case 3:System.out.println("\nPrograma Finalizado!");
 System.exit(0);break;}}}}
    