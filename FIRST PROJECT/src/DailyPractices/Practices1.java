package DailyPractices;
import java.util.*;
public class Practices1 {
	//bounded number=n
	public static void main (String []args) {
	int n      ;
	System.out.println(" Enter a uper bounded number");
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	
	for(int j =(n-100); j<=n ; j++) {
		
		int temp=0;
		for(int i=2; i<=(j-1); i++) {
			if(j%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(j);
		}
	}
				
	
	

	
	

}
}
