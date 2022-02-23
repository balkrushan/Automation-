package loop;

public class Svariable {
	 int a=5;
	 
       int b=5;
       int c=a+b;
	 

	 
	public void nonstatic() 
	 {
		System.out.println(c);
	 }
	public static void ram () 
	{ 
		Svariable obj = new Svariable();
		   obj.nonstatic();
			
		
	}
	 public static void main(String[] args) {
			
			
			
		   Svariable obj = new Svariable();
		   obj.nonstatic();
		   Svariable.ram();
		 System.out.println('c');
		  
		}

	}


			 
			
	