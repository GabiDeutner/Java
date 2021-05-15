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

