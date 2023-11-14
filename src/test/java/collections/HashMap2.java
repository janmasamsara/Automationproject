package collections;
//remove values from the HashMap
import java.util.HashMap;

public class HashMap2 {
public static void main(String args[])
{
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(100,"Amit");
	map.put(101,"vijay");
	map.put(102,"Rahul");
	map.put(103,"Gaurav");
	System.out.println("Initial list of elements: "+map);
	//key-based removal
	map.remove(100);//blind removal
	System.out.println("updated list of elements: "+map);
	//key-value pair based removal
	map.remove(102,"Rahul");//method overloading
	map.remove(102,"sony");//condition based remove
	System.out.println("updated list of elements: "+map);
}
}
