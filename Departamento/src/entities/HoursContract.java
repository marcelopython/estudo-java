package entities;

import java.time.LocalDate;
import java.util.Date;

public class HoursContract {

	private LocalDate date;
	
	private Double valuePerHour;
	
	private Integer hours;
	
	public HoursContract(LocalDate date, Double valuePerHour, Integer hours) {
		
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
		
	}
	
	public Double totalValue() {
		
		return this.valuePerHour * this.hours;
		
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
}
