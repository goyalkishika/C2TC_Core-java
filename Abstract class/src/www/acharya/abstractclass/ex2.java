package www.acharya.abstractclass;

Abstract class shape {
	abstract void draw();
}
class rectangle extends shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class circle extends shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}
class Demo {
	public static void main(String args[]) {
		shape s= new rectangle();
		s.draw();
	
	}

}
