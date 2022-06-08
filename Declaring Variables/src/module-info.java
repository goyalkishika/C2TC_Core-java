//Variables & Data Type

//Example1

public class MyClass {
	public static void main(String[] args) {
		String name= "John";
		System.out.println(name);
	}
}

//Example2

public class MyClass {
	public static void main(String[] args) {
		int myNum=15;
		System.out.println(myNum);	
	}
}

//Example4

public class MyClass {
	public static void main(String[] args) {
		String name= 'John';
		System.out.println("Hello "+name);
	}
}

Type Casting

//Example1

public class Main {
	pubic static void main(String[] args) {
		double myInt = 9;
		double myDouble = myInt;
		System.out.println(myDouble);
		System.out.println(myInt);
	}
}

//Example2

public class Main {
	pubic static void main(String[] args) {
		double myDouble = 9.78;
		int myInt= (int)myDouble;
		System.out.println(myDouble);
		System.out.println(myInt);
	}
}

//Guess the output

class Simple {
	public static void main(String[] args) {
		float f= 10.5f;
		int a= (int)f;
		System.out.println(f);
		System.out.println(a);
	}
}

public class Test {
	static void test(float x) {
		System.out.println("float");
	}
	static void test(double x) {
		System.out.println("double");
	}
	static void main(String[] args) {
		test(99.9);
	}
}

public class Test {
	static void main(String[] args) {
		int i= 010;
		int j= 07;
		System.out.println(i);
		System.out.println(j);
	}
}

//Operators in Java

//Unary Operator

class PreAndPostIncrement
{
	public static void main(String[]) {
		int a =5;
		int b=2;
		int c;
		int d;
		c=++b;
		d=a++;
		System.out.ptintln("a="+a,"b="+b,"c="+c,"d="+d);
	}
}

//Comparision Of && and & Operator

public static void main(String args[]) {
	int a=10;
	int b=5;
	int c=20;
	System.out.println(a<b&&a<c);
	System.out.println(a<b&a<c);
	System.out.println(a<b&&a++<c);
	System.out.println(a);
	System.out.println(a<b&a++<c);
	System.out.println(a);
}

//Comparision Of || and | Operator

public static void main(String args[]) {
	int a=10;
	int b=5;
	int c=20;
	System.out.println(a>b||a<c);
	System.out.println(a>b|a<c);
	System.out.println(a>b||a++<c);
	System.out.println(a);
	System.out.println(a>b|a++<c);
	System.out.println(a);
}

//Predict the output

public static void main(String args[]) {
	int a=2;
	int b=5;
	int min=(a<b)?a:b;
	System.out.println(min);
}



int a=5,b=18;
if((a=3)==b)
{
	System.out.println(++a);
}
else {
	System.out.println(++b);
}



class Main{
	public static void main(String[] args) {
		int var1=5;
		int var2=6;
		if((var2=1)==var1)
			System.out.println(var2);
		else
			System.out.println(++var2);
	}
}

//Control Stmt's

//If Stmt

public class Numerics{
	public staic void main(String[] args) {
		int x=10;
		int y=12;
		if(x+y>20) {
			System.out.println("x+y is greater than 20");
		}
	}
}


//If-Else Stmt

public class Language{
	public static void main(String[] args) {
		String Lang="Java";
		if(lang=="Python") 
		{
			System.out.println("language is Python");
		}
		else if(lang=="C++") 
		{
			System.out.println("language is C++");
		}
		else if(lang=="Java") 
		{
				System.out.println("language is Java");
		}
		else {
			System.out.println(lang); }
	}
}


//For loop

class Main{
	public static void main(String[] args) {
		for(int i=0; i<3;i++) {
			System.out.println(i);
		}
	}
}



class Main{
	public static void main(String[] args) {
		for(int i=0; i<3;i++) {
			System.out.println(i);
		}
		System.out.println(i);
	}	
}


class Main{
	public static void main(String[] args) {
		int i;
		for(int i=0; i<3;i++) {
			System.out.println(i);
		}
	}
}


//Nested For loop

public class Main {
	public static void main(String[] args) {
		for(int i=0; i<=3;i++) {
			for(int j=0; j<=3;j++) {
			System.out.println(i+" "+j);
			}
		}
	}
}


//Predict the outut

public class Main{
	public static void main(String[] args) {
		int term=6;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}

//For each loop

public class Main{
	public static void main(String[] args) {
		int arr[]= {12,23,44,56,78};
		for (int i:arr) {
			System.out.print.ln(i);
		}
	}
}

//Break Stmt

for(int i=0;i<=10;i++) {
	System.out.println(i);
	if(i==6) {
		break;
	}
}

//Continue Stmt

for(i=1;i<=5;i++) {
	for(j=1;j<=i;j++) {
		if(j==4) {
			continue;
		}
		System.out.println(j);
	}
}

//Infinite For Loop

public class Main{
	public static void main(String[] args) {
		for(;;) {
			System.out.println("Infinitive Loop");
		}
	}
}


//While loop

public class Main{
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++
		}
	}
}


//Infinite While loop

public class Main{
	public static void main(String[] args) {
		while(true) {
			System.out.println("Infinite while Loop");
		}
	}
}

//do while loop

public class Main{
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println(i);
			i++
		}while(i<=10);
	}
}

//Infinite do while loop

public class Main{
	public static void main(String[] args) {
		do {
			System.out.println("Infinite while Loop");
		}while(true);
	}
}





