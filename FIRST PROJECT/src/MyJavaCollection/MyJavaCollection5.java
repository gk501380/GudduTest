package MyJavaCollection;

import java.util.*;

public class MyJavaCollection5 {
	
	public static void main(String[] args) {
		
	
	PriorityQueue<String> queue = new PriorityQueue<String>();

	queue.add("guddu");
	queue.add("jay");
	queue.add("viksh");
	queue.add("nitish");
	queue.add("rahul");
	queue.add(" sonu");
	queue.add("ankit");
	queue.add("anil");
	queue.add("aman");
	
	System.out.println(queue);
	
	System.out.println(queue.element());
	System.out.println(queue.peek());
	System.out.println(queue.peek());
	System.out.println(queue.element());
	queue.remove();
	queue.poll();
	
	System.out.println("After remove two element");
	System.out.println(queue);
	System.out.println();
	System.out.println();

}
}