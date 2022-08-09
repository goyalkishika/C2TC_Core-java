package www.acharya.lamdaexpressions;

class Eclipse implements Runnable {
	public void run() {
		System.out.println("I ma run method");
	}
}
public class ex11 {
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		Thread t = new Thread(obj);
		t.start();
	}
	interface Lambda {
		public void demo();
	}

	public class multithread {
		public static void main(String[] args) {
			new Thread(() -> { System.out.println("I ma run method"); }).start();
		}
}
