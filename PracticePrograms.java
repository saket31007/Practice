package com.questionSeries;

public class PracticePrograms {

	public static void Evenodd(int num ) {
		int remainder = num % 2;
		
		if(remainder==0) {
			
			System.out.println("Even number");
		}
		
		else {
			
			
			System.out.println("odd number");
		}
		
	}
	
	public static void main(String[] args) {
	
		Evenodd(19);

	}

}
