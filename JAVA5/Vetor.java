/*
Faça uma classe onde o usuário irá digitar um VALOR qualquer de uma prestação
e também uma quantidade de DIAS qualquer. Após a leitura calcule o valor de
PGTO acrescentando o valor de uma MULTA de acordo com uma TAXAMULTA de 2% e
também o valor do JUROS em função da quantidade de DIAS em atraso, sendo que
a TAXAJUROS por dia será 1/30, defina as duas taxas como atributos constantes. 
Os seguintes atributos serão vetores de entrada com tamanho 3:   VALOR [3], 
DIAS [3]. O vetor de saida com tamanho 3 será: PGTO[3].

Não é necessário fazer herança, mas faça um menu de controle com as seguintes
opções: 1 ler, 2 calcular 3 exibir, 4 sair
*/


package UltimaAula;

import java.util.Scanner;

public class Vetor {
    public double MULTA, JUROS;
    static final int i = 3;
    public double VALOR[] = new double  [ i ];
    public double VALORPGTO[] = new double  [ i ];  
    public int DIAS[] = new int [ i ];
    public final double TXMULTA = 0.02, TXJUROS = 0.00033;
    
    
    public void Leitura(Scanner leitor){
        for (int j = 0; j < i  ; j ++){
            System.out.println("\nDigite o Valor: ");
            VALOR[j] = leitor.nextDouble(); 
            
            System.out.println("\nDigite os Dias: ");
            DIAS[j] = leitor.nextInt();
            
        }
    }

    public void Calculo(){
        for (int j = 0; j < i  ; j ++){
            MULTA = (VALOR[j] * TXMULTA);
            JUROS = (DIAS[j] / 30) * 0.01;
            VALORPGTO[j] = (VALOR[j] + MULTA + JUROS);
            System.out.println("Os valores foram calculados!");
        }
    }
    
 
    public void Mostrar() {
        for (int j = 0; j < i  ; j ++){
            System.out.println("\n A Multa é:" + MULTA);
            System.out.println("\n Os Juros são: " + JUROS);
            System.out.println("\n O valor do Pagamento é: " + VALORPGTO[j]);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Vetor v = new Vetor();
        int tecla = 0;

        while (tecla != 4) {
            System.out.println("\nmenu\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:");
            
            tecla = leitor.nextInt();

            if (tecla == 1 ) { 
                v.Leitura(leitor);
            }
            else if (tecla ==2 ){ 
                v.Calculo( ); 

            }
            else if (tecla ==3 ){ 
                v.Mostrar();
            } 
        }
    }
}    

