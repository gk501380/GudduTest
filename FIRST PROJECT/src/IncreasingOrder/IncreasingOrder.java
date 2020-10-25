package IncreasingOrder;

import java.util.Random;
import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter upper bund number");
		int upperbound = in.nextInt();
	 Random rand = new Random();	  
int int_random = rand.nextInt(upperbound);		
System.out.println(int_random);
	}

}

