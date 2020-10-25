package MyJavaCollection;
import java.util.*;
public class MyJavaCollection4 {
	
	public static void main(String[] args) {
	
	Stack<String> stack= new Stack<String>();
	
	stack.push("guddu");
	stack.push("Jay");
	stack.push("Vikash");
	stack.push("Rahu");
	stack.push("Rakesh");
	stack.push("Ayush");
	stack.push("AAshish");
	stack.push("Binod");
	// stack.peek("Rahul");
	System.out.println(stack);
	//System.out.println(stack.peek);
	stack.remove(5);
	
	//stack.pop();
	for(int i =0; i<=5; i++) {
	System.out.println(stack.pop());
	}
	System.out.println(stack);
	
	
	
		
		
		
	}
	
	

}
