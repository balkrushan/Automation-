package exercise;

public class Return {
	
       int  m  =5 ;
	  static int  n  =6;
          protected static int ram()
           {
        		  Return obj=new Return();
        	int  p= obj.m;
        	   
                 int c =  p+n;
                 
        	  
                 System.out.println(c);
        	   
        	   return c;
        	   
        	  
           }
           
        
	public static void main(String[] args) {
		  
       Return.ram() ;
         System.out.println(Return.ram() );
	}

}
