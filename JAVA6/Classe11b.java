package aulaWhile;


import java.io.IOException;
import java.util.Scanner;

public class Classe11b {
 public double contM=0, contH = 0, salarioMulher, salarioHomem, mediaM,mediaH, saldoM=0, saldoH=0;
 public char sexo;

  
public void salarios ( Scanner leitor ) throws IOException
{
System.out.println("\nDigite o Sexo:");
sexo = (char)System.in.read(); 


if (sexo=='F'){
System.out.println("\nDigite o Salário:");
salarioMulher = leitor.nextDouble();
}
else if (sexo=='f'){
System.out.println("\nDigite o Salário:");
salarioMulher = leitor.nextDouble();
}
else if (sexo=='H'){
System.out.println("\nDigite o Salário:");
salarioHomem = leitor.nextDouble();
}
else if (sexo=='h'){
System.out.println("\nDigite o Salário:");
salarioHomem = leitor.nextDouble();
}
else{
    System.out.println("\nSexo inválido, digite novamente!");
}
        

contM ++; 
contH ++; 
saldoM = saldoM + salarioMulher;
saldoH = saldoH + salarioHomem;

mediaM = saldoM / contM ;
mediaH = saldoH / contH ;


System.out.println("\nMédia de Salários Mulheres:" + mediaM);
System.out.println("\nSaldo dos Salários Mulheres:" + saldoM); 
System.out.println("\nMédia de Salários Homens:" + mediaH);
System.out.println("\nSaldo dos Salários Homens:" + saldoH); 
}
  
}