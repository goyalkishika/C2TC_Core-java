
interface Bike
{
   void getMileage();
}
class R15 implements Bike
{
    public void getMileage()
    {
    System.out.print("Mileage is 40 Km/L");
    }
}
public class InterfaceExample{
    public static void main(String args[])
    {
        Bike bike = new Bike();
        bike.getMileage();
    }


}
