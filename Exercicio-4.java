/* 

Objetivo:

Treinar e aprimorar lógica

Descrição do Exercício:

Fazer a leitura das informações e realizar o cálculo da QUANTIDADE de tinta necessária para pintar o muro.

Legenda:

am: Altura do Muro

lm: Largura do Muro

tl: Tinta por Litro

tm: Tinta por Metro

*/


public class Muro {
    public static void main(String[] args) {
        double am, lm, tl, tm, qtd;

        am = 2.0;
        lm = 1.4;
        tl = 10.0;
        tm = 0.5;

        qtd = (am * lm) / (tl * tm);

        System.out.println("Quantidade de tinta necessária para pintar o muro: " + qtd);     
    }
}
