package DailyPractices;
import java.util.*;
public class PrimeNumber {
	
	public static void main (String [] args) {
		
		System.out.println( "Ente a upper bond number:-");
		//n =in.nextInt();
		
		int n, status =1, num=3;
		Scanner in =new Scanner(System.in);
		n =in.nextInt();
		if ( n>= 1) {
			System.out.println("First "+n+" prime number are :-");
			System.out.println(2);
		}
		for (int count =2; count<= n;) {
			for (int j=2; j<=Math.sqrt(num); j++) {
				if(num %(n-1) ==0) {
					status = 0;
					break;
					
				}
				
			}
			if(status !=0) {
				System.out.println(num);
				count++;
			}
				
			status = 0;
			count++;
			
		}
		
	}
	

}
