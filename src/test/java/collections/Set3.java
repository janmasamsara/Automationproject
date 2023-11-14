package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set3 {
		public static void main(String[] args) {
			Set<Integer> s=new LinkedHashSet<Integer>();
			s.add(31);
			s.add(21);
			s.add(41);
			s.add(51);
			s.add(11);
			s.add(81);
			if(!s.contains(91))
			{
				s.add(91);
			}
			else
			{
				System.out.println("element is exists in Data");
			}
			//contains() returns true or false
			System.out.println("set: "+s);
			//contains() returns true or false
			System.out.println("Does the set contains '91' ?" +s.contains(91));
			System.out.println("Does the set contains 'javatpoint' ?" +s.contains("4"));
			System.out.println("Does the set contains '51' ?" +s.contains(51));
			//clear method to clear all the elements in the set
			s.clear();
			System.out.println("set after clear method:"+s);
			
		}

}
