

import java.util.Locale;

public class Declarando_variaveis {

	public static void main(String[] args) {
		
		// Declarando e imprimindo inteiros
		int x = 32;
		System.out.println(x);
		
		// Declarando e imprimindo reais
		double y = 10.35784;
		System.out.println(y);
		
		// Formantando casas decimais com PRINTF
		System.out.printf("%.2f%n", y); // %n quebra linha no printf
		System.out.printf("%.4f%n", y);
		
		// Trocar , por .
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", y);
		System.out.printf("%.2f%n", y);
	}

}
