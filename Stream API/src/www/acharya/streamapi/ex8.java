package www.acharya.streamapi;

import java.util.Arrays;
import java.util.List;

public class ex8 {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,5,6,4,3);
		
		list.stream().distinct().forEach(System.out::println);
	}

}
