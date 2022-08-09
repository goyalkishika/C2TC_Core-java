package www.acharya.streamapi;

import java.util.Arrays;
import java.util.List;

public class ex7 {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		list.forEach(System.out::println);
		list.stream().limit(4).forEach(System.out::println);
	}

}
