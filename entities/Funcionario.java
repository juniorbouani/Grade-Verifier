package entities;

public class Funcionario {

	private String name;
	private Integer id;
	private double salary;
	
	public Funcionario(String name, Integer id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	
	public void IncraseSalary(double percentage) {
		this.salary += salary * percentage / 100;
		
	}
	@Override
	public String toString() {
		return  id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
		}
	}
