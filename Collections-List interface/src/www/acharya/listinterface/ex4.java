package www.acharya.listinterface;

import java.util.Map;
import java.util.HashMap;
public class ex4
{
   	@SuppressWarnings("unchecked")
	public static void main(String args[])
 	{
           @SuppressWarnings("rawtypes")
		Map ob=new HashMap();
           ob.put(50.55,"professor");
           ob.put("second","berlin");
           ob.put(10,"tokyo");
           ob.put('l',"nairobi");
           System.out.println(ob);	
       }
}


