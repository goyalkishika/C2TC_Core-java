package www.acharya.multithreading;
class counter {
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class ex8 {
	public static void main(String[] args) throws Exception {
		Thread c= new Thread(new Runnable() {
			public void run() {
				((counter) c).increment();
			}
		});
		t1.start();
		t1.join();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				((counter) c).increment();
			}
		});
		t1.start();
		t1.join();
		System.out.println(c.count);
	}


}
