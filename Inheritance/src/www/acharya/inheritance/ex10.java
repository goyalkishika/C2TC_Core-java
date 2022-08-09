package www.acharya.inheritance;

 class Animal {
	Animal()
	{
		System.out.println("Animal is Created");
	}
}
class Dog extends Animal {
	Dog() {
		super();
		System.out.println("Dog is Created");
	}
}
class Demo{
	public static void main(String args[])
	{
		Dog d= new Dog();
	}

}
