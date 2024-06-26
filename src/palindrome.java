import java.util.*;

public class palindrome {
    public static void main (String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enetr a number ");
        int n= sc.nextInt();
        int r;
        int rev=0;
        int m=n;


        while (n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }


        if (rev==m)
        {
            System.out.println("It is a palindrome ");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }


    }
}

