package application;

import java.util.Scanner;

import servicies.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("How many value? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int value = sc.nextInt();
			ps.addValue(value);
			
		}
		
		ps.print();
		System.out.println(" First: "+ ps.first());
		System.out.println();
		
		PrintService<String> psString = new PrintService<>();
		
		System.out.println("How many value? ");
		int n2 = sc.nextInt();
		
		for(int i = 0; i < n2; i++) {
			
			String value = sc.next();
			psString.addValue(value);
			
		}
		
		psString.print();
		System.out.println(" First: "+ psString.first());
		
		sc.close();
		
		
	}
	
}
