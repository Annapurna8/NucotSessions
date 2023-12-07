package Inheritance_overridig;


public class Amazon {
	
	public void display()
	{
		System.out.println("Display's at the bottom of ther page");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    Amazon_V1 obj=new Amazon_V1();
    obj.menubar();
    obj.display(); // from parent class

	}

}
