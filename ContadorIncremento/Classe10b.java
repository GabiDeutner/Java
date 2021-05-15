package contadorIncremento;

import java.util.Scanner;

public class Classe10b extends Object {
       public double valor, multa, juros, VLPAGAR;
    public final double taxamulta = 0.02, taxajuros = 0.00033;
    public int dias;

    public void Ler(Scanner leitor){
        System.out.println("\nDigite o Valor:");
        valor = leitor.nextDouble(); 
        System.out.println("\nDigite os Dias:");
        dias = leitor.nextInt();
    }

    public void Calcular(){
        multa = valor * taxamulta;
        juros = (dias / 30) * 0.01;
        VLPAGAR = valor + multa + juros;
    }
    
 
    public void exibir() {
        System.out.println("\nA multa é: " + multa);
        System.out.println("\nOs juros são: " + juros);
        System.out.println("\nO Valor a Pagar é: " + VLPAGAR);
    } 
}
