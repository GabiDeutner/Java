
package AulaHeranca;

public class Cliente extends Object{ //classe mãe sempre herda a classe object

public String tipo;
public String telefone;

 Cliente (String tp) { // classe construtora
 tipo = new String(); // instanciando tipo, isso inicializa o atributo
 this.tipo = tp; }      // o atributo tipo recebe tp
 
 public void exibir(){
 System.out.println(tipo); //tipo foi instanciada e recebeu tp, será exibida
 }
 
}
