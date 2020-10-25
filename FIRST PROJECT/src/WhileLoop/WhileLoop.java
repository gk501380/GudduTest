package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
	public static void main (String []args) {
		int a,l,D;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first term");
		a = in.nextInt();
		System.out.println("Enter last term");
		l =in.nextInt(); 
		System.out.println("Enter common difference ");
		
		D=in.nextInt();
		while(a<=l) {
			a=a+D;
			System.out.println(a);
			
		};
	}

}
