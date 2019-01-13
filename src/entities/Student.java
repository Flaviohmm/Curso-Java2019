package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double grade() {
		return nota1 + nota2 + nota3;
	}

	public String missing() {
		if (grade() < 60) {
			double missing = 60 - grade();
			return String.format("MISSING %.2f POINTS", missing);
		}
		return missing();	
	}
}
