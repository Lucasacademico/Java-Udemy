package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do Matriz: ");
		int n = sc.nextInt();
		
		// Declaração da matriz
		int[][] matriz = new int[n][n];
		
		System.out.println("Digite os valores da matriz de tamanho " + n + " x " + n + ": ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Lendo valores para a matriz[i][j]
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Main Diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.print("\nNegative numbers: " + count);
	
		
		sc.close();
	}

}
