package www.acharya.thiskeyword;

class S2 {
	void m(S2 a) {
		System.out.println("Method is invoked");
	}
	void p() {
		m(this);
	}
}

class Main{
	public static void main(String args[]) {
		S2 s1 = new S2();
		s1.p();
	

	}

}
