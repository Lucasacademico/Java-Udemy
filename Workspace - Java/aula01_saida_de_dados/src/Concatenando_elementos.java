import java.util.Locale;

public class Concatenando_elementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Concatenando com println
		double x = 22.3453; // var declarada
		Locale.setDefault(Locale.US); // Setando localidade para US para usar . em vez de ,
		System.out.println("Resultado = " + x + " Metros");
		
		// Concatenando com printf
		System.out.printf("Resultado = %.2f Metros", x); // concatenado com printf e valor formatado
	}

}
