

interface Bike
{
   void getMileage();
}
class R15 implements Bike
{
    void getMileage()
    {
        System.out.print("Mileage is 40 Km/L");
    }
}
public class InterfaceExample{
    public static void main(String args[])
    {
        R15 bike = new R15();
        bike.getMileage();
    }

}
