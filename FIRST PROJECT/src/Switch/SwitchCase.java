package Switch;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 String str = in.next();
	        switch(str) 
	        { 
	            case "one": 
	                System.out.println("one"); 
	                break; 
	            case "two": 
	                System.out.println("two"); 
	                break; 
	            case "three": 
	                System.out.println("three"); 
	                break; 
	            default: 
	                System.out.println("no match"); 
	        } 

	}

}
