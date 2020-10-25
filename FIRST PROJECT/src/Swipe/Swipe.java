package Swipe;

import java.util.Scanner;

public class Swipe {
	public static void main (String []args) {
		
		
		
	int x,y,k;
	//x=34;
	//y=67;
	Scanner in =new Scanner(System.in);
	
	System.out.println("Enter x and y ");
	System.out.println("Enter x");
	
	x =in.nextInt();
	System.out.println("Enter y");
	
	y=in.nextInt();
	System.out.println("x and y is "+x+", "+y);
	//System.out.println(y) ;
	
	if(x>y) {
	k=x;
	x=y;
	y=k;
	
	System.out.println("x and y is "+x+", "+y);
	}else {
		System.out.println("x and y is "+x+", "+y);
		
	}
	//System.out.println(y);
	}

}
