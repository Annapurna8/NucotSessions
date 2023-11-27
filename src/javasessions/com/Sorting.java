package javasessions.com;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,8,3,5,6,2,9,2};
		System.out.println("=====Sorting=====");
		
		
		for(int i=0;i<=a.length;i++)
		{
			for (int j=i+1;j<=a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
				
				 temp=a[i];
			  	 a[i]=a[j];
				 a[j]=temp;
			    }
		    }
		}
		
	
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
