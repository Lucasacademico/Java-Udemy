
import java.util.Scanner;
public class exercicio2_area_do_circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			double pi = 3.14159;
			double raio = sc.nextDouble();
			double area = pi * Math.pow(raio, 2);
			System.out.printf("Área = %.4f", area);
		
		sc.close();
	}

}
