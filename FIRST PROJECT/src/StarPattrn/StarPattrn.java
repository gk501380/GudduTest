package StarPattrn;

import java.util.Scanner;

public class StarPattrn {

	public static void main(String[] args) {
		
int j ,k,p;
Scanner in =new Scanner(System.in);
//Scanner in =new Scanner(System.in);
//System.out.println("Enter j");
//j=in.nextInt();
System.out.println("Enter p");
p=in.nextInt();
System.out.println("*");
for(j=1; j<=p; j++) {
	System.out.println("*");
	for (k=1;k<=j-2; k++ ) {
		System.out.print(" ");
	}
	System.out.print("*");
	//System.out.println("");
}
System.out.print("");
	}

}
