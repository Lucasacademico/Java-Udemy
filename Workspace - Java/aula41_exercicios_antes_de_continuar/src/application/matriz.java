package application;

import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o quantidade de linhas e colunas da matriz: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		System.out.println("Digite os valores da matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nDigite um valor da matriz existente: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.print("\nPosição: " + i + "," + j);
					if(j > 0) {
						System.out.print("\nEsquerda: "+ matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.print("\nCima: "+ matriz[i-1][j]);
					}
					if(j < matriz[i].length - 1) {
						System.out.print("\nDireita: "+ matriz[i][j+1]);
					}
					if (i < matriz.length - 1) {
						System.out.print("\nBaixo: "+ matriz[i+1][j]);
					}
						
				}
			}
		}
	
		sc.close();
	}

}
