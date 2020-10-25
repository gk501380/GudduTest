package MyJavaCollection;
import java .util.*;
public class MyJavaCollection1 {
	
	public static void main(String[] args) {
	ArrayList<String> List= new ArrayList<String>();
	// Adding element
	List.add("Guddu");
	List.add("Jay");
	List.add("Ankit");
	List.add("Manish");
	List.add("Raju");
	List.add("Rahul");
	List.add("Binod");
	List.add("Mithun");
	List.add("Nitish");
	System.out.println(List);
	// Print a fixed String
	System.out.println(List.get(3));
	System.out.println(List.get(0));
	System.out.println(List.get(5));
	System.out.println(List.get(4));
	List.remove(3);
	System.out.println(List);
	List.remove("Rahul");
	
	System.out.println(List);
	//Add with parameter
	List.add(3 ,"Rakesh");
	System.out.println(List);
	
	}

}
