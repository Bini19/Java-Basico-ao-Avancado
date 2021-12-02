
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt(); //Quantidade de casos de teste

        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt(); //Quantidade de casas no tabuleiro
            double quantidadeGraos = 1;
            double kg;

            for(int c=1; c <= x; c++){
                if(x > 1){
                    quantidadeGraos = quantidadeGraos * 2;
                }
            }

            kg =  Math.floor(quantidadeGraos / 12000); //Math floor retorna o maior inteiro menor ou igual a um número
            System.out.printf("%.0f kg\n", kg);
        }

        sc.close();
    }
}