package www.acharya.lamdaexpressions;

import java.util.ArrayList;
public class ex10 {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Lekha");
		obj.add("Leema");
		obj.add("Pooja");
		obj.add("Hema");
		obj.forEach(temp -> System.out.println(temp));
	}

}
