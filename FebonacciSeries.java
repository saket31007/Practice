package com.questionSeries;

import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0 , b = 1 , c = 0 , d;    //variable declaration
		
		
		Scanner scn  = new Scanner(System.in);  // Scanner class
		
		System.out.println("Please enter max value =");
		
		d = scn.nextInt();
		
		while (c<=d) {
			
			System.out.println(c);
			
			a=b;          
			b=c;
			c= a+b;
			
		}
		
		
		 

	}

}
