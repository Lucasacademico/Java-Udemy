package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank_corrigido;

public class Main_corrigido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank_corrigido bank;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)?");
		char choice = sc.next().charAt(0);
		
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			bank = new Bank_corrigido(number, holder, deposit);	
		}
		else {
			bank = new Bank_corrigido(number, holder);	
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.Deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.Withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
//		System.out.println(bank.getBalance());
//		System.out.println(bank.getHolder());
//		System.out.println(bank.getNumber());
//		
//		bank.setHolder("Lucas");
//		System.out.println(bank.getHolder());
		
		sc.close();
	}

}
