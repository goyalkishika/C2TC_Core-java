package www.acharya.listinterface;

import java.util.Map;
import java.util.HashMap;
public class ex6
{        
	public static void main(String [] args)
      {               
          Map<String,String> map=new HashMap<>();
        	map.put("Name","Tanay");
        	map.put("500","Engineer");
        	map.put("Country","India");
        	System.out.println(map.get(500));


}
