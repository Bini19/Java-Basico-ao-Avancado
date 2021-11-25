/*

Objetivo:

Treinar e aprimorar lógica

Descrição do Exercício:

Calcular quantos carros são necessários para que possa empurar uma quantidade "X" de massa em "Y" de altura em "Z" de tempo em segundos

Legenda:

X: Massa

Y: Altura

Z: Tempo em segundos

*/


public class Carros {
    public static void main(String[] args) {
        double x, y, z, carros;
        x = 21;
        y = 2.2;
        z = 1.4;

        carros = (x * y / z) / 191.0200;

        System.out.println("A quantidade de carros necessários é: " + carros);
    }
}
