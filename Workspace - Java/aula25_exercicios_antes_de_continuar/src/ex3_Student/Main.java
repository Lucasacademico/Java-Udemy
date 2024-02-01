package ex3_Student;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Type the student name: ");
		student.name = sc.nextLine();
		System.out.print("Type N1: ");
		student.n1 = sc.nextDouble();
		System.out.print("Type N2: ");
		student.n2 = sc.nextDouble();
		System.out.print("Type N3: ");
		student.n3 = sc.nextDouble();
		
		student.Aprovacao();
			
		sc.close();
	}

}
