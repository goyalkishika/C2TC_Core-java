
public class CompanyEx3 {
	String name;

	public static void main(String[] args) {
		Company c1 = new Company();
		c1.name = " C2TC ";
		Company c2 = c1;
		c1 = null;
		System.out.println(c2.name);
		new Company();
		Company c3;
		c3.name = " C2TC ";
		System.out.println(c3.name);
	}
}


