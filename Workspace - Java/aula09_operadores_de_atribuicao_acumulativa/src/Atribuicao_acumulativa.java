/*
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
 * dá direito a 100 minutos de telefone. Cada minuto que exceder a 
 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a 
 * quatidade de minutos que uma pessoa consumiu, daí mostrar o valor
 * a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Atribuicao_acumulativa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Variavel verifica a quantidade minutos consumida.
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			// Atribuição acumulativa de soma, funciona pra outras operações.
				// conta = conta + (minutos - 100) * 2;
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("Valor da conta = %.2f", conta);
		
		sc.close();
	}
}
