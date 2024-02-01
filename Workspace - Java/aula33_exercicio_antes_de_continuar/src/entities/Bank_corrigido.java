package entities;

public class Bank_corrigido {

	private int number;
	private String holder;
	private double balance;
	
	//CONSTRUTORES
	public Bank_corrigido(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Bank_corrigido(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		Deposit(initialDeposit);
	}
	
	// GETS e SETS
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//MÉTODOS CALCULOS
	public void Deposit(double deposit) {
		balance = balance + deposit;
	}
	
	public void Withdraw(double withdraw) {
		balance -= withdraw + 5.00;
	}
	
	//MÉTODO TOSTRING
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: "
				+ String.format("%.2f", balance);
	}
}
