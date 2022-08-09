package www.acharya.multithreading;

class Eclipse implements Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
		}
	}
}
class PPT implements Thread {
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPT thread ID is"+" "+Thread.currentThread().getId());
		}
	}
}
public class ex4 {
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		Thread t= new Thread((Runnable) obj);
		t.start();
		PPT obj1 = new PPT();
		Thread t1= new Thread((Runnable) obj1);
		t1.start();
	}

}
