/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaVetores;

import java.util.Scanner;

public class Classe2 {
Scanner leitor = new Scanner(System.in);
static final int n=3;
static double sal[] = new double[n];
static int [] ida = new int[n];
void main(){
double aux;
for (int i = 0; i < n ; i ++) {
System.out.println("\nDigite salário e idade separados por espaço:");
 sal[i] = leitor.nextDouble();
 ida[i] = leitor.nextInt(); }
// impriminto o vetor
for ( int i=0; i<n; i++){ aux = sal[i] * 1.1;
System.out.println( aux + " - " + ida[i]); }
System.exit(0);}

}
