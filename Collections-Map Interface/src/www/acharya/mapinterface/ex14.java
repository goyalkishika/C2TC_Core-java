package www.acharya.mapinterface;

import java.util.Collections;
import java.util.List;

public class ex14 {

	public static void main(String[] args) {

	      List<Integer> list = new ArrayList<>(); 
	        list.add(80); 
	        list.add(05); 
	        list.add(32); 
	        list.add(2); 
	      System.out.println("Original List : " + list); 
	        Collections.sort(list,Collections.reverseOrder()); 
	      System.out.println("Rverse List: " + list); 


	}

}
