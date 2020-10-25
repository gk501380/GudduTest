package Factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number");
		int factorial =in.nextInt();
		int result=1;
		int Number;
		//int factorial = Number;
		for(int i=factorial; i >1 ; i--) {
			result = result*i;
		}
		System.out.println("factorial is "+result); 

	}

}

