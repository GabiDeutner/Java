package AulaHeranca;

import java.util.Scanner;



public class Pessoa  extends Cliente{
    
public String NOME, RG, CPF, IDADE, SALARIO;


    private Pessoa(String tp, String NOME, String RG, String CPF, String IDADE, String SALARIO) {
        super(tp); 
        this.NOME = NOME;
        this.RG = RG;
        this.CPF = CPF;
        this.IDADE = IDADE;
        this.SALARIO = SALARIO;
    }


@Override
public void exibir(){  
        System.out.println( "\n Nome: " + this.NOME);
        System.out.println( "\n RG: " + this.RG);
        System.out.println("\n CPF: " + this.CPF);
        System.out.println("\n Telefone: " + this.telefone);
        System.out.println("\n Idade: " + this.IDADE);
        System.out.println("\n Salário: " + this.SALARIO);
        
    }


public static void main (String [] args) {
    
Pessoa c1 = new Pessoa ("" , "", "", "" , "", "");
Scanner leitor = new Scanner(System.in);
       
  int tecla =0;
  while (tecla != 3)
  {
      System.out.print("\n**MENU**\n1 Ler\n2 Exibir\n3 Sair\n item:");
      //System.out.print("\n3 Sair\n item:");
      tecla = leitor.nextInt();
      
      switch (tecla)
      {
          case 1: System.out.println(" ");
                  leitor.nextLine();
                  System.out.println("\nNome:");
                  c1.NOME = leitor.nextLine();
              
                  System.out.println("\nIdade:");
                  c1.IDADE = leitor.nextLine();                
                                                                    
                  System.out.println("\nRG:");
                  c1.RG = leitor.nextLine();
                  
                  System.out.println("\nCPF:");
                  c1.CPF = leitor.nextLine();
                  
                  System.out.println("\nTelefone:");
                  c1.telefone = leitor.nextLine();
                  
                  System.out.println("\nSalario:");
                  c1.SALARIO = leitor.nextLine();
                                  
                  break;
                  
          case 2: c1.exibir();
                  System.out.println("");
                  break;
              
          case 3: System.exit(0);
                  break;
       }
  }  }    

    
}