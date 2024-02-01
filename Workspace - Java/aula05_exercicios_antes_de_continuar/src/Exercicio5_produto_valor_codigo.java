import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_produto_valor_codigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Leitura Variaveis produto 1
		//String cod1 = sc.next();
		int qtd_pecas1 = sc.nextInt();
		double valor_peca1 = sc.nextDouble();
		
		// Leitura Variaveis produto 2
		//String cod2 = sc.next();
		int qtd_pecas2 = sc.nextInt();
		double valor_peca2 = sc.nextDouble();
		
		// Soma total de peças compradas
		double valor_final = (qtd_pecas1 * valor_peca1) + (qtd_pecas2 * valor_peca2);
		
		// Imprimindo o valor final
		System.out.printf("Valor a pagar: %.2f", valor_final);
		
		sc.close();
	}

}
