package collections;
//Traversing through for-each loop
import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ravi");
		list.add("vijay");
		list.add("ravi");
		list.add("ajay");
		//Traversing list through for-each loop
		for(String a:list)
		{
			System.out.println(a);
		}
		

	}

}
