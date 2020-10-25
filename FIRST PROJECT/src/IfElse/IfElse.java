package IfElse;

import java.util.Scanner;

public class IfElse { 
	
	public static void main (String[] args) {
	
	
	
	     int ApprovedAge = 18;
	     System.out.println("enter age");
	     Scanner input = new Scanner(System.in);
	     int age=input.nextInt();
	     int n=18-age;

	     if(age>= ApprovedAge) { 
		 System.out.println("you elligible for creadit" );
	     }else { 
		 System.out.println("you not eliigible for creadit and try again after "+n+" years");
				
	}
		
	}

}
