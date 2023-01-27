package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConversion;

public class Conversion {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double quotation, amount, amountBrl;
		
		System.out.println("What is the dollar price? ");
		System.out.println();
		quotation = scanner.nextDouble();

		System.out.println("How many dollars will be bought? ");
		System.out.println();
		amount = scanner.nextDouble();
		
		amountBrl = CurrencyConversion.conversionToBRL(quotation, amount);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", amountBrl));
		System.out.println();
		
		scanner.close();
		
	}

}
