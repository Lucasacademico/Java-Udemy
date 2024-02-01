package aula38_listas;

import java.util.ArrayList; // devemos importar a interface ArrayList
import java.util.List; // devemos importar a lista
import java.util.stream.Collectors;

public class lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declarando uma lista com wrapper class e instanciando uma interface ArrayList
		List<String> list = new ArrayList<>();

		// Adicionando Strings na lista
		list.add("Lucas");
		list.add("Lia");
		list.add("Leleco");
		list.add("Lala");
		list.add("Nagila");
		list.add("Naruto");
		list.add("Fernando");
		list.add("Bianca");
		list.add(2, "Marco"); // adicionando um valor em uma posição especifica.
		list.add("Bobo");
		list.add("Biro");
		list.add("Barnacol");
		
		// Verificando o tamanho de uma lista
		System.out.println(list.size());
		
		// Imprimindo valores de uma lista
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");

		// Removendo um elemento de uma lista por String
		list.remove("Marco");
				
		// Removendo um elemento de uma lista por posição
		list.remove(2);
		
		// Remover elementos por predicado B
		list.removeIf(x -> x.charAt(0) == 'B'); // Lê se: remove elemento SE a letra 0 for igual à 'B'.
		// Isso é uma função Lambda, que veremos no futuro.
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		
		// verificando a posição de um valor existente na lista pelo seu index nome
		System.out.println("Index of Nagila: " + list.indexOf("Nagila")); 
		
		// verificando a posição de um valor existente na lista pelo seu index nome
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // Elementos não encontrados retornam -1.
		
		System.out.println("-------------------------");
		
		// Gerando uma nova lista com integrantes de um predicado N
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'N').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		
		// Imprimindo o primeiro nome com a letra N
		String name = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);
		// Se não encontrar, devolve Null.
		
		System.out.println(name);
		/*Observações:
		 * O instanciamento de uma lista deve ser com uma interface list (ex: ArrayList)
		 * */
	}

}
