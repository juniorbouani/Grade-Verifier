package entities;

public class Employee {
	
	
	public String name;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary - 1000;
	}
	
	public void IncreseSalary(double percentage) {
		this.GrossSalary  += GrossSalary * percentage / 100;
		}
	
	public String toString() {
		return name + " , $ " + NetSalary();
			}

}
	
		
		
