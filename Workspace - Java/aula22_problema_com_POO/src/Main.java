import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo; // Importado a classe do Triangulo entidade

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y; // Variaveis para a classe tipo triângulo
		x = new Triangulo(); // Objeto criado para a variavel x
		y = new Triangulo(); // Objeto criado para a variavel y
		
		// lendo dados para a classe triângulo
		System.out.println("Digite as medidas do Triângulo x: ");
		//x é a variavel instanciada da classe triangulo inserindo no atributo "a,b,c" da classe
		x.a = sc.nextDouble(); 
		x.b = sc.nextDouble(); 
		x.c = sc.nextDouble(); 
		
		System.out.println("Digite as medidas do Triângulo y: ");
		//y é a variavel instanciada da classe triangulo inserindo nos atributos "a,b,c" da classe
		y.a = sc.nextDouble(); 
		y.b = sc.nextDouble(); 
		y.c = sc.nextDouble();
		
		// Perimetro
		double p1 = (x.a + x.b + x.c) / 2;
		double p2 = (y.a + y.b + y.c) / 2;
		
		double area1 = Math.sqrt((p1*(p1-x.a)*(p1-x.b)*(p1-x.c)));
		double area2 = Math.sqrt((p2*(p2-y.a)*(p2-y.b)*(p2-y.c)));
		
		// Display das áreas triangulos
		display(area1, area2);

		sc.close();
	}
	
	// Criando função para o if
	public static void display(double d1, double d2) {
		if (d1 > d2) {
			System.out.println("Área maior: Triângulo X");
		}
		else {
			System.out.println("Área maior: Triângulo Y");
		}
	}
}
