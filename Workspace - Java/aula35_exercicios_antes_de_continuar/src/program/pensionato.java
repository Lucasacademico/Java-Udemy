package program;

import java.util.Locale;
import java.util.Scanner;

import entities.rent;

public class pensionato {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rent[] vect = new rent[10];
		
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int number = sc.nextInt();
			
			vect[number] = new rent(name, email);
			
		}

		System.out.println();
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.printf("%d : %s", i, vect[i]);
				System.out.println();
			}
		}
		
		sc.close();
	}
}