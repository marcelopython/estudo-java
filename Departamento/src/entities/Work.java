package entities;

import entities.enums.WorkerLevel;

public class Work {

	private String name;
	
	private WorkerLevel level;
	
	private Double baseSalary;
	
	public Work(String name, WorkerLevel level, Double baseSalary) {
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		
	}

	public String getName() {
		return name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}
	
	
	
	
}
