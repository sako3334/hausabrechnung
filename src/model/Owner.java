package model;

public class Owner {
    private double balance;
    private double income;
    private double expense;
    private double headShare;
    private String name;

    public double getBalance() {
	return balance;
    }

    public double getExpense() {
	return expense;
    }

    public double getHeadShare() {
	return headShare;
    }

    public double getIncome() {
	return income;
    }

    public String getName() {
	return name;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public void setExpense(double expense) {
	this.expense = expense;
    }

    public void setHeadShare(double headShare) {
	this.headShare = headShare;
    }

    public void setIncome(double income) {
	this.income = income;
    }

    public void setName(String name) {
	this.name = name;
    }
}