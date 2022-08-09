package www.acharya.streamapi;

import java.util.Arrays;
import java.util.List;

public class ex10 {
	public static boolean isDivisible(int i) {
		System.out.println("In Divisible "+i);
		return i%5==0;
		
	}
	public static int mapDouble(int i) {
		System.out.println("In mapDouble "+i);
		return i*2;
		
	}
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,20,35,46,55,68,75);		
		System.out.println(list.stream().filter(ex10 :: isDivisible).map(ex10 :: mapDouble).findFirst().orElse(0));
	}

}
