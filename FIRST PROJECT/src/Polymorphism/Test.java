package Polymorphism;

public class Test {
	void show (String a) {
		System.out.println("String method");
	}
	  static  void show(double a) {
		   System.out.println("int a method");
	   }
	    void show(int...a) {
		   System.out.println("int...a");
	   }
	   public static void main (String []arg) {
		   Test t = new Test();
		   abc f = new abc();
		   t.show(12,121,213,2324,32);
		   t.show(234);
		   t.show("dfgh");
		   t.show(2.7);
		   t.show();
		   //f.show();
		  abc.show();
	   }
	   

}
class abc extends Test{
	static void show () {
		System.out.println("GUDDU");
	}
	public static void main (String []arg) {
		
		abc f = new abc();
		Test z =new Test();
		Test.show(5.7);
		z.show(2,3);
		def.field();
		//f.show();
	}
}


   class  jee extends Test{
	   
	   static void simple (double a,double b) {
		  // public static void main (String []args) {
			   
		   
		   if(a>b) {
			   System.out.println("max of two number is:"+ a);
		   }else {
			   System.out.println(" max of two number is: "+b);
		   }
		   }
	   
	   public static void main(String []args) {
		   
	   
	   
    	Test h =new Test();
    	h.show();
    	h.show(7.9);
    }
   }
    
    
    
