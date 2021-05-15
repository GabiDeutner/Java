package AulaVetores;

public class Classe1 {
public static void main(String []agrs)
{ int x [] = { 1, 0 , -1 };
int n = x.length;
 double aux = 0;
for (int i = 0; i < n ; i ++)
 { aux = Math.pow( x[i], 2) + x[i];
 System.out.println(aux + "\n");
 }
 System.exit(0); }
}
