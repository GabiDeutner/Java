/*
Fazer o programa fonte: faça uma classe que busca e retorna quantas
vezes uma palavra específica aparece dentro de um texto digitado. Leia e
armazene a palavra dentro da variável PALAVRA é busque no texto
quantas vezes esta palavra aparece. (Busca dentro de um string)
 */
package AulaVetores;

import java.util.Scanner;

public class Vetor {

    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade){
       this.elementos = new String[capacidade];
       this.tamanho = 0;
    }

    private Vetor() {
 
    }

          
     public boolean adiciona(String elemento) {
        if(this.tamanho < this.elementos.length){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
        }
        return false;
    }      
     
     
public static void main (String [] args) {  
Scanner leitor = new Scanner(System.in);
Vetor v = new Vetor(10);
String elemento = null;
int i=0;
String palavra;


System.out.println("Digite a palavra buscada");
palavra = leitor.next();

System.out.println("Digite um texto com 10 palavras, dando enter entre cada palavra:");

elemento = leitor.nextLine(); //0
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//1
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//2
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//3
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//4
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine(); //5
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//6
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//7
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//8
v.adiciona(elemento);
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}


elemento = leitor.nextLine();//9
v.adiciona(elemento);
System.out.println ("! Atingiu dez palavras !");
if (elemento.equals(palavra)){
   i = i +1; } else { i = i + 0;}

System.out.println("a quantidade da palavra "+ palavra + " no texto é: " + i);


} }
