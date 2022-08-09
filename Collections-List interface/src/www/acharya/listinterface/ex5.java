package www.acharya.listinterface;
import java.util.Map;
import java.util.HashMap;
public class Mapinterface
{        
	public static void main(String [] args)
      {               
         Map<String,String> map=new HashMap<>();
        	map.put("Name","Tanay");
        	map.put("Occupation","Engineer");
        	map.put("Country","India");
        	System.out.println(map.get("Salary"));
	}
}
