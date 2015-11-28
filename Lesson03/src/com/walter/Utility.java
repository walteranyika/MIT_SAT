package com.walter;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utility {
    public void add(double x, double y)
    {
      System.out.println(x+y);
    }
    public void divide(double x, int y)
    {
    	System.out.println(x/y);	
    }
    public void getDate()
    {
    	DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
    	Date d =new Date();
    	String x = df.format(d);
    	System.out.println(x);
    }
    
    
    
    
    
}
