package opps2;

public class Overriding {
	
	public void boy() {
		System.out.println("am a tester");
		
	}
	
	public void girl() {
		 System.out.println("she is a developer");
		 
	}
	
   public static void main(String[] args) {
	            Overriding obj= new Overriding();
	             obj.boy();
	             Overriding obj1= new Overriding();
	             obj1.girl();
}
	

}
