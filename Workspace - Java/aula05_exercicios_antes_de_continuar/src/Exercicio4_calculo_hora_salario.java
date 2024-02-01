import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_calculo_hora_salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num_fun = sc.nextInt();
		double hora_trabalho = sc.nextDouble();
		double hora_salario = sc.nextDouble();
		double salario = hora_trabalho * hora_salario;
		
		System.out.printf("Number: %d%n", num_fun);
		System.out.printf("Salary: U$ %.2f", salario);
		
		sc.close();
	}

}
