package www.acharya.listinterface;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ex8
{        
    	public static void main(String [] args)
    	{               
        Map<String,String> map=new HashMap<String,String>();
	       map.put("Name","Arun Kumar");
        	map.put("Occupation","Developer");
        	map.put("Country","India");
        	System.out.println(map.get("Name"));
     Iterator keySetIterator = map.keySet().iterator();
        	while(keySetIterator.hasNext())
       	{
            	String key = keySetIterator.next();
            	System.out.println(key +" " + map.get(key));
        	}
    	}


}
