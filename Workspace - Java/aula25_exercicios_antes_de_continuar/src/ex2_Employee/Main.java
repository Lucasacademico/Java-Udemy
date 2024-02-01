package ex2_Employee;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Chamada de classe 
		Employee employee = new Employee();
		
		System.out.print("Type your name: ");
		employee.name = sc.nextLine();
		System.out.print("Type your gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Type the tax to remove: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.NetSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		
		System.out.println();
		System.out.println("Updated data: " + employee.name + ", $ " + employee.IncreaseSalary(percent));
		
		sc.close();
	}

}
