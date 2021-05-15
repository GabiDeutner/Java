/*2) Depois faça a classe principal contendo um menu de controle, o método main() e um
método para ler cada atributo pelo teclado. Observem que a classe Pessoa deverá ser
instanciada somente quando a opção de leitura de menu for selecionada, já que vcs irão
utilizar um construtor com parametros para enviar os atributos lidos para dentro da classe
Pessoa. 

 */

package AulaJava5;

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
    
    Pessoa c1 = new Pessoa ();
    
 String dados;
         String [] tb = null;
    
    Scanner leitor = new Scanner(System.in);
     
     int tecla =0 ;
        while (tecla != 3)
        {
            
            System.out.println("\nMENU DE CONTROLE EXERCÍCIO AULA 4");
            System.out.println("\n1 Executa Programa...");          
            System.out.println("\n2 Sair do Sistema...");
            System.out.println("\nItem: ");
            tecla = leitor.nextInt();
            
            switch (tecla )
            {
                case 1: System.out.println("\nDigite nome, idade, sexo, telefone, endereço e e-mail separados por Enter ou por Espaço:");
                        c1.ler(leitor);
                        Pessoa c2 = new Pessoa (c1.dados);                
                        System.out.println();
                        break;
                    

                case 2: System.exit(0); break;
            }
        }          
    }    
 }

