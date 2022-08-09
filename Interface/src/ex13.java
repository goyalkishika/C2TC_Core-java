
interface Interface1
{
   public void myMethod();
}
interface Interface2
{
   public void myMethod();
}
public class ex13 implements Interface1, Interface2
{
   public void myMethod()
   {
   System.out.println("Implementing more than one interfaces");
   }
   public static void main(String args[])
   {
	   ex13 obj = new ex13();
	   obj.myMethod();
   } 


}
