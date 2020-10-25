package ArrayList;
import java.util.ArrayList;
public class MyList {
	
	public static void main(String[] args) {
		myarrayprint();
	}
	public static void myarrayprint() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Bmw");
		cars.add("Maruti");
		cars.add("br");
		cars.add("dg");
		//cars.remove(2);
		cars.add(1,"ggg");
		
		ArrayList<String> car1 = new ArrayList<String>();
		
		car1.add("gh");
		car1.add("gj");
		cars.addAll( 0, car1);
				
		System.out.println(cars);
		
		
		
	}
}
