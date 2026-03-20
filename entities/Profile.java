package entities;

public class Profile {
	
	private String holder;
	private int number;
	private double value;
	
	// builders
	
	public Profile() {
		
	}
	public Profile (String holder, int number, double value) {
		this.holder = holder;
		this.number = number;
		this.value = value;
	}
	
	public Profile (String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
		
	}
	
	public int getNumber() {
		return number;
		
	}
	
	public double getValue() {
		return value;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
		
	}
	
	public void setValue(double amount) {
		this.value = amount;
		
	}
	
	// methods
	
	public double Deposite(double v) {
		return value += v;
		}
	
	public double Withdraw(double y) {
		return value -= ( y + 5);
	}
	
	public String toString() {
		return "Account " + number
					+ ", "
					+ "Holder: " + holder
					+ ", "
					+ "Balance: " + value;
	}





}


