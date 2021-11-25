/*
Objetivo:

Treinar e aprimorar lógica

Descrição do Exercício:

Realizar a leitura dos números e definir qual é o maior

Legenda:

a: Primeiro número

b: Segundo número

*/

import java.util.Scanner;

public class OrdemNumerica
{  
  public static void main(String args[])
  {
    
    Scanner input = new Scanner(System.in);
    
    int a, b
      
    System.out.print("Digite o primeiro número que vier na sua cabeça: ");

    a = input.nextInt();
    
    System.out.print("Digite o segundo número que vier na sua cabeça (Que seja diferente do primeiro): ");

    b = input.nextInt();
    
    if (a > b)
    {
      System.out.println("O primeiro número é maior que o segundo"); 
    }
    else
    {
      System.out.println("O Segundo número é maior que o primeiro");
    }   
  }
}
