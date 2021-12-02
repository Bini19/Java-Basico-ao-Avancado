import java.io.IOException;
import java.util.Scanner;

public class Teste{
	
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		String msg;
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		int H = leitor.nextInt();
		int L = leitor.nextInt();
		
		if( B <= H && A <= L){msg = "S";
        }else if (C <= H && A <= L){msg = "S";
        }else if ( A <= H && C <= L){msg = "S";
        }else msg = "N";

        System.out.println(msg);
        leitor.close();
    }
}