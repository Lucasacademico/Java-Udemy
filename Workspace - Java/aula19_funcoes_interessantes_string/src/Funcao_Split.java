
public class Funcao_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "potato apple lemon orange";
		
		// Criamos um vetor para armazenar as palavras separada//
		String[] vect = s.split(" "); // o separador é o espaço (" ")
		
		//imprimindo as palavras separadamente
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
