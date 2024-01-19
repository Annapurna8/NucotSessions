package Collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) 
	{
		
	LinkedList<Integer> ob=new LinkedList<>();
	
	ob.add(0, 100);
	ob.add(1, 200);
	ob.add(2, 300);
	ob.add(3, 500);
	ob.add(4, 800);
	ob.add(50);
	
	//Get values
	System.out.println(ob.get(2));
	
	//Set values
	ob.set(2, 222);
	System.out.println(ob);
	
	//Length
	System.out.println("Size :");
	int a=ob.size();
	System.out.println(a);
	
	// remove
	System.out.println("Show Removed");
	int b=ob.remove(1);
	System.out.println(b+"<--Value removed");
	System.out.println(ob);
	
	//contains
	System.out.println("Print true or false");
	boolean c= ob.contains(20);
	System.out.println(c);
	
	//SORTING
	System.out.println("==Before Sorting:-");
	
	for (int i=0;i<ob.size();i++)
	{
		System.out.println(ob.get(i));
	}
	System.out.println("==For EACH==");
	for(Integer newlist1:ob)
	{
		System.out.println(newlist1);
	}
	
	
/*
LinkedList<Integer> ob1=new LinkedList<>();
	
	ob.add(0, 111);
	ob.add(1, 222);
	ob.add(2, 333);
	
ob1.addAll(ob1);
System.out.println(ob1);*/
	}

}
