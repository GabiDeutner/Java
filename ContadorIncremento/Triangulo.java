
package contadorIncremento;

import java.util.*;

public class Triangulo {
    
 public double area;
 public double altura;
 public double base;
 
 public void set_base(Scanner leitor){
 System.out.println("\nLer Base:");
 base = leitor.nextDouble(); }
 
public void set_altura(Scanner leitor){
 System.out.println("\nLer Altura:");
 altura = leitor.nextDouble();}

 public void set_area() {
 area = (base * altura)/2; }

 public void exibir() {
 System.out.println("\nÁrea..:"+area);
 System.out.println("\nBase..:"+base);
 System.out.println("\nAltura:"+altura);}
 }