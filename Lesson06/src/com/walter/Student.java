package com.walter;

import java.util.Calendar;

public class Student 
{
	private String names,email, course;
	private int year, balance;
	public Student(String names, String email, String course, int year, int balance) {
		super();
		this.names = names;
		this.email = email;
		this.course = course;
		this.year = year;
		this.balance = balance;
	}
	public String getNames() {
		return names;
	}
	public String getEmail() {
		return email;
	}
	public String getCourse() {
		return course;
	}
	public int getYear() {
		return year;
	}
	public int getBalance() {
		return balance;
	}
    public int calculateAge()
    {
    	Calendar c=Calendar.getInstance();    	
    	int current = c.get(Calendar.YEAR);     	
    	int age= current-year;
        return age;	
    }
    public void payFee(int amount)
    {
    	balance -=amount;
    }
    public void printDetails()
    {
      System.out.println(names+" "+email+" "+course+" "+year+" "+balance+" "+calculateAge());
    }

}
