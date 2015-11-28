package com.walter;


//java.lang
public class Functions {
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		u.add(56, 78);
		u.divide(33, 5);
		u.getDate();
		
		/*sum(23, 56);
		sum(67, 54);
		sum(634, 128);
		sum(23, 67, 34);
		volume(33);*/
		
		/*
		 * int x = 55; double result = Math.pow(x, 3);
		 * System.out.println(result); String z = "This is my country";
		 * System.out.println( z.length() ); System.out.println(
		 * z.toUpperCase()); System.out.println( z.equals("Kenya") );
		 */

	}
	// method overloading
	public static void sum(int a, int b) {
		int result = a + b;
		String x = "Sum of " + a + " and " + b;
		System.out.println(x + " is " + result);
	}
	public static void sum(int a, int b, int c) {
		int result = a + b + c;
		String x = "Sum of " + a + " and " + b;
		System.out.println(x + " is " + result);
	}
	public static void sum(double a, int b) {
		System.out.println(a + b);
	}
	public static void sum(int a, double b) {
		System.out.println(a + b);
	}
    public static void volume(double radius)
    {
      double v= 4/3 * 22/7 * Math.pow(radius,3);
      System.out.println(v);
    }
	
	
	
	
	
}
