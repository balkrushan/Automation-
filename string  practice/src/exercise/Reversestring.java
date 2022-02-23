package exercise;

public class Reversestring {
	
	static void ankush (String a) 
	{
		
		int len = a.length(); //  hello 5 letter but java consider as a 4 digit
		
		
		for ( int i=len-1; i>=0; i--) 
		{
			System.out.print(a.charAt(i));
			
		}
		
	}
	 public static void main(String[] args) {
		 Reversestring.ankush (" Balkrushna ");
		 
	}
	

}
