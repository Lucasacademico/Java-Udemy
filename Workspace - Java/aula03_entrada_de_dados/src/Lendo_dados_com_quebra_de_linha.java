import java.util.Locale;
import java.util.Scanner;

public class Lendo_dados_com_quebra_de_linha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x, y, z;
		
		// nextLine possibilita receber multiplas strings com espaço
		// Também possibilita receber strings separadas, apertando o enter e inserindo a proxima
		x = sc.nextLine(); 
		y = sc.nextLine();
		z = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
