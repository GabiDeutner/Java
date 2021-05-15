
package AulaHeranca;

public class Empresa extends Cliente{ // a classe mãe é a classe Cliente
    
 public String rua;
 
 
 Empresa( String tp, String rua ) { // método construtor
 super(tp); //recebe tp da classe mãe, o super traz da classe mãe
 this.rua = rua; //variavel local recebe variável global
 }

public static void main (String [] args) { //método main para executar a classe
    
 String meutipo= "Pessoa Física"; //crio uma variável String que recebe essa frase
 String rua = "Rua A ";
 
 Empresa c1 = new Empresa ( meutipo, rua ); //instancio a classe com as variáveis criadas neste método
 
 c1.telefone = "11-955443322"; //objeto c1 recebe o telefone da classe mãe
 c1.rua = c1.rua + ", número 9";
 
 System.out.println(c1.telefone); //herda telefone da classe mãe
 System.out.println(c1.rua); c1.exibir();
 
 c1.tipo = "Pessoa Jurídica";
 c1.exibir();
 System.exit(0); 
} 
}
