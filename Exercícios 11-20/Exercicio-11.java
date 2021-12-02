import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {
            double graus = leitor.nextDouble();

            if (graus <= 360) {
                if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");

                else if (graus >= 90 && graus < 180) System.out.println("Boa Tarde!!");
                else if (graus >= 180 && graus < 270) System.out.println("Boa Noite!!");
                else System.out.println("De Madrugada!!");


                Double horas;
                if (graus >= 270) {
                    horas = ((graus*24/360) + 6) - 24;
                } else {
                    horas = graus*24/360 +6;
                }

                Double minutos = (horas - (horas.intValue())) * 60.0;
                Double segundos = ( minutos - (minutos.intValue())) * 60.0;

                if (segundos > 59) {
                    segundos = 0.0;
                    minutos += 1.0;
                }

                System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
            }
        }
    }
}