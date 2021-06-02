
package Aula06;

import java.util.Scanner;
public class Media {
 public double x, y;
 public void ler(Scanner leitor)
 { System.out.println("\nDigite X e Y:");
 x = leitor.nextDouble();
 y = leitor.nextDouble(); }
 public double getMedia()
 { return (x + y )/2; }}

