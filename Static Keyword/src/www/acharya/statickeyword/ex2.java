package www.acharya.statickeyword;

2 class Student {
	int rollno;
	String name;
	static String college = "ITS";
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	static void change() {
		college = "BBDIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String args[]) {
		Student s1= new Student(111,"Karan");
		Student s2= new Student(222,"Aryan");
		change();
		s1.dispaly();
		s2.display();
		}

}
