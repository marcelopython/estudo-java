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
import entities.Work;
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
		Work work = new Work(name, WorkerLevel.valueOf(level), salary);
		
		
		System.out.println("How many contracts to this worker? ");
		
		List<HoursContract> hoursContract = new ArrayList<HoursContract>();


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
			
			hoursContract.add(new HoursContract(localDate, valuePerHours, hours)); 

		}
		
		
		scanner.nextLine();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String dateSearch = scanner.nextLine();
	
		LocalDate localDateSearch = LocalDate.parse("01/"+dateSearch, formater); 
		
		String parseLocalDateSearch = localDateSearch.getMonthValue()+"/"+localDateSearch.getYear();

		
		List<HoursContract> hoursContractSearched = hoursContract.stream()
			.filter(contract -> (String)(contract.getDate().getMonthValue()+"/"+contract.getDate().getYear()).intern() == parseLocalDateSearch.intern())
			.collect(Collectors.toList());

		Double amount = 0.0;
		
		for (HoursContract dataContract : hoursContractSearched) {
			
			amount += dataContract.totalValue();
			
		}
		
		System.out.println("Name: "+work.getName());
		System.out.println("Department: "+department.getName());
		System.out.println("Income for "+dateSearch+": "+ (work.getBaseSalary() + amount));
		
		
		scanner.close();
	}

}
