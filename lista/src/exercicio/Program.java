package exercicio;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
				
		int totalEmployee = scanner.nextInt();

		System.out.println("How many employees will be registered? "+totalEmployee);		
		
		for (int i = 0; i < totalEmployee; i ++) {
			System.out.println("Employee #"+(i)+":");

			System.out.println("Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Name: ");
			String name = scanner.nextLine();
			
			System.out.println("Salary: ");
			double salary = scanner.nextDouble();
			
			employees.add(new Employee(id, name, salary));

		}
	

		List<Employee> employeeSelected;

		do {

			System.out.println("Enter the employee id that will have salary increase: ");
			int idSelected = scanner.nextInt();
			
			employeeSelected = employees.stream().
					filter(employee -> employee.getId() == idSelected).
					collect(Collectors.toList());
			
			if(!(employeeSelected.size() >= 1)) {
				System.out.println("This id ("+ idSelected +") not exist!");
			}
			
		}while(!(employeeSelected.size() >= 1));
		
		System.out.println("Enter the percentage: ");
		
		double percentage = scanner.nextInt();

		employeeSelected.get(0).setPercentage(percentage);
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : employees) {
			
			System.out.println();
			System.out.println(employee.getId() +", " + employee.getName() + ", "+String.format("%.2f", employee.getSalary()));
			System.out.println();
		}

		
		scanner.close();
	}
	
}
