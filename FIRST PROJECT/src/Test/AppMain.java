package Test;

/**
 * @author Smuti98
 *
 */
/**
 * @author Smuti98
 *
 */
public class AppMain {

	public static void main(String[] args) {
		//crating object of class
		MyCalculator cal=new MyCalculator();
		//calling method
		int result=cal.sum(5, 10);
		//printing returned value
		System.out.println("result="+result);
		
		/****************************/
		MyPattern pattern=new MyPattern();
		pattern.printTriangle();
		
		int result1= cal.MaxOfTwoNumber(6,7);
		System.out.println("MaxOfTwoNumber "+result1);
		int result3 =cal.MaxOfTwoNumber(-98,44);
		System.out.println(result3);
		int return4=cal.minFunction(68,97);
		System.out.println(return4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
