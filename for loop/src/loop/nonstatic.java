package loop;

public class nonstatic {
	  
	  
	 int a= 4;
	public  void loop () 
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		nonstatic obj= new nonstatic();
		obj.loop();
	
	}
}

