package NestedIfElse;

import java.util.Scanner;

public class NestedIfElse {
	public static void main (String[]args) {
		int rank;
		System.out.println("inter your rank");
		
		 Scanner input = new Scanner(System.in);
		 
		rank =input.nextInt();
		if(rank <=100000 && rank>700) {
			System.out.println("grade  fail");
			
		}else {if(rank<=700 &&  rank>500 )  {
			System.out.println("grade  c");
		}else {
			if(rank<=500 && rank >300) {
				System.out.println("grade  B");
				
			}else {
				if(rank<=300) {
					System.out.println("grade A");
				}
			}
			
			
		
		}
			
		
		
		
	}

}
}
