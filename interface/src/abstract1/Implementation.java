package abstract1;

public class Implementation implements Demo  {
	
	
	public void test () {
		System.out.println("hello");
	}
	
	public void test1 () {
		System.out.println(5555);
	}
	

	public static void main(String[] args) {
		
		 int x=Demo.s;
	 int d =Demo.c ;
	Implementation obj = new Implementation();
	obj.test();
	obj.test1();
	System.out.println(d);
	System.out.println(  x);
	}

}
