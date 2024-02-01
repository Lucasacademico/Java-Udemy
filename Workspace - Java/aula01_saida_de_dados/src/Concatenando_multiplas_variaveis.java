import java.util.Locale;

public class Concatenando_multiplas_variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declarando variaveis
		String nome = "Lucas";
		int idade = 29;
		double renda = 223.345;
		
		// Inserindo Locale para uso de formatação americana de pontuação
		Locale.setDefault(Locale.US);
		
		// Concatenado variaveis com println
		System.out.println(nome + " tem " + idade + " anos e ganha R$ " + renda + " reais.");
		
		// Concatenando variaveis com printf
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);
	}

}
