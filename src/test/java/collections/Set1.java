package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<String>();	
		set.add("java");
		set.add("selenium");
		set.add("Example");
		//set,duplicates are not allowed
		set.add("Example");
		System.out.println(set);
	}

		
}		
