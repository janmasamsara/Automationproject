package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//based on Unicode/Ascii it is sorting
		list.add("Z");
		list.add("a");
		list.add("K");
		list.add("N");
		//list.add(null);-nullpointerException
		System.out.println("Before sorting:"+list);
		Collections.sort(list);
		System.out.println("After sorting: "+list);
		

	}

}
