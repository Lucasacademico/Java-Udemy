import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_diferenca_horas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e a hora inicial: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result;
		
		if (x == 0 && y == 0) {
			System.out.println("O jogo durou 24 horas");
		}
			
		else if (x < y) {
			result = y - x;
			System.out.printf("O jogo durou %d horas", result);	
		}
			
		else {
			result = (24 - x) + y;
			System.out.printf("O jogo durou %d horas", result);
		}
				
		sc.close();
	}
}
