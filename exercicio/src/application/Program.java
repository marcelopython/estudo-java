package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.name = scanner.nextLine();
		
		boolean nota1 = false, nota2 = false, nota3 = false;
		
		do {
			nota1 = aluno.setNota1(scanner.nextDouble());	
		} while (!nota1);
		

		do {
			nota2 = aluno.setNota2(scanner.nextDouble());
		} while (!nota2);
		

		do {
			nota3 = aluno.setNota3(scanner.nextDouble());
		} while (!nota3);
		
		System.out.println(aluno);
		
	}
	
}
