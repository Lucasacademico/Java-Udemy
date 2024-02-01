package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee6;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee6> employee = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ": ");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee6 employData = new employee6(name, id, salary);
			employee.add(employData);
			
		}
		
		System.out.print("Entre com o ID do funcionario que terá aumento: ");
		int id = sc.nextInt();
		
		System.out.print("Informe a porcentagem de aumento: ");
		double percent = sc.nextDouble();
		
		for (employee6 aumento : employee) {
			if(aumento.getId() == id) {
				double aumentoSalario = aumento.getSalary() + ((aumento.getSalary() * percent) / 100);
				aumento.setSalary(aumentoSalario);
				break;
			}
		}
		
		System.out.println("\nLista de funcionários:");
		for (employee6 imprimir : employee) {
            System.out.println(imprimir.getId() + ", " + imprimir.getId() + ", " + imprimir.getSalary());
        }
		
		sc.close();
	}

}
