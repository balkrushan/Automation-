 package MyPackage;



public class Constructor
{  
	void Constructor()
	{
		System.out.println("This is default constractor");
	}
	
	void Constructor(int a, int b)
	{
		System.out.println("This is parametric constructor: Answer" +(a+b));
	}

	public static void main(String[] args) 
	{
		Constructor obj1 = new Constructor();
		
		Constructor obj2 = new Constructor();
		
		obj1.Constructor();
		obj1.Constructor(10,20);
	
	}



}
