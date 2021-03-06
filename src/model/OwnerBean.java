package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class OwnerBean {
    private double balance;
    private double income;
    private double expense;
    private double headShare;
    private String name;

    public String createOwner() {
	return getName();
    }

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