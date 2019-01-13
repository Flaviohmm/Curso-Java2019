package entities;

public class Employee2 {
	private Integer id;
	private String name;
	private Double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalary() {
		return salary;
	}

	public Employee2(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	public String toString() {
		return id + ", " + name + ", "+ String.format("%.2f", salary);
	}

}
