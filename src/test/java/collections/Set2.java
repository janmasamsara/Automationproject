package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
	Set<Integer> s=new LinkedHashSet<Integer>();
	s.add(31);
	s.add(21);
	s.add(41);
	s.add(51);
	s.add(11);
	s.add(81);
	s.add(91);
	System.out.println("set data: "+s);
	Iterator itr=s.iterator();
	System.out.println("The new data values are:");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	}

}
