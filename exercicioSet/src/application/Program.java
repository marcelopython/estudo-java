package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.LogEntry;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
//		log();
		
				
		Course coursoA = new Course("Curso A");
		coursoA.setSudent(new Student("Marcelo silva"));
		coursoA.setSudent(new Student("Sueide silva"));

		
		Course coursoB = new Course("Curso B");
		coursoB.setSudent(new Student("David silva"));
		coursoB.setSudent(new Student("Sueide silva"));
		coursoB.setSudent(new Student("Marcelo silva"));
		
		Course coursoC = new Course("Curso C");
		coursoC.setSudent( new Student("Davidson silva"));
		coursoC.setSudent(new Student("Marcelo silva"));
		
		Course[] coursers = {coursoA, coursoB, coursoC};

		Set<Student> students = new HashSet<>();
		
		for(Course courser : coursers) {
			students.addAll(courser.getSudent());	
		}
		
				
		System.out.println("Possue o total de "+students.size()+" alunos ");
		
	}
	
	public static void log() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			HashSet E mais rapido e não vou precisar de ordenamento 
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment));
				
//				Mando ler a proxima linha
				line = br.readLine();
				
			}
			
			System.out.println("Total users: " + set.size());
			
			
			
		}catch(IOException e){
			System.out.println("Error: "+ e.getMessage());
		}
		
		sc.close();
	}
	

}
