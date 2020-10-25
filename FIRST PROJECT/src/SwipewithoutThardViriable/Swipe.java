package SwipewithoutThardViriable;

import java.util.Scanner;

public class Swipe {

	public static void main(String[] args) {
	int h,r;
	Scanner in =new Scanner(System.in);
	System.out.println("Enter Two number thare Swipe");  
	h=in.nextInt();
	r =in.nextInt();
	System.out.println("number before Swipe " + h + ","+ r);
	h=h+r;
	r=h-r; //r= (h + r)-r=h
	h=h-r; //h=  h-(h-r)=r
			
	System.out.println("number after Swipe " + h + ","+ r);
	

	}

}
