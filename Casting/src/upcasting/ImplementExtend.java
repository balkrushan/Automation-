package upcasting;

public class ImplementExtend extends implementation{
	public static void main(String[] args) {
		implementation obj =new implementation();
		obj.demo();
		obj.demo1();
		 implementation t = new  ImplementExtend ();// upcasting completed method to interface test 
		  
		          t.demo();
		          t.demo1();
		
			}

}
