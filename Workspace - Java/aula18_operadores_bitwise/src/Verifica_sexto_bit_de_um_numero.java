
/*
 * Destrinchando o valor da mascara:
 * 0b: deve ser inserido sempre que formos colocar um valor binário
 * 00100000: é o binário de 32 com o segundo valor como "1", lido da direita pra esquerda nesse caso.
 * */

import java.util.Locale;
import java.util.Scanner;
public class Verifica_sexto_bit_de_um_numero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Códigio verifica se o sexto numero é '1'
		int mask = 0b00100000; // valor em bit do 32 
		int n = sc.nextInt();
		//System.out.println(n & mask);
		
		if ((n & mask) != 0) {
			System.out.println("6º bit é verdadeiro");
		}
		else {
			System.out.println("6º bit é Falso");
		}
		
		sc.close();
	}
}
