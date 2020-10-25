
package Polymorphism;

 public class MacBook {
	public void myMethod() {
		this.myMethod();
		System.out.println("Overidden");
	}
	public static void main(String []args) {
		MacBook objs = new ipad();
		objs.myMethod();
		
	}

}
 class ipad extends MacBook {	
	public void myMethod() {
	//this.myMethod();
		System.out.println("method overriding");
		
	}
	public static void main (String [] args) {
		MacBook obj = new ipad();
		obj.myMethod();
		
	}
	
}
