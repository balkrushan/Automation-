package loop;

public class Static {
	   public static void Hello (int a , int b ) // metod 
	  
	   {
		   int  c  = a+b ;
		   System.out.println( c );
	   }
     public void sub (float e , int f)
     {
    	float  g = e / f ;
    	 System.out.println(g);
     }
	public static void main(String[] args) {  // main method 
		// TODO Auto-generated method stub
		
		Static.Hello(15,20);  //classname .mathod name();
		
		Static obj1 = new Static (); // classname obj = new class name ();
		obj1.sub(5, 20);
		Svariable obj = new Svariable();
		   obj.nonstatic();
			

	}

}
