package loop;

public class Sidetrigle {
	
	public   void test () {
		for ( int p = 1; p<6; p++) {
	    	 for(int q = 1; q<=p; q++ ) {
	    		 System.out.print(" ");
	    		 
	    	 }
	    	System.out.println();
	     }
	}
        public static void main(String[] args) {
        	     Sidetrigle obj = new Sidetrigle();
        	       obj.test();
        	     
        	     for(int a=1; a<=5;a++) {
        	    	 for (int b =4; b>=a; b--) {
        	    		 System.out.print(" # ");
        	    		 
        	    	 }
        	    	System.out.println();
        	    	 
        	     }
			
        	
        	
		}
}
