package DailyPractices;
import java.util.*;

public class CkekLipeYearYesOrNot {
	 public static void main(String[] args) {
		LipeYear(); 
		
	}
	public static void LipeYear(){
		System.out.println("Enter year:");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		if(n%4==0) {
			System.out.println(" Yes; "+n+" is a leap yaer");
		}else {
			System.out.println(" no; "+n+" ia not a lipe year");
		}	
	}
}
