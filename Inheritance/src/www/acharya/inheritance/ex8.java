package www.acharya.inheritance;

class Animal {
	String color="white";
}
class Dog extends Animal {
String color="black";
void printColor() {
	System.out.println(color);
	System.out.println(super.color);
}

}
