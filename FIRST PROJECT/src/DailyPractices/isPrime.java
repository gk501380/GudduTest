package DailyPractices;
import java.util.*;

  public class isPrime{
	  public static void main(String[] args) {
		prime();
		
		
	}
	
  static  void  prime() {
		
	Scanner in= new Scanner(System.in);
	System.out.println("Ente number :-");
	int n,l;
	 l =in.nextInt();
	 for(n=1; n<=l; n++) {
	for ( int j =2; j<l; j++) {
		if(n%j==0) {
			System.out.print( "");
			
		}else {
		
		System.out.println(n);
		break;
	}
	}
  }
}
  }




