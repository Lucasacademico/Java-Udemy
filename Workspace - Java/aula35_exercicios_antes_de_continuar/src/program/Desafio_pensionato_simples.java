package program;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_pensionato_simples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos estudantes vão alugar os quartos? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
 		String[] email = new String[n];
 		int[] room = new int[n];
		
		
		for(int i = 0; i < room.length; i++) {
			System.out.println("Rent #"+ (i + 1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Email: ");
			email[i] = sc.next();
			System.out.print("Room: ");
			room[i] = sc.nextInt();
			System.out.println();
			
		}
		
		
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < room.length; i++) {
			System.out.printf("\n %d: %s, %s", room[i], name[i], email[i]);
		}
		
		sc.close();
	}
}
