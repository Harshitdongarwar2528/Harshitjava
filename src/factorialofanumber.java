import java.util.*;
public class factorialofanumber {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        long fact=1;

        for (int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("FACTORIAL IS "+fact);
    }
}
