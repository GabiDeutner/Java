package ExercicioPessoa;

import java.util.Scanner;

public class Principal {
    public static void main ( String [] args ) {
        
        Scanner leitor = new Scanner(System.in);
        Pessoa a1;
        a1 = new Pessoa ( );
        
        String nome, email, endereco, sexo;  
        int telefone, idade;
        int tecla=0;

        while (tecla != 2) {
            System.out.println("\n MENU DE CONTROLE DO EXERCÍCIO DA AULA LP1");
            System.out.println("\n1 Armazenar Dados Pessoais");          
            System.out.println("\n2 Sair do Sistema...");
            System.out.println("\nItem: ");
            tecla = leitor.nextInt();
            
            switch ( tecla ){

                case 1:    
                        System.out.println("\nDigite o nome da pessoa:");
                        nome = leitor.nextLine();
                        nome = leitor.nextLine();
                        System.out.println("\nDigite a idade da pessoa:");
                        idade = leitor.nextInt();
                        System.out.println("\nDigite o Sexo da pessoa M para masculino e F para Feminino:");
                        sexo = leitor.next();
                        System.out.println("\nDigite o telefone da pessoa:");
                        telefone = leitor.nextInt();
                        System.out.println("\nDigite o Endereço da pessoa:");
                        endereco = leitor.nextLine();
                        endereco = leitor.nextLine();
                        System.out.println("\nDigite o Email da pessoa:");
                        email = leitor.next();
                        a1.lerNome ( nome ); 
                        a1.lerIdade( idade );
                        a1.lerSexo ( sexo );
                        a1.lerTelefone( telefone );
                        a1.lerEndereco ( endereco ); 
                        a1.lerEmail ( email );  
                        a1.exibir ( ); 
                        break;      
                case 2: System.out.println("\n Finalizar Programa ");
                        System.out.println ();
                        break; 
            }
        }
    }
}
