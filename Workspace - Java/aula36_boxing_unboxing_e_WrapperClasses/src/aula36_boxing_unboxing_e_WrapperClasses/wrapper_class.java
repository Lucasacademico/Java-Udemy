package aula36_boxing_unboxing_e_WrapperClasses;

public class wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WRAPPER CLASS
		int x = 20;
		Integer obj = x; // � um tipo primitivo equivalente � classes
		System.out.println(obj);
		
		int y = obj * 2; // com o uso do Integer, n�o precisamos fazer o casting.
		System.out.println(y);
		
		// OBS: Wrapper classes geralmente s�o em maiusculos (ex: int = Integer, boolean = Boolean...)
		
		/*
		 * O uso de wrapper class pode ser utilizado em variaveis de classes, e isso � importante
		 * pois aceita o valor nulo, e isso poder� ser utilizado em um programa.
		 * */
		
	}

}
