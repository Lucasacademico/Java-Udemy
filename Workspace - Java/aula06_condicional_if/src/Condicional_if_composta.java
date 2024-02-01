import java.util.Locale;
import java.util.Scanner;

public class Condicional_if_composta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora < 12) 
			System.out.println("Bom dia");
		else if (hora >= 12 && hora < 18) 
			System.out.println("Boa tarde");
		else 
			System.out.println("Boa noite");
			
			sc.close();
	}

}
