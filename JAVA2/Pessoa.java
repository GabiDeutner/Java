/*
1) Faça o código fonte de uma classe que contenha atributos pessoais de uma pessoa:
nome, idade, sexo, telefone, endereço e e-mail. Nesta classe crie um construtor com
parâmetros para inicializar os atributos da classe e crie também um método para exibir os
atributos. 

2) Depois faça a classe principal contendo um menu de controle, o método main() e um
método para ler cada atributo pelo teclado. Observem que a classe Pessoa deverá ser
instanciada somente quando a opção de leitura de menu for selecionada, já que vcs irão
utilizar um construtor com parametros para enviar os atributos lidos para dentro da classe
Pessoa. 

 */
package AulaJava5;

import java.util.Scanner;

public class Pessoa {
  
    /**
     *
     */
    public String [] dados; //= {"a","b","c","d","e","f"}; 
    
 
 public Pessoa(int capacidade){
       this.dados = new String[capacidade];
    }

 // métodos de leitura dos atributos
public void ler (Scanner leitor){  
    
this.dados[0] = leitor.nextLine();  
this.dados[1] = leitor.nextLine(); 
this.dados[2] = leitor.nextLine(); 
this.dados[3] = leitor.nextLine(); 
this.dados[4] = leitor.nextLine(); 
this.dados[5] = leitor.nextLine(); 
    }


Pessoa ( ) { } // construtor vazio
 
Pessoa ( String [] tb ) {
for ( String valor: tb )
 System.out.println(valor);
}


public static void main (String []args){
 Pessoa c1 = new Pessoa ();
 Scanner leitor = new Scanner(System.in);
 c1.ler(leitor);
Pessoa c2 = new Pessoa (c1.dados);       
}
/*
public static void main (String []args) {
Pessoa c1 = new Pessoa ();
Pessoa c2 = new Pessoa (c1.dados); }     
*/   



}
