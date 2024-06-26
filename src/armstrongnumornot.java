import java.util.*;
public class armstrongnumornot {
    public static void main (String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number of your choice ");
        int n=sc.nextInt();
        int r;
        int sum=0;
        int m=n;

        while (n>0)
        {
           r=n%10;

           sum=sum+r*r*r;
           n=n/10;
        }
        System.out.println(sum);
        if (m==sum)
        {
            System.out.println("it is an armsstrong number");
        }
        else {
            System.out.println("not a armstrong number");
        }

    }
}
