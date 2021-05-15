package VeiculoCarro;

public class Veiculo extends Object {
    
public String marca;
public String modelo;
public String anofabricacao;

Veiculo (){}

 public String Cadastrar (String marca, String modelo, String ano){
     this.marca = marca;
     this.modelo = modelo;
     this.anofabricacao = ano;
    return (modelo);
 }
 
 public void exibir(){
 System.out.println("Marca: "+ marca);
 System.out.println("Modelo: "+ modelo);
 System.out.println("Ano de fabricação: "+ anofabricacao);
 }
     
}
