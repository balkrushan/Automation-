package upcasting;

public class ChildclassExtend extends ParentExtend {
	
	public void test3() {
		
		System.out.println("I am project owner");
		
		
	}
	 public void test() {
		 System.out.println("I am sc (scrum master )" );
	 }
	 
	 public void test1() {
  System.out.println( "  i can do everything");
  
	 }
	 public static void main(String[] args) {
		 ParentExtend z = new ChildclassExtend();  // upcasting childclass to parent class 
		 	
	 	   z.test();
	 	   z.test1();
	 	  
	 	  
	}
}
