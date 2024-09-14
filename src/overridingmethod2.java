class car{
    public void start(){System.out.println("car started");}
    public void accelerate(){System.out.println("car is accelerated");}
    public void changeGear(){System.out.println("car gear is changed");}

}
class LuxaryCar extends car
{
    public void chnageGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is opened");}
}
    public class overridingmethod2 {
    public static void main (String []args)
    {
      LuxaryCar c=new LuxaryCar();
      c.start();
      c.accelerate();
      c.changeGear();
      c.openRoof();
    }
}
