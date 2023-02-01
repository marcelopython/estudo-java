package application;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Department;
import entities.HoursContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);   

		
		System.out.println("Enter departmen's name: ");
		
		String nameDepartment = scanner.nextLine();
		
		Department department = new Department(nameDepartment);

		System.out.println("Enter worker data: ");
		
		System.out.println("Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Level: ");
		String level = scanner.nextLine();
		
		System.out.println("Base Salary: ");
		Double salary = scanner.nextDouble();
		
//		Set work
		Worker work = new Worker(name, WorkerLevel.valueOf(level), salary, department);
		
		
		System.out.println("How many contracts to this worker? ");

		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Integer totalContract = scanner.nextInt();
		
		for (int contract = 0; contract < totalContract; contract++) {
			
			System.out.println("Enter contract #"+(contract+1));
			
			System.out.println("Date (DD/MM/YYYY): ");
			scanner.nextLine();
			String date = scanner.nextLine();
			LocalDate localDate = LocalDate.parse(date, formater);  
			
			System.out.println("Value per hour: ");
			Double valuePerHours = scanner.nextDouble();
			
			System.out.println("Duration (hours): ");
			Integer hours = scanner.nextInt();
			
			work.addContract(new HoursContract(localDate, valuePerHours, hours));

		}
		
		scanner.nextLine();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String dateSearch = scanner.nextLine();
	
		System.out.println("Name: "+work.getName());
		System.out.println("Department: "+department.getName());
		System.out.println("Income for "+dateSearch+": "+String.format("%.2f", work.income(dateSearch)));
		
		
		scanner.close();
	}

}
