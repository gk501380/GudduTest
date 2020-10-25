package Conctructor;
class  Conctructor{
String name, course;
//creating a parametrized constructor
   Conctructor(String s , String n )
{
    name = s ;
   course = n;
}
void show( )
{ System.out.println( name+ " " + course); }
  
public static void main(String args[])
{
	Conctructor ob1 = new Conctructor("Java" , "J2EE");
	Conctructor ob2 = new Conctructor("Java" , "Advance Java");
 ob1.show( );
 ob2.show( );
     }
}

    