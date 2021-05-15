package contadorIncremento;
import java.util.Scanner;
public class Executa extends Triangulo {
    
 public double hipotenusa, MEDIA;
 
 public void set_media(double saldo,int contador) {
 MEDIA = saldo/contador;
 System.out.println("\nMédia das áreas: "+this.MEDIA);     
 }

 public void exibirHipotenusa() {
 super.exibir(); // chama void exibir() da classe mãe
 hipotenusa = Math.sqrt(base * base + altura * altura );
 System.out.println("\nHipotenusa"+this.hipotenusa); }

 public static void main(String []args) {
 Scanner leitor = new Scanner(System.in);
 Executa e1 = new Executa();
 int tecla = 0;
 int contador = 1;
 double saldo = 0;
 double MEDIA =0;
  
while (tecla != 4) {
 System.out.println("\nmenu\n1 Ler\n2 Calcular\n3 Exibir \n4 Sair\nItem:");
 tecla = leitor.nextInt();
 
if (tecla == 1 ) { e1.set_base(leitor);
 e1.set_altura(leitor); }
else if (tecla ==2 ){ 
e1.set_area( );
System.out.println("saldo atual: " + saldo);
System.out.println("contador atual: " + contador);
saldo = e1.area + saldo;
contador = contador + 1;
System.out.println("saldo final: " + saldo);
System.out.println("contador final: " + contador); }
else if (tecla ==3 )
{ e1.exibirHipotenusa();
e1.set_media(saldo,contador); }}
 System.out.println("\nPrograma finalizado!");
 System.exit(0); }}

