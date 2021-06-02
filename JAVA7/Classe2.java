package Aula05;
import javax.swing.*;

public class Classe2 {    
public int A, B, DIV, MOD;

public void ler() {
A = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite (A):"));
B = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite (B):"));
}

public void calcularModDiv() { 
    DIV = (int) (A/B);        MOD = A % B ;   
}

public void exibir() {
JOptionPane.showMessageDialog(null, "O div de " + A + " por " + B + " é: " + DIV);
JOptionPane.showMessageDialog(null, "O mod de " + A + " por " + B + " é: " + MOD);
 
if ( MOD == 0 )  JOptionPane.showMessageDialog(null, A + " é divisivel por " + B);
  else   JOptionPane.showMessageDialog(null, A + " NÃO é divisivel por "+ B); 
System.out.println();
}

public static void main (String [] args)  {
    
int tecla; String menu;

Classe2  x = new Classe2 ( );

menu = JOptionPane.showInputDialog(null, "\nmenu\n1 Executar\n2 Finalizar\nitem:");
tecla = Integer.parseInt  ( menu  );
switch ( tecla ) {
case  1: x.ler(); x.calcularModDiv(); x.exibir(); break;
case  2: JOptionPane.showMessageDialog(null, "O programa será finalizado!:");
          System.exit(0); break; 
}
}
}
