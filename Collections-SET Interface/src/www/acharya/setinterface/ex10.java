package www.acharya.setinterface;

import java.util.SortedSet;

public class ex10 {

	public static void main(String[] args) {

        SortedSet<String> sites = new TreeSet<>(); 
        sites.add("Technical"); 
        sites.add("Technology"); 
        sites.add("quiz"); 
        sites.add("code"); 
       System.out.println(sites); 
        SortedSet<String> beforeQuiz = sites.headSet("quiz"); // strictly less SortedSet<String> afterCode = sites.tailSet("quiz");//strictly greater than or equalto 
        System.out.println(beforeQuiz);
        char[] afterCode;
		System.out.println(afterCode); 
        System.out.println(sites);
    

	}

}
