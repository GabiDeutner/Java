package Aula05;
import javax.swing.JOptionPane;

public class Valores {
    public int X1,Y1,X2,Y2;
    
public void ler() {
X1 = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite (X):"));
Y1 = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite (Y):"));
}
    
public void calcular() {
X2 = Y1;
Y2 = X1;
       }
       
 public void exibir(){
JOptionPane.showMessageDialog(null, "\n O valor inicial de X é: " + X1 );
JOptionPane.showMessageDialog(null, "\n O valor final de X é: " + X2);
JOptionPane.showMessageDialog(null, "\n O valor inicial de Y é: " + Y1 );
JOptionPane.showMessageDialog(null, "\n O valor final de Y é: " + Y2);

System.out.println();
}

 public static void main (String [] args)  {
    
int tecla; String menu;

Valores  x = new Valores ( );

menu = JOptionPane.showInputDialog(null, "\nmenu\n1 Executar\n2 Finalizar\nitem:");
tecla = Integer.parseInt  ( menu  );
switch ( tecla ) {
case  1: x.ler(); x.calcular(); x.exibir(); break;
case  2: JOptionPane.showMessageDialog(null, "O programa será finalizado!:");
          System.exit(0); break; 
}
}
}   
    
 
