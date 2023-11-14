package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//inserting values into the hashmap
				hm.put(100, "amit");
				hm.put(101,"vijay");
				hm.put(102,"Rahul");
				System.out.println("Initial list of elements:");
				for(Map.Entry m:hm.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
				System.out.println("updated list of elements:");
				//blind replace using key
				hm.replace(102,"gaurav");
				for(Map.Entry m:hm.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
				System.out.println("updated list of elements:");
				//conditional replace using key
				hm.replace(101,"vijay","Ravi");
				for(Map.Entry m:hm.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
					
				}
				System.out.println("Updated list of elements:");
				//blind replaces in entire hashmap
				hm.replaceAll((k,v)->"Ajay"); //lambda Expressions
				for(Map.Entry m:hm.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
	}
	
	}

