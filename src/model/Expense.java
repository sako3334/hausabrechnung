package model;

public class Expense {
    private String company;
    private String service;
    private double allocationKey;
    private Apartment apartment;

    public double getAllocationKey() {
	return allocationKey;
    }

    public Apartment getApartment() {
	return apartment;
    }

    public String getCompany() {
	return company;
    }

    public String getService() {
	return service;
    }

    public void setAllocationKey(double allocationKey) {
	this.allocationKey = allocationKey;
    }

    public void setApartment(Apartment apartment) {
	this.apartment = apartment;
    }

    public void setCompany(String company) {
	this.company = company;
    }

    public void setService(String service) {
	this.service = service;
    }
}
