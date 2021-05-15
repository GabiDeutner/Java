package VeiculoCarro;

import java.util.Scanner;

public class Carro extends Veiculo {

    public String placa;
    public String cor;
    public String renavam;
    
    Carro (){}
    
    public static void main (String [] args) {
    
Veiculo c1 = new Veiculo ();
Carro c2 = new Carro ();

Scanner leitor = new Scanner(System.in);
       
  int tecla =0;
  while (tecla != 3)
  {
      System.out.print("\n**MENU**\n1 Cadastrar\n2 Exibir\n3 Sair\n item:");
     
      tecla = leitor.nextInt();
      
      switch (tecla)
      {
          case 1: System.out.println(" ");
                  leitor.nextLine();
                  System.out.println("\nMarca: ");
                  c1.marca = leitor.nextLine();
              
                  System.out.println("\nModelo: ");
                  c1.modelo = leitor.nextLine();                
                                                                    
                  System.out.println("\nAno de fabricação: ");
                  c1.anofabricacao = leitor.nextLine();
                  
                  System.out.println("\nPlaca: ");
                  c2.placa = leitor.nextLine();
                  
                  System.out.println("\nCor: ");
                  c2.cor = leitor.nextLine();
                  
                  System.out.println("\nRenavan: ");
                  c2.renavam = leitor.nextLine();
                                  
                  break;
                  
          case 2: c1.exibir();
                  System.out.println("Placa: "+ c2.placa);
                  System.out.println("Cor: "+ c2.cor);
                  System.out.println("Renavam: "+ c2.renavam);
                  System.out.println("");
                  break;
              
          case 3: System.exit(0);
                  break;
       }
  }  }    
    

    
}
