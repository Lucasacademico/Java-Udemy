
/*
 * Destrinchando o valor da mascara:
 * 0b: deve ser inserido sempre que formos colocar um valor bin�rio
 * 00100000: � o bin�rio de 32 com o segundo valor como "1", lido da direita pra esquerda nesse caso.
 * */

import java.util.Locale;
import java.util.Scanner;
public class Verifica_sexto_bit_de_um_numero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// C�digio verifica se o sexto numero � '1'
		int mask = 0b00100000; // valor em bit do 32 
		int n = sc.nextInt();
		//System.out.println(n & mask);
		
		if ((n & mask) != 0) {
			System.out.println("6� bit � verdadeiro");
		}
		else {
			System.out.println("6� bit � Falso");
		}
		
		sc.close();
	}
}
