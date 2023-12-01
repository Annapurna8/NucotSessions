package javasessions.com;

public class UsingStatic_NonStatic {

	static void login() 
	{
		System.out.println("Login crdentials");
	}
	static void login(String Un, String Pass)
	{
		System.out.println("Username & password:==>\n"+Un+"\t"+Pass);
	}
	static int login(int id)
	{
		return id;
	}	
	static void login(float eid)
	{
		System.out.println(eid);
		
	}	
	public static void main(String[] args) {
	System.out.println("Method overloading");
	login(); // without classname
	UsingStatic_NonStatic.login("Annapurna", "anu");//using classname to create object
	UsingStatic_NonStatic.login(111);
	UsingStatic_NonStatic.login((float)325.0);
	}

}
