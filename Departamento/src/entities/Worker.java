package entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	
	private WorkerLevel level;
	
	private Double baseSalary;
	
	private Department department;
	
	private List<HoursContract> contracts = new ArrayList<>();
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	public List<HoursContract> getContracts() {
		return contracts;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void addContract(HoursContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HoursContract contract) {
		this.contracts.remove(contract);
	}

	public Double income(String dateFiltered) {
		
		double amount = this.baseSalary;
		
		for (HoursContract dataContract : this.contracts) {
			
			String contractDate = dataContract.getDate().getYear()+"/"+dataContract.getDate().getDayOfMonth();
						
			if(contractDate.intern() == dateFiltered.intern()) {
				amount += dataContract.totalValue();	
			}
			
			
		}
		
		return amount;
		
	}
}
