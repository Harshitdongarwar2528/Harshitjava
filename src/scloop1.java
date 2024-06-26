import java.util.*;
public class scloop1 {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        for (int i=1; i<=100;i++)
        {
            System.out.println(n + "x" + +i+" = "+n*i);
        }
    }
}


