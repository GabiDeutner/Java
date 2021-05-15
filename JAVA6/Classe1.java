package aulaWhile;

public class Classe1 { 
    
public int contZeros( String texto ) {    
int cont=0; // contador de ciclos

int contzeros =0; // conta os zeros

String x; //armazena os caracteres do nosso texto

while ( cont < texto.length() ){ // enquanto cont for menor que o tamanho do texto (quantidade de caracteres)
    x = texto.substring(cont, cont + 1); // vai cortar o texto da posiçao 0 até a posiçao 1, da posição 1 até a 2, assim sucessivamente
 //o x é a variável que recebe texto.substring é para ele ficar vendo de posição em posição as letras contidas na String texto
    if ( x.equals("0") ) { // quando x encontrar um zero ele vai fazer a contagem no contador
     contzeros ++;
     //contzeros = contzeros + 1
 }
 
 cont ++; } // fim do while

return contzeros; } // fim contzeros

public void executar () {
    
    String t = "prog00124000els" ; // t é um objeto e tem um texto dentro dele com varios zeros
    //cada caractere desse texto ocupa uma posição
    
    int zeros = contZeros ( t ); //esse t cai dentro do objeto texto
    
 System.out.println("\nQuantidade de zeros:"+zeros);}
public static void main(String []agrs) { Classe1 m = new Classe1 ();
m.executar(); } }