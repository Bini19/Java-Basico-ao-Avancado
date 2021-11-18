/*

Objetivo:

Treinar e aprimorar lógica

Descrição do Exercício:

Fazer a leitura das variáveis, exibindo na tela a mensagem contendo o resultado, sendo que o volume será com base no π (PI) com o valor de 3.14159

Legenda:

V: Volume

R: Raio

A: Altura
  
*/

public class TorreLitrao {
    public static void main(String[] args) {
        double V, R, A;
        R = 1.9;
        A = 20.02;

        V = 3.14159 * R * R * A;
        System.out.println("O volume da torre de litrão é de " + V + " m³");
    }
}
