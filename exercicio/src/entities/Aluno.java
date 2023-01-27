package entities;

public class Aluno {

	
	public String name;
	
	private double nota1;

	private double nota2;
	
	private double nota3;
	
	public double calcNota() {
		
		return this.nota1 + this.nota2 + this.nota3; 
		
	}
	
	public double getNota1() {
		return this.nota1;
	}

	public double getNota2() {
		return this.nota2;
	}

	public double getNota3() {
		return this.nota3;
	}
	
	public boolean setNota1(double nota1) {
		
		if(nota1 > 30.0) {
			System.out.println("cannot be greater than 30.00!");
			System.out.println();
			return false;
		}

		this.nota1 = nota1;
		return true;
		
	}

	public boolean setNota2(double nota2) {

		if(nota2 > 35.0) {
			System.out.println("cannot be greater than 35.00!");
			return false;
		}
		
		this.nota2 = nota2;
		return true;

	}

	public boolean setNota3(double nota3) {

		if(nota3 > 35.0) {
			System.out.println("cannot be greater than 35.00!");
			return false;
		}
		
		this.nota3 = nota3;
		return true;

	}
	
	public double getMissingPoints() {
		return (60.0 - this.calcNota());
	}
	
	
	public String toString() {
		
		double finalNota = this.calcNota();
		
		if(finalNota >= 60.0) {
	
			return "FINAL GRADE = " + String.format("%.2f", finalNota)
					+ "\n"
					+ "PASS";
		}
		
		return "FINAL GRADE = " + String.format("%.2f", finalNota)
				+ "\n"
				+ "FAILED"
				+ "\n"
				+ "MISSING "+ String.format("%.2f", this.getMissingPoints()) +" POINTS";
		
	}
	
	
}
