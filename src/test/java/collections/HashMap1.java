package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
//inserting values into the hashmap
		hm.put(100, "amit");
		hm.put(101,"vijay");
		hm.put(102,"amit");
		hm.put(0, "yoga"); //one null key
		hm.put(107," ");
		//multiple null values
		hm.put(104," ");
		for(Map.Entry m:hm.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		//condition insertion in hashmap
		hm.putIfAbsent(103,"yoga");
		System.out.println("After insert putIfAbsent() method");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		}

}
