package javasessions.com;

public class Sorting {

	public static void main(String[] args) {
		// Ascending order
		int a[]={10,8,3,5,6,2,9,2};    // {8,3,10,5}
		
		System.out.println("=====Sorting=====");
		
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])// 10 > 8
				{
				
				 temp=a[i]; // temp =10;   temp = 10    
			  	 a[i]=a[j]; // a[i]= 8     a[i] = 3
				 a[j]=temp; // a[j] = 10   a[j] = 10
			    }
		    }
		}
		
	
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
