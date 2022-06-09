package access_modifiers_demo;

public class test1 {
public int i=10;
public void show() {
	System.out.println("Hello World");
}
	public static void main(String[] args) {
		test1 t1=new test1();
		t1.show();
		System.out.println(t1.i);
		}

}
