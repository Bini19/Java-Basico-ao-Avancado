/*

Objetivo:

Treinar e aprimorar lógica

Descrição do Exercício:

Escrever um programa que tenha como entrada um número "X" e imprima-o, caso for maior que 15.

*/

import java.util.Scanner;

public class Exercicio7 
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    int num;
    
    System.out.print("Digite um número: ");
    
    num = input.nextInt();
    
    if (num >= 15)
    {
      System.out.print("Número " + num + " é maior que 15"); 
    }
    else 
    {
      if (num < 15)
      {
        System.out.print("Número " + num + " é menor que 15");
      }
    }
  }
}
