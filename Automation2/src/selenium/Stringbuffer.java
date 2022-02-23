package selenium;

public class Stringbuffer {
         public static void main(String[] args) {
			 String s=new String("krushna");
			
			System.out.println(s.concat("raj"));
			System.out.println(s);
			
			StringBuffer s1 =new StringBuffer("velocity");
			System.out.println(s1.append("katraj"));
			System.out.println(s1);
			
			StringBuilder s2= new StringBuilder("testing");
			System.out.println(s2.append("class"));
		}
}
