package entities;

public class BankCount {
	
	private String holder;
	private int number;
	private double balance;
	
	public BankCount(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}

	public BankCount(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public String toString() {
		return "Account "
				+number
				+", Holder: "
				+ holder
				+", Balance: "
				+String.format("%.2f", balance);
				
	}

	
	

}

	