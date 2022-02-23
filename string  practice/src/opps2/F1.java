package opps2;

public    class F1 {     // final  class cant not inherits in subclass 
        int a =55;  // we can not change value of final int 
       int b=6;
       
        
        public  final  void test ()  //final method can inherits but do not override 
        {
    
        	final int c = a*b;
        	System.out.println(c);
        	
        }   
        
        public  static void main(String[] args) {
			F1 obj = new F1();
			obj.test();
			
		}
        
        		
        		
}
