import java.util.Locale;
import java.util.Scanner;

public class Operadores_Bitwise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Código simples de análise bitwise
		int n1 = 89;
		int n2 = 60;
		
		// Com os operadore bitwise, é gerado os numeros de conversão binária
		// ... de cada operador lógico e sua conversão.
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		sc.close();
	}
}
