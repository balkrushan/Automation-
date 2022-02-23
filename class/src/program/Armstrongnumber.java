package program;

public class Armstrongnumber {
	
	public static void armstrong() {
		    int n=987;            
		    int armstrongno=0;
			int temp;
		    
		    while(n>0) {
		    	temp=n%10;
		    	temp= temp*temp*temp;
		    	
		    	armstrongno=armstrongno+temp;
		    		    	 n=n/10;
		    		//    	 System.out.println(armstrongno);++
		    }
		    	if (armstrongno==153) {
		    		System.out.println("this is an armstrogn no");
		    	}
		    	else {
		    		System.out.println("not amrstrong no");
		    	}
		    	 
	}
        public static void main(String[] args) {
        	 Armstrongnumber.armstrong();
			
		}
}
