package program;

public class palindromenumber {
        public static void main(String[] args) {
			int n=12321;
			int rev=0 ;                  
			int lastdigit;
			  int a=n;
			while(n>0)     //  987>0    
			{
				lastdigit=n%10;    //987%10=7
				rev=rev*10+lastdigit;
				//0 *10+7;
				n=n/10;                 //  987/10=98.7  but integer data type not consider last digit =98
				
			}
			System.out.println(rev);
			 if(a==rev) 
			 {
				 System.out.println("is palindrome number");
			 }
			 else 
			 {
				 System.out.println("not palindrommnumber ");
			 }
			
			
		}
}
