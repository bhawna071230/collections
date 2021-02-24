package collections;

import java.util.ArrayList;
class student{
	int rollnum;
	String name;
}

public class List {
	public static void main(String args[]) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("john");
		obj.add("riya");
		obj.add("ashi");
		obj.add("joy");
		obj.add("riya");
		ArrayList obj1 = new ArrayList();
		
		student s1 = new  student();
		
		s1.rollnum = 45;
		s1.name = "mike";
		
		obj1.add(12);
		obj1.add("falak");
		obj1.add(23.55);
		obj1.add("riya");
		obj1.add("gigi");
		obj1.add(s1);
		System.out.println("list one  ="+obj);
		System.out.println("list2 ="+obj1);
		//--------------------
		obj1.remove(3);
		System.out.println("after updating list2 the results are"+obj1);
		//-----------------
		String r =obj.get(2);
		System.out.println(r);
		//----------
		obj1.set(4, "pragya");
		System.out.println("after updating list2 the results are"+obj1);
		
		//----------
		if(obj.contains("riya")) {
			System.out.println("riya is in the list");
		}
		
		//------------
		for(String str:obj) {
			System.out.println(str);
		}
		
		
		
		
		
	}

}
