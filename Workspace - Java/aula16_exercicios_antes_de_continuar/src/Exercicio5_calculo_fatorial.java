import java.util.Scanner;
import java.util.Locale;

public class Exercicio5_calculo_fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i = 1; i <= n; i++) {	
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}
}

