import java.util.*;
public class reverseanumber {
    public static void main (String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enetr a number ");
        int n= sc.nextInt();
        int r;
        int rev=0;


        while (n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("its reverse number is "+rev);


    }
}
