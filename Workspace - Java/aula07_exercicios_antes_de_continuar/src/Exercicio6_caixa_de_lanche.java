import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_caixa_de_lanche {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cod1 = 4.00;
		double cod2 = 4.50;
		double cod3 = 5.00;
		double cod4 = 2.00;
		double cod5 = 1.50;
		
		System.out.println("Digite o código do produto e a quantidade: ");
		int escolha = sc.nextInt();
		int qtd = sc.nextInt();
		
		double total;
		
		if (escolha == 1) {
			total = qtd * cod1;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else if (escolha == 2) {
			total = qtd * cod2;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else if (escolha == 3) {
			total = qtd * cod3;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else if (escolha == 4) {
			total = qtd * cod4;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else if (escolha == 5) {
			total = qtd * cod5;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else {
			System.out.println("Código inexistente");
		}
		
		sc.close();
	}
}
