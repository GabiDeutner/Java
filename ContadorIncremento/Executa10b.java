
package contadorIncremento;
import java.util.Scanner;

public class Executa10b extends Classe10b {
    public double saldo = 0, media = 0;
    public int qtpress = 0;
    
    
    public void calcular2(){
        saldo = saldo + VLPAGAR;
        qtpress = qtpress + 1;
        media = saldo / qtpress;
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("\nO Saldo é: " + saldo);
        System.out.println("\n O Número de prestação é: " + qtpress);
        System.out.println("\nA média é: " + media);
    }
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Executa10b eb1 = new Executa10b();
        int tecla = 0;



        while (tecla != 4) {
            System.out.println("\nmenu\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:");
 
            tecla = leitor.nextInt();

            if (tecla == 1 ) { 
                eb1.Ler(leitor);
            }
            else if (tecla ==2 ){ 
                eb1.Calcular( ); 
                eb1.calcular2( ); 

            }
            else if (tecla ==3 ){ 
                eb1.exibir();
            } 
        }
    }
}