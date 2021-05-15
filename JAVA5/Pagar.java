package UltimaAula;

import java.util.Scanner;

public class Pagar {
    static final int n = 3;
    public double valor[] = new double  [ n ];
    public double vlpagar[] = new double  [ n ];
    public double multa, juros;
    public final double taxamulta = 0.02, taxajuros = 0.00033;
    public int dias[] = new int [ n ];

    public void Ler(Scanner leitor){
        for (int i = 0; i < n  ; i ++){
            System.out.println("\nLer Valor:");
            valor[i] = leitor.nextDouble(); 
            
            System.out.println("\nLer Dias:");
            dias[i] = leitor.nextInt();
            
        }
    }

    public void Calcular(){
        for (int i = 0; i < n  ; i ++){
            multa = valor[i] * taxamulta;
            juros = (dias[i] / 30) * 0.01;
            vlpagar[i] = valor[i] + multa + juros;
        }
    }
    
 
    public void exibir() {
        for (int i = 0; i < n  ; i ++){
            System.out.println("\nMulta..:" + multa);
            System.out.println("\nJuros..:" + juros);
            System.out.println("\nValor a Pagar:" + vlpagar[i]);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Pagar p = new Pagar();
        int tecla = 0;

        while (tecla != 4) {
            System.out.println("\nmenu\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:");
 
            tecla = leitor.nextInt();

            if (tecla == 1 ) { 
                p.Ler(leitor);
            }
            else if (tecla ==2 ){ 
                p.Calcular( ); 

            }
            else if (tecla ==3 ){ 
                p.exibir();
            } 
        }
    }
}