package javasessions.com;

public class AssignmentStudent {
	
	void stud1()
	{
		String name="Anu";
		char grade='c';
		int strength=50;
		System.out.println(" student details:"+name+","+grade+","+strength);
	}
	String stud2()
	{
		String name="Anu";
		
		return name;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AssignmentStudent as=new AssignmentStudent();
as.stud1();
System.out.println(as.stud2());
		
	}

}
