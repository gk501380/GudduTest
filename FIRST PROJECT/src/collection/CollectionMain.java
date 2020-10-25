package collection;


import java.util.ArrayList;
import java.util.Arrays;

import pojo.Student;

public class CollectionMain {
public static void main(String[] args) {
	ArrayList<Student> studentList=new ArrayList<Student>();
	Student s1=new Student();
	s1.name="Guddue";
	s1.rollNo=100;
	s1.email="guddu@gmail.com";
	s1.city="Purnia";
	studentList.add(s1);
	
	Student s2=new Student();
	s2.name="Jay";
	s2.rollNo=101;
	s2.email="jay@gmail.com";
	s2.city="Purnia";
	studentList.add(s2);
	
	for (int i = 0; i < studentList.size(); i++) {
		Student s=studentList.get(i);
		System.out.println("Name="+s.name);
	}
	/*for (Student s : studentList) {
		System.out.println("==========================");
		System.out.println("Name="+s.name);
		System.out.println("roll="+s.rollNo);
		System.out.println("Email="+s.email);
		
		
	}*/
    int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
    
    
    int temp;
    for (int i = 0; i < arr.length; i++) 
    {
        for (int j = i + 1; j < arr.length; j++) { 
            if (arr[i] > arr[j]) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    
    Arrays.sort(arr); 
    

    System.out.printf("Modified arr[] : %s", 
                      Arrays.toString(arr)); 
	
}
}
