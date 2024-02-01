package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.rent;

public class pencionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rent[] vect = new rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
		}
		
		sc.close();
	}

}
