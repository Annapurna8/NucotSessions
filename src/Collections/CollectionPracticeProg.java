package Collections;

import java.util.ArrayList;

public class CollectionPracticeProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Before adding new values:");
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(10);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(00);
		arrayList.add(10);
		
		//size method
		int siz=arrayList.size();
		System.out.println(siz);
		
		for(Integer newlist:arrayList)
		{
			System.out.println(newlist);
		}
		arrayList.add(01);
		arrayList.add(100);
		
		System.out.println("After adding new values the size is:");
		int siz1=arrayList.size();
		System.out.println(siz1);
		
		//get method
		System.out.println("Printing the values usig get method:\n"+arrayList.get(2));
		
		/*Index out of bounds exception
		
		System.out.println("Printing the values usig get method:"+arrayList.get(10));*/
		
		System.out.println("\n**String values accessing**:-\n");
		
	ArrayList arrayList2 = new ArrayList();
		
		arrayList2.add("abc");
		arrayList2.add("Java");
		arrayList2.add("php");
        arrayList2.add("python\n");

		System.out.println("get values:\t"+arrayList2.get(3));
		
		//Generic
		System.out.println("---Using generic & for loop to print all the values");
		ArrayList<Integer> arrayList3 = new ArrayList<>();
		arrayList3.add(200);
		arrayList3.add(300);
		arrayList3.add(00);
		arrayList3.add(10);
		//Prit all the values present
		
		System.out.println("Print all the values:");
		for (int i=0;i<arrayList.size();i++)
			System.out.println(arrayList.get(i));
		
		System.out.println("\nUsing for each loop");
		
ArrayList<Integer> arrayList4 = new ArrayList<>();
		
	arrayList4.add(10);
	arrayList4.add(200);
	arrayList4.add(300);
	arrayList4.add(00);
	arrayList4.add(10);
		
		//size method
		int aaa=arrayList4.size();
		System.out.println("Size:-"+aaa);
		System.out.println("Print all the values added in list");
		for(Integer newlist:arrayList4)
		{
			System.out.println(newlist);
		}
	}

}
