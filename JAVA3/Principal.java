
package ExercicioJava;
import java.util.Scanner;

public class Principal {
 public static void main(String[] args) {
     
     ProgramaA a1 = new ProgramaA();
     ProgramaB b1 = new ProgramaB();
     ProgramaC c1 = new ProgramaC();
     
     int a, b, c, d, A1, B1, C1, BR1, N1;
     double SM1, PR1;
     
     Scanner leitor = new Scanner(System.in);
     
     int tecla =0 ;
        while (tecla != 5)
        {
            
            System.out.println("\nMENU DE CONTROLE EXERCÍCIO AULA 4");
            System.out.println("\n1 Executa Programa A...");          
            System.out.println("\n2 Executa Programa B...");
            System.out.println("\n3 Executa Programa C...");
            System.out.println("\n4 Sair do Sistema...");
            System.out.println("\nItem: ");
            tecla = leitor.nextInt();
            
            switch (tecla )
            {
                case 1: System.out.println("\nDigite A, B, C e D separados por Enter ou por Espaço:");
                        a = leitor.nextInt();
                        b = leitor.nextInt(); 
                        c = leitor.nextInt();
                        d = leitor.nextInt();
                        a1.ler_A ( a );
                        a1.ler_B ( b );
                        a1.ler_C ( c );
                        a1.ler_D ( d );
                        a1.exibir ( );
                        System.out.println();
                        break;
                    
                case 2: System.out.println("\nDigite o valor do salário mensal:");
                        SM1 = leitor.nextDouble();
                        b1.lerSM ( SM1 );
                        System.out.println("\nDigite o percentual de reajuste:");
                        PR1 = leitor.nextDouble();
                        b1.lerPR ( PR1 );
                        b1.exibir ( );
                        System.out.println();
                        break;
                    
                case 3: System.out.println("\nDigite o n° votos candidato A:");
                        A1=leitor.nextInt();
                        c1.ler_A (A1);
                        System.out.println("\nDigite o n° votos candidato B:");
                        B1=leitor.nextInt();
                        c1.ler_B (B1);
                        System.out.println("\nDigite o n° votos candidato C:");
                        C1=leitor.nextInt();
                        c1.ler_C (C1);
                        System.out.println("\nDigite o n° votos nulos:");
                        N1=leitor.nextInt();
                        c1.ler_nulos (N1);
                        System.out.println("\nDigite o n° votos em branco:");
                        c1.ler_nulos (N1);
                        BR1=leitor.nextInt();
                        c1.ler_brancos (BR1);
                        c1.exibir ( );
                        System.out.println();
                        break;
                    
                case 4: System.exit(0); break;
            }
        }          
    }    
 }

