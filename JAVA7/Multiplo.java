
package Aula05;
import javax.swing.JOptionPane;;

public class Multiplo {
    public int N1, N2, MOD1, MOD2, MOD3, MOD4;
    
public void ler() {
N1 = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite (N1):"));
N2 = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite (N2):"));
}

public void calcular() { 
    MOD1 = N1 % 2 ;
    MOD2 = N1 % 3;
    MOD3 = N2 % 2;
    MOD4 = N2 % 3;
}

public void exibir() {

if (MOD1 == 0){
JOptionPane.showMessageDialog(null, "\n N1 é divisivel por 2!");
}
else {
JOptionPane.showMessageDialog(null, "\n N1 não é divisivel por 2!");    
}

if (MOD2 == 0){
JOptionPane.showMessageDialog(null, "\n N1 é divisivel por 3!");
}
else {
JOptionPane.showMessageDialog(null, "\n N1 não é divisivel por 3!");    
}

if (MOD3 == 0){
JOptionPane.showMessageDialog(null, "\n N2 é divisivel por 2!");
}
else {
JOptionPane.showMessageDialog(null, "\n N2 não é divisivel por 2!");    
}

if (MOD4 == 0){
JOptionPane.showMessageDialog(null, "\n N2 é divisivel por 3!");
}
else {
JOptionPane.showMessageDialog(null, "\n N2 não é divisivel por 3!");    
}

System.out.println();
}

public static void main (String [] args)  {
    
int tecla; String menu;

Multiplo  x = new Multiplo ( );

menu = JOptionPane.showInputDialog(null, "\nmenu\n1 Executar\n2 Finalizar\nitem:");
tecla = Integer.parseInt  ( menu  );
switch ( tecla ) {
case  1: x.ler(); x.calcular(); x.exibir(); break;
case  2: JOptionPane.showMessageDialog(null, "O programa será finalizado!:");
          System.exit(0); break; 
}
}
}
