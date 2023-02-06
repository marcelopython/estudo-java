package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	
	private Double pricePerDay;
	
	private TaxService taxService;
	
	public RentalService() {
		
	}

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basePaypment;
		
		if(hours <= 12.0) {
			basePaypment = this.pricePerHour * Math.ceil(hours);
		}else {
			basePaypment = this.pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = this.taxService.tax(basePaypment);
		
		carRental.setInvoice(new Invoice(basePaypment, tax));
		
	}
	
}
