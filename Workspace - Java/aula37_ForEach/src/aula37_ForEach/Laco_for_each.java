package aula37_ForEach;

public class Laco_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vetor = new String[] {"Maria", "Bob", "Alex"};
		
		// Usando o Laço FOR
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("------------------------");
		
		// Usando o laço FOR EACH
		for(String obj : vetor) {
			System.out.println(obj);
		}
		
	}

}
