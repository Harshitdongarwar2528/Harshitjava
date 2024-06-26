import java.util.*;
public class displaydigits {
   public static void main (String[]args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number ");
       int n=sc.nextInt();
       int r;

       while (n>0)
       {
           r=n%10;
           n=n/10;
           System.out.println(r);
       }

   }
}
