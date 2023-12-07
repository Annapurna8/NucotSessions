package Inheritance_overridig;

public class WhatsappMainclass {
	public void chats()
{
	System.out.println("Texting with no mic");
}
	public void status()
	{
		System.out.println("Text status");
	}
	public void calls()
	{
		System.out.println("One on one call");
	}
	public void settings()
	{
		System.out.println("settings");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************Main class methods***********");
		WhatsappMainclass ob=new WhatsappMainclass();
	// 	ob.newfeature();   // cant access the child class to parent class
		ob.status();
	    ob.chats();
		ob.calls();
		ob.settings();
		
		System.out.println("\n=====Version1=========");
		Whatsapp_version1 obj=new Whatsapp_version1();
		obj.status();
		obj.calls();
		obj.chats();
		
		System.out.println("\n+++++++++Version2+++++++++");
		Whatsapp_version2 obj1=new Whatsapp_version2();
		obj1.status();
		obj1.calls();
		obj1.chats();
		obj1.settings(); // from parent class we can access in child class object
		
	}

}
