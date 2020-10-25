package StaticKeyWord;
  

	//Java Program to demonstrate the use of a static method.
     public class Student{
     int rollno;
     String name;
     static String college = "JNCT";
     //static method to change the value of static variable
     static void change(){
     college = "LNCT";
      }
     //////////
     class CounterDemo {
    	 
     int count =0;
    CounterDemo(){
    	count++;
    	System.out.println("count");
    }
    	 
    //////////	 
     }
     
     
      //constructor to initialize the variable
     Student(int r, String n){
      rollno = r;
      name = n;
      }
     
     //method to display values
     void display(){System.out.println(rollno+" "+name+" "+college);}
   /*  }
     //Test class to create and display the values of object
     class TestStaticMethod{*/
     
     public static void main(String args[]){
     Student.change();//calling change method
      
     //creating objects
     Student s1 = new Student(111,"   JAY");
     Student E1  = new Student (123,"NITISH");
     Student s2 = new Student(222," GUDDU");
     Student s3 = new Student(333,"VIKASH");
    // CounterDemo c1 =new CounterDemo();
     
     
     //calling display method
     s1.display();
     s2.display();
     s3.display();
     E1.display();
}
     
     
}
