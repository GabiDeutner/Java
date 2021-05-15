
package AulaHeranca;

public class Empresa extends Cliente{ 
    
 public String rua;
 
 
 Empresa( String tp, String rua ) { 
 super(tp); 
 this.rua = rua; 
 }

public static void main (String [] args) { 
    
 String meutipo= "Pessoa Física"; 
 String rua = "Rua A ";
 
 Empresa c1 = new Empresa ( meutipo, rua ); 
 
 c1.telefone = "11-955443322"; 
 c1.rua = c1.rua + ", número 9";
 
 System.out.println(c1.telefone); 
 System.out.println(c1.rua); c1.exibir();
 
 c1.tipo = "Pessoa Jurídica";
 c1.exibir();
 System.exit(0); 
} 
}
