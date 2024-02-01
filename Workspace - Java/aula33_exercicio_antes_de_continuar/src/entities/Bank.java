package entities;

public class Bank {
	private int account;
	public String holder;
	private double balance;
	
	public void setAccount(int account) {
		this.account = account;
	}
	
	public int getAccount() {
		return account;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Métodos
	public double Deposit(double deposit) {
		return balance = balance + deposit;
	}
	
	public double Withdraw(double withdraw) {
		return balance = (balance - withdraw) - 5.00;
	}
	
	public String toString() {
		return "Account: " + getAccount() + ", Holder: " + getHolder() + ", Balance: $" + getBalance();
	}
	
}




