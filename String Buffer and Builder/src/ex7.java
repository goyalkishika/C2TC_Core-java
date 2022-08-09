
public class ex7 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my Fav Language");
		System.out.println(sb.capacity());
	}

}
