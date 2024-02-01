
public class Funcoes_de_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		// Fun��es de formata��o
		String s01 = original.toLowerCase();// Converte para letras Minuculas
		String s02 = original.toUpperCase();// Converte para letras Maiusculas
		String s03 = original.trim();// Elimina espa�os nos cantos da string
		String s04 = original.substring(2);// Pega a string a partir de uma posi��o 2 e imprime o restante
		String s05 = original.substring(2, 9);// Pega a string a partir de uma posi��o 2 at� a posi��o ABAIXO do 9 (8) e imprime
		String s06 = original.replace("a", "x"); // Troca um char por outro
		String s07 = original.replace("abc", "xyz"); // Usando para trocar parte de strings por outro valor
		
		// Fun��o de index de strings
		int i = original.indexOf("abc"); // verifica a primeira posi��o do substring 'abc'
		int j = original.lastIndexOf("abc"); // verifica a ultima posi��o do substring 'abc'
		
		
		// Sa�das
		System.out.println("Original: " + s01 + "-");
		System.out.println("toLowerCase: " + s01 + "-");
		System.out.println("toUpperCase: " + s02 + "-");
		System.out.println("trim: " + s03 + "-");
		System.out.println("substring(2): " + s04 + "-");
		System.out.println("substring(2, 9): " + s05 + "-");
		System.out.println("replace(a, x): " + s06 + "-");
		System.out.println("replace(abc, xyz): " + s07 + "-");
		System.out.println("indexOf(abc): " + i);
		System.out.println("lastIndexOf(abc): " + j);
		
		
		
	}

}
