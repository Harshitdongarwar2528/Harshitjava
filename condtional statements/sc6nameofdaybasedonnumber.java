import java.util.*;
public class sc6nameofdaybasedonnumber {
    public static void main (String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of your choice");
        int day=sc.nextInt();

        if(day==1)
        {
            System.out.println("the day is monday");
        }
        else if (day==2)
        {
            System.out.println("the day is tuesday");
        }
        else if (day==3)
        {
            System.out.println("the day is wednesday");
        }
        else if (day==4)
        {
            System.out.println("the day is thursday");
        }
        else if (day==5)
        {
            System.out.println("the day is friday");
        }
        else if (day==6)
        {
            System.out.println("the day is saturday");
        }
        else if (day==7)
        {
            System.out.println("the day is sunday");
        }
        else
        {
            System.out.println("invalid number");
        }

    }
}
