package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee> employ = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee employData = new employee(id, name, salary);
			employ.add(employData);
			
		}
		
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idAumento = sc.nextInt();
		
		System.out.print("Digite a porcentagem de aumento do salario: ");
		double porcentAumento = sc.nextDouble();
		
		for(employee aumento : employ) {
			if(aumento.getId() == idAumento) {
				double novoSalario = aumento.getSalary() * (1 + porcentAumento / 100);
				aumento.setSalary(novoSalario);
				break;
			}
		}
	
		System.out.println("\nLista de funcionários:");
		for (employee imprimir : employ) {
            System.out.println(imprimir.getId() + ", " + imprimir.getId() + ", " + imprimir.getSalary());
        }
		
		sc.close();
	}

}
