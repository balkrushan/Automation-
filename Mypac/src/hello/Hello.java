package hello;

public class Hello {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}//catch(Exception e) {
	//	System.out.println("exception handle");
	//}
		finally {
			System.out.println("a");
		}
}
}


