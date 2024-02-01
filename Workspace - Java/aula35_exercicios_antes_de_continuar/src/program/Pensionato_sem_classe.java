package program;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato_sem_classe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos estudantes vão alugar os quartos? ");
		int n = sc.nextInt();
		
		String[] name = new String[10];
 		String[] email = new String[10];
 		int[] room = new int[10];
 		
 		int number = 0;
 		String person;
 		String end;
 		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #"+ (i + 1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			person = sc.nextLine();
			System.out.print("Email: ");
			end = sc.next();
			System.out.print("Room: ");
			number = sc.nextInt();
			
			name[number] = person;
			email[number] = end;
			room[number] = number;
			
			System.out.println();
				
		}
		
		
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < room.length; i++) {
			if (name[i] != null) {
				System.out.printf("\n %d: %s, %s", room[i], name[i], email[i]);
			}
		}
		
		sc.close();
	}
}