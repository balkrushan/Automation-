package opps2;

public class Subclass extends Overriding {
	  
	public void boy(int a, int d , int c) {
		   // a= 5;
		   // d=6;
		    c = a+d;
		 System.out.println(c);
		 
		 
		 
	}
public static void main(String[] args) {
	         Subclass obj = new Subclass();
	              obj.boy(5,6,11);
}
}