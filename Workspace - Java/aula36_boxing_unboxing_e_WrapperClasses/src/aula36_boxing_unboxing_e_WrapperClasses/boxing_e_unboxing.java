package aula36_boxing_unboxing_e_WrapperClasses;

public class boxing_e_unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BOXING
		int x = 20; // x cria espaço de memoria na memoria stack.
		Object obj = x; //obj encaixota o valor de x na memoria heap
		System.out.println(x);
		System.out.println(obj);
		
		// UNBOXING
		int y = (int) obj; // y recebe valor de obj com casting int
		System.out.println(y);
		
	}

}
