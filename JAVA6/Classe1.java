package aulaWhile;

public class Classe1 { 
    
public int contZeros( String texto ) {    
int cont=0; 

int contzeros =0; 

String x; 

while ( cont < texto.length() ){ 
    x = texto.substring(cont, cont + 1); 
 
    if ( x.equals("0") ) { 
     contzeros ++;
  
 }
 
 cont ++; } 

return contzeros; } 

public void executar () {
    
    String t = "prog00124000els" ; 
    
    
    int zeros = contZeros ( t ); 
    
 System.out.println("\nQuantidade de zeros:"+zeros);}
public static void main(String []agrs) { Classe1 m = new Classe1 ();
m.executar(); } }