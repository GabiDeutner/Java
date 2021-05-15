package AulaJava5;

public class Classe1
{
 int x=10;
 void listar () {
 System.out.println( x ); 
 }
 
public static void main (String [] args ){
    
 Classe1 ob1; // criando o objeto
 ob1 = new Classe1( ); // instanciamento de ob1 com new
 ob1.listar();
 Classe1 ob2 = new Classe1( ); // instanciamento de ob2 com new
 System.out.println( ob1.x + ob2.x );
}
}
