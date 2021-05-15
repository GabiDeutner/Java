package aulaWhile;

import java.util.Scanner;

public class Classe11c {
 public double contMenor=0,contMaior=0, salario, menorSalarioMaiorIdade,maiorSalarioMaiorIdade, menorSalarioMenorIdade, maiorSalarioMenorIdade, salarioMenorIdade, salarioMaiorIdade;
 public int idade=0;
  
public void salarios ( Scanner leitor )
{
System.out.println("\nDigite a idade:");
idade = leitor.nextInt();    

System.out.println("\nSalário:");
salario = leitor.nextDouble(); 

if (idade<18){
salarioMenorIdade = salario;
System.out.println ("É menor de idade!");
contMenor = contMenor + 1;
}
else if (idade>= 18){
salarioMaiorIdade = salario;
System.out.println ("É maior de idade!");
contMaior = contMaior + 1;
}
else{
System.out.println ("Idade Inválida!");
}


if( contMenor == 1){
menorSalarioMenorIdade = salarioMenorIdade ;
maiorSalarioMenorIdade = salarioMenorIdade ; 
}

if ( contMaior == 1) 
{
menorSalarioMaiorIdade = salarioMaiorIdade;
maiorSalarioMaiorIdade = salarioMaiorIdade;
}


if (salarioMenorIdade < menorSalarioMenorIdade){
menorSalarioMenorIdade = salarioMenorIdade;}
else if (salarioMenorIdade > maiorSalarioMenorIdade){
maiorSalarioMenorIdade = salarioMenorIdade;}

if (salarioMaiorIdade < menorSalarioMaiorIdade){
menorSalarioMaiorIdade = salarioMaiorIdade;}
else if (salarioMaiorIdade > maiorSalarioMaiorIdade){
maiorSalarioMaiorIdade = salarioMaiorIdade;
}

System.out.println("\nQuantidade de menores de idade:" + contMenor);
System.out.println("\nMenor Salário Menor Idade:" + menorSalarioMenorIdade);
System.out.println("\nMaior Salário Menor Idade:" + maiorSalarioMenorIdade);
System.out.println("\nQuantidade de maiores de idade:" + contMaior);
System.out.println("\nMenor Salário Maior Idade:" + menorSalarioMaiorIdade);
System.out.println("\nMaior Salário Maior Idade:" + maiorSalarioMaiorIdade);
}
    
}
