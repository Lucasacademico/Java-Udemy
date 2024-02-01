package aplication;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.employee6;
import java.util.List;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee6> employee = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ": ");
			
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee6 employeeData = new employee6(name, id, salary);
			employee.add(employeeData);
		}
		
		System.out.println();
		System.out.print("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double percent = sc.nextDouble();
		
		for(employee6 raise : employee) {
			if (raise.getId() == id) {
				double totalSal = raise.getSalary() + ((raise.getSalary() * percent) / 100);
				raise.setSalary(totalSal);
				break;
			}
		}
		
		System.out.println("\nList of employees:");
		for (employee6 print : employee) {
			System.out.println(print.getId() + ", " + print.getName() + ", " + print.getSalary());
		}
		
		sc.close();
	}

}
