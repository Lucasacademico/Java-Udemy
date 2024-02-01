import java.util.Locale;
import java.util.Scanner;

public class Operadores_Bitwise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// C�digo simples de an�lise bitwise
		int n1 = 89;
		int n2 = 60;
		
		// Com os operadore bitwise, � gerado os numeros de convers�o bin�ria
		// ... de cada operador l�gico e sua convers�o.
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		sc.close();
	}
}
