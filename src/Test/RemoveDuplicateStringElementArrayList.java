package Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateStringElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> list = new ArrayList<String>();  
	        list.add("Mango");  
	        list.add("Banana");  
	        list.add("Mango");  
	        list.add("Apple");  
	        System.out.println(list.toString());  
	        Set<String> set = new LinkedHashSet<String>(list);  
	        System.out.println(set); 

	}

}
