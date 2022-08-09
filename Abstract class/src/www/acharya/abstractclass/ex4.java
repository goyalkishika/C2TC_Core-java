package www.acharya.abstractclass;

abstract class Bike {
	Bike() {
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
}
class Honda extends Bike {
	void run() {
		System.out.println("Running Safely");
	}
}
class Demo {
	public static void main(String args[]) {
		Honda h= new Honda();
		h.run();
		h.changeGear();

	}

}
