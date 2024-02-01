import java.util.Locale;
import java.util.Scanner;

public class Lendo_multiplos_tipos_na_mesma_linha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US); // Habilita entrada de decimal com ponto (deve ficar antes do scanner).
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double w;
		char z;
		
		x = sc.next(); //Lendo String
		y = sc.nextInt();
		w = sc.nextDouble();
		z = sc.next().charAt(0);
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(w);
		System.out.println(z);
		
		sc.close();
	}

}
