package collections;
import java.util.Map; 
import java.util.HashMap; 
import java.util.Iterator; 

public class mapIterat {
		public static void main(String[] arg) 
		{ 
			Map<String,String> f = new HashMap<String,String>();  
			f.put("bhawma", "bareilly"); 
			f.put("shruti", "Doon"); 
			f.put("molu", "jaipur"); 
			f.put("shivani", "cdg"); 
			
			// using iterators 
			Iterator<Map.Entry<String, String>> itr = f.entrySet().iterator(); 
			
			while(itr.hasNext()) 
			{ 
				Map.Entry<String, String> entry = itr.next(); 
				System.out.println("Key = " + entry.getKey() + 
									", Value = " + entry.getValue()); 
			} 
		} 
	} 


