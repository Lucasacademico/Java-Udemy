package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank();
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		bank.setAccount(account); //
		sc.nextLine(); // Consumir o caractere de quebra de linha pendente
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		bank.setHolder(holder); 
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char verify = sc.next().charAt(0);
		
		if (verify == 'y') {		
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			bank.Deposit(deposit);
			System.out.println();
			System.out.println("Account data: ");	
			bank.toString();
		} 
		else if (verify == 'n') {
			System.out.println();
			System.out.println("Account data: ");	
			System.out.println(bank.toString());
		}
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.Deposit(deposit);
		System.out.println("Updated account data: ");	
		System.out.println(bank.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.Withdraw(withdraw);
		System.out.println("Updated account data: ");	
		System.out.println(bank.toString());
		
		sc.close();
	}

}