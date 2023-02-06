package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void mani(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do contrato: ");
		
		System.out.print("Numero: ");
		int number = sc.nextInt() ;
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		
		double totalValue = sc.nextDouble();
		
		Contract contrat = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int isntallments = sc.nextInt();

		
		sc.close();
		
	}
	
}
