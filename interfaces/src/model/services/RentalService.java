package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	
	private Double pricePerDay;
	
	private BrazilTaxService taxService;
	
	public RentalService() {
		
	}

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basePaypment;
		
		if(hours <= 10.0) {
			basePaypment = pricePerHour * Math.ceil(hours);
		}else {
			basePaypment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = this.taxService.tax(basePaypment);
		
		carRental.setInvoice(new Invoice(basePaypment, tax));
		
	}
	
}
