import java.util.Locale;
import java.util.Scanner;

public class Quebra_de_linha_pendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		String w, y, z;
		
		x = sc.nextInt();
		sc.nextLine(); // nextLine sem var: Isso é necessário, para o valor inteiro consuma a quebra de linha
		w = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(w);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
