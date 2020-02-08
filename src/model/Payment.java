package model;

import java.util.Date;

public class Payment {
    private double value;
    private Date date;
    private Expense expense;
    private Bank bank;

    public Bank getBank() {
	return bank;
    }

    public Date getDate() {
	return date;
    }

    public Expense getExpense() {
	return expense;
    }

    public double getValue() {
	return value;
    }

    public void setBank(Bank bank) {
	this.bank = bank;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public void setExpense(Expense expense) {
	this.expense = expense;
    }

    public void setValue(double value) {
	this.value = value;
    }
}
