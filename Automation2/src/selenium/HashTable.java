package selenium;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String>htable=new Hashtable<Integer,String>();
		htable.put(1, "krushna");
		//htable.put(null, null);     //not accept null value
		htable.put(2, "balaji");    // accept unique value  when u enter duplicate value then hi replace new value with old value 
		htable.put(2, "sirsakar");
		 System.out.println(htable.get(2));       //we can ftech deta for key 
		  System.out.println(  htable.get(1));
		  System.out.println(htable.size());          //  give size of table 

	}

}
