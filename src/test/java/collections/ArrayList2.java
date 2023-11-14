package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("kohil");
		list.add("dell");
		list.add("swecha");
		list.add("swathi");
		list.add("12");
		//collection concept we use Iterator
		//while loop is to check conditional 
		//Traversing list through Iterator(looping)
		Iterator itr=list.iterator();
		//it is checking the condition that list contains element are not
		//first kohil will print,then it checks there is  an element
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}		
	}

}
