package opps2;

public  final class F2 extends F1 {
      
	public final void test1() {// we can't override to  final method 
		
		System.out.println(" hey");
	}
	public static void main(String[] args) {
		F2 obj =new F2();
		obj.test1();
		obj.test();
		
	}
	
}
