package collections;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ravi");
		list.add("raj");
		list.add("swathi");
		list.add("kavya");
		list.add("dhoni");
		System.out.println("An initial elements in the list: "+list);
		//Removing specific element from the ArrayList,using text[String] as parameter
		list.remove("ravi");
		System.out.println("After removing element(text) in the list: "+list);
		//Removing specific element from the Arraylist,using index as parameter
		list.remove(1);
		System.out.println("After removing element(index) in the list: "+list);
		//creating Another list
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("ravi");
		list1.add("hema");
		//adding new elements to the existing Arraylist(list)
		list.addAll(list1);
		System.out.println("print  the updated list: "+list);
		//Removing all the elements from the Arraylist(list1)
		list.removeAll(list1);//blind remove/clear
		System.out.println("After invoking removeAll() method: "+list);
		
		//Removing elements on the basis of specified condition
		list.removeIf(str->str.contains("ravi")); //using lambda expression
		//xpath->//a[contains(text(),"ravi")]
		System.out.println("after invoking removeIf() method: "+list);
		//Removing all elements available in the list
		/*
		list.clear();
		System.out.println("after invoking clear() method: "+list);
		*/
		
		

	}

}
