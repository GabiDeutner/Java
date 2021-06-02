
package Aula06;


import java.util.Scanner;
public class Triangulo {

 public double b, h;
 public void ler(Scanner leitor)
 {
System.out.println("\nDigite Base e Altura:");
 b = leitor.nextDouble();
 h = leitor.nextDouble();}
 public double getArea()
 { return (b * h) / 2; }}
