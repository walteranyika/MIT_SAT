package com.walter;
import java.util.Scanner;

public class Lesson04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Num one:");
		int one = input.nextInt();
		System.out.println("Enter Num two:");
		int two = input.nextInt();
		int result = one * two;
		System.out.println("Result is "+result);
		input.close();
	}
}



