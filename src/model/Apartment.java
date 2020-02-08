package model;

public class Apartment {
    private double floor;
    private double livingSpace;
    private double propertyShare;
    private Owner owner;
    private Expense expense;

    public Expense getExpense() {
	return expense;
    }

    public double getFloor() {
	return floor;
    }

    public double getLivingSpace() {
	return livingSpace;
    }

    public Owner getOwner() {
	return owner;
    }

    public double getPropertyShare() {
	return propertyShare;
    }

    public void setExpense(Expense expense) {
	this.expense = expense;
    }

    public void setFloor(double floor) {
	this.floor = floor;
    }

    public void setLivingSpace(double livingSpace) {
	this.livingSpace = livingSpace;
    }

    public void setOwner(Owner owner) {
	this.owner = owner;
    }

    public void setPropertyShare(double propertyShare) {
	this.propertyShare = propertyShare;
    }
}
