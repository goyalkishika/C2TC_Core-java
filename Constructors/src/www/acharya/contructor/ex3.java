package www.acharya.contructor;

public class ex3 {
	int id;
    String name;
    float salary;
    
     Employee(int  id,  String  name,  float salary) {
        System.out.println("user defined no-argument "
        + "constructor executed");
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);


}
