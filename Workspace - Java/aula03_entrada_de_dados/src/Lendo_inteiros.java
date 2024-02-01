
import java.util.Scanner;

public class Lendo_inteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc_int = new Scanner(System.in);
		
		int x;
		x = sc_int.nextInt();
		System.out.println("Você digitou: " + x);
		sc_int.close();
	}

}
