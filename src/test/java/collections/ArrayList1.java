package collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//i am defining Arraylist as string,we can give int,float..
		ArrayList<String> list=new ArrayList<String>();
		//adding object in Arraylist
		list.add("Raj");
		list.add("virat");
		list.add("stella");
		list.add("smith");
		list.add("123");
		//get method takes integer  as parameter
		System.out.println(list.get(1));
	}

}
