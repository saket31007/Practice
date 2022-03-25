package com.questionSeries;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// Writing ArmStrong Number
		
		int user = 407 , reminder,multi=0,copy;
		 copy=user;
		 
		 while(user>0) {
			 
			 reminder = user%10;                 
			 multi+= reminder*reminder*reminder;
			 user = user/10;
			 
			 
		 }
		
          if (multi==copy) {
        	  
        	  
        	  System.out.println("This is a Armstng number");
          }
          
          else
        	  
        	  System.out.println("Not Armstng");
	}

}
