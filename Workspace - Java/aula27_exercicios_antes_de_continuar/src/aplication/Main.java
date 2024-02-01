package aplication;

import java.util.Locale;
import java.util.Scanner;
import Util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		CurrencyConverter.DollarConverter(quantity, price);
	
		System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.Total(quantity, price));
		
		sc.close();
	}

}
