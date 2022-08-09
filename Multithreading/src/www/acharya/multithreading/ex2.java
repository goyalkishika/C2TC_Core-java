package www.acharya.multithreading;

class Eclipse implements Runnable {
	public void run() {
		System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
	}
}
class PPT implements Thread {
	public void run() {
		System.out.println("PPT thread ID is"+" "+Thread.currentThread().getId());
	}
}
public class ex2 {
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		Thread t= new Thread(obj);
		t.start();
		PPT obj1 = new PPT();
		Thread t1= new Thread();
		t1.start();
	}


}
