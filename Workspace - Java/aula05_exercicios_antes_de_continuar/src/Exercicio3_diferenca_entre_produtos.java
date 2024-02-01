import java.util.Locale;
import java.util.Scanner;
public class Exercicio3_diferenca_entre_produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int DIFERENCA = ((A * B) - (C * D));
		System.out.printf("DIFERENÇA = %d", DIFERENCA);
		
		sc.close();
	}

}
