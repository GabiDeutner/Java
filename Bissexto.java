package Aula05;
import javax.swing.JOptionPane;

public class Bissexto {
   public int ANO, MOD;
    
public void ler (){
ANO = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite (ANO):"));
}

public void calcular(){
MOD = ANO%4;
}

public void exibir(){
    if ( MOD == 0){
JOptionPane.showMessageDialog(null, "\n O ano " + ANO + " é bissexto!");
}
else {
JOptionPane.showMessageDialog(null, "\n O ano " + ANO + " não é bissexto!");    
}
    System.out.println();
}

public static void main (String [] args)  {
    
int tecla; String menu;

Bissexto  x = new Bissexto ( );

menu = JOptionPane.showInputDialog(null, "\nmenu\n1 Executar\n2 Finalizar\nitem:");
tecla = Integer.parseInt  ( menu  );
switch ( tecla ) {
case  1: x.ler(); x.calcular(); x.exibir(); break;
case  2: JOptionPane.showMessageDialog(null, "O programa será finalizado!:");
          System.exit(0); break; 
}
}
}
