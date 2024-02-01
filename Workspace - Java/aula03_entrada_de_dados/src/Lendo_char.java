import java.util.Scanner;

public class Lendo_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0); //charAt(0) - Pega somente o primeiro caracter da string digitada
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}
