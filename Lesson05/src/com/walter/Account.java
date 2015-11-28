package com.walter;

public class Account {
	//properties for an account
	String name;
	String number;
	double balance;
	// constructor to set up values
	public Account(String name, String number, double balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	// getters
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
    //method to deposit into an account
	public void deposit(double amount)
	{
	   balance += amount;	
	}
	//method to withdraw
	public void withdraw(double amount)
	{
	   if(balance > amount)
	   {
		 balance -=amount; 
		 System.out.println("Success");
	   }else
	   {
		   System.out.println("Insufficient"); 
	   }   
	}
    //method to print account details
	public void printDetails()
	{
		System.out.println(name+" "+number+" "+balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
