package www.acharya.thiskeyword;

class Demo
{
	Demo()
	{
		System.out.println("hello a");
	}
	Demo(int x)
	{
		this();
		System.out.println(x);
	}
}

class TestThis5 {
	public static void main(String srgs[])
	{
		Demo a= new Demo(10);
	}}
