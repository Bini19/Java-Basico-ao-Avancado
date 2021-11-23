/*
Objetivo:

Treinar e aprimorar lógica

Descrição do Exercício:

Realizar uma conversão de Graus Celsius para Fahrenheit.

Legenda:

Gc = Graus Celsius

F = Fahrenheit

*/

import java.util.Scanner; 

public class Termometro
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    double Gc, F;
    
    System.out.print("Digite alguma temperatura (Graus Celsius) para conversão em Fahrenheit:" );
  
    Gc = input.nextDouble();
    
    F = (Gc * 9/5) + 32;
    
    System.out.printf("Conforme solicitado, aqui esta a sua conversão para Fahrenheit:" + F); 
  
  }
}
