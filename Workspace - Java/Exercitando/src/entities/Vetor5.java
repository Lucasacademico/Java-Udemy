package entities;
import java.util.Scanner;

public class Vetor5 {
	Scanner sc = new Scanner(System.in);

	private String name;
	private double price;
	
	// CONSTRUTOR
	public Vetor5 (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	// GET e SET
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPreco(double price) {
		this.price = price;
	}
	
	public double getPreco() {
		return this.price;
	}
	
	
	
	
}
