package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
ArrayList<Integer> obj=new ArrayList<Integer>();

obj.add(10);//0 // 1
obj.add(20);//1
obj.add(30);
obj.add(40);
obj.add(50);
obj.add(20);//5 //6


System.out.println("Finding Size: "+obj.size());

for (int i=0;i<obj.size();i++)
{
	
	System.out.println(obj.get(i));
}

System.out.println("Using For each loop");

for (Integer ff:obj)
{
	System.out.println(ff);
}


System.out.println("Set Value");

// update vales
	obj.set(1, 25);
	
	System.out.println(obj);
	
	//Remove/delete Values
	System.out.println("Remove value");
	obj.remove(0);
	System.out.println(obj);
	
	//Add values in between
	System.out.println("Add values between:");
	obj.add(2, 60);
	obj.add(4, 100);
	// obj.add(8, 200); // out of bounds exception
	
	System.out.println(obj);
	
	//Sort
	System.out.println("Sort in ascending order:");
	Collections.sort(obj);// by default
	System.out.println(obj);
	
	//Contains
	System.out.println("Using contains method:");
	
	System.out.println(obj.contains(10)); // returns boolean values
	System.out.println(obj.contains(100)); // returns boolean values
	System.out.println(obj.contains(20));
	}

}
